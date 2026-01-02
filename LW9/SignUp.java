package LW9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener {

    JTextField email;
    JPasswordField pass;
    JButton signup, signin;

    public SignUp() {
        setTitle("Sign Up");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel e = new JLabel("Email");
        e.setBounds(50,50,100,20);
        add(e);

        email = new JTextField();
        email.setBounds(150,50,150,20);
        add(email);

        JLabel p = new JLabel("Password");
        p.setBounds(50,90,100,20);
        add(p);

        pass = new JPasswordField();
        pass.setBounds(150,90,150,20);
        add(pass);

        signup = new JButton("Sign Up");
        signup.setBounds(50,150,100,30);
        signup.addActionListener(this);
        add(signup);

        signin = new JButton("Sign In");
        signin.setBounds(200,150,100,30);
        signin.addActionListener(this);
        add(signin);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == signup) {
            try (Connection con = DBConnection.getConnection()) {

                String sql = "INSERT INTO users(email, password) VALUES (?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, email.getText());
                ps.setString(2, new String(pass.getPassword()));
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this,"Sign Up Successful!");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == signin) {
            try (Connection con = DBConnection.getConnection()) {

                String sql = "SELECT * FROM users WHERE email=? AND password=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, email.getText());
                ps.setString(2, new String(pass.getPassword()));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    new Home();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this,"Invalid Login!");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
