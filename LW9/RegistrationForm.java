package LW9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField tname;
    JRadioButton male, female;
    JComboBox<String> date, month, year;
    JCheckBox term;
    JButton submit;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel name = new JLabel("Name");
        name.setBounds(50,50,100,20);
        add(name);

        tname = new JTextField();
        tname.setBounds(150,50,150,20);
        add(tname);

        male = new JRadioButton("Male", true);
        female = new JRadioButton("Female");
        male.setBounds(150,80,70,20);
        female.setBounds(220,80,80,20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male); bg.add(female);
        add(male); add(female);

        date = new JComboBox<>(new String[]{"1","2","3"});
        month = new JComboBox<>(new String[]{"Jan","Feb","Mar"});
        year = new JComboBox<>(new String[]{"2000","2001","2002"});
        date.setBounds(150,110,50,20);
        month.setBounds(205,110,60,20);
        year.setBounds(270,110,70,20);

        add(date); add(month); add(year);

        term = new JCheckBox("Accept Terms");
        term.setBounds(150,150,150,20);
        add(term);

        submit = new JButton("Submit");
        submit.setBounds(150,190,100,30);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!term.isSelected()) {
            JOptionPane.showMessageDialog(this,"Accept Terms!");
            return;
        }

        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO users(name, gender, dob) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tname.getText());
            ps.setString(2, male.isSelected() ? "Male" : "Female");
            ps.setString(3,
                    date.getSelectedItem()+"/"+
                            month.getSelectedItem()+"/"+
                            year.getSelectedItem()
            );

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Registration Saved!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
