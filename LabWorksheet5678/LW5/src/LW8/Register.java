package LW8;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Register extends JFrame implements ActionListener {

    private final Container container;
    private final JLabel title;
    private final JLabel name;
    private final JTextField tname;
    private final JLabel email;
    private final JTextField temail;
    private final JLabel gender;
    private final JRadioButton male;
    private final JRadioButton female;
    private final ButtonGroup gengp;
    private final JLabel Birthday;
    private final JComboBox date;
    private final JComboBox month;
    private final JComboBox year;
    private final JLabel pass;
    private final JPasswordField tpass;
    private final JCheckBox term;
    private final JButton sign;
    private final JLabel oemail;
    private final JTextField otemail;
    private final JLabel opass;
    private final JPasswordField otpass;
    private final JButton signi;
    private final JLabel ttitle;



    private final String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private final String[] months = {"Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec"};
    private final String[] years = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};

    public Register() {
        setTitle("Registration Form");
        setBounds(300, 90, 500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setForeground(Color.blue);
        title.setSize(300, 30);
        title.setLocation(200, 30);
        container.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(50, 100);
        container.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(150, 100);
        container.add(tname);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(50, 150);
        container.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(150, 150);
        container.add(temail);



        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(50, 200);
        container.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(150, 200);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(225, 200);
        container.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        Birthday = new JLabel("Birthday");
        Birthday.setFont(new Font("Arial", Font.PLAIN, 20));
        Birthday.setSize(100, 20);
        Birthday.setLocation(50, 250);
        container.add( Birthday);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(150, 250);
        container.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(200, 250);
        container.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(270, 250);
        container.add(year);

        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 20);
        pass.setLocation(50, 300);
        container.add(pass);

        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(150, 300);
        container.add(tpass);

        term = new JCheckBox("I am not a robot.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(50, 350);
        container.add(term);

        sign = new JButton("Sign Up");
        sign.setFont(new Font("Arial", Font.PLAIN, 15));
        sign.setSize(440, 40);
        sign.setLocation(20, 380);
        sign.addActionListener(this);
        sign.setForeground(Color.white);
        sign.setBackground(Color.blue);
        container.add(sign);

        ttitle = new JLabel("Sign In");
        ttitle.setFont(new Font("Arial", Font.PLAIN, 25));
        ttitle.setForeground(Color.blue);
        ttitle.setSize(300, 30);
        ttitle.setLocation(200, 430);
        container.add(ttitle);

        oemail = new JLabel("Email");
        oemail.setFont(new Font("Arial", Font.PLAIN, 20));
        oemail.setSize(100, 20);
        oemail.setLocation(50, 480);
        container.add(oemail);

        otemail = new JTextField();
        otemail.setFont(new Font("Arial", Font.PLAIN, 15));
        otemail.setSize(190, 20);
        otemail.setLocation(150, 480);
        otemail.setEditable(false);
        container.add(otemail);

        opass = new JLabel("Password");
        opass.setFont(new Font("Arial", Font.PLAIN, 20));
        opass.setSize(100, 20);
        opass.setLocation(50, 530);
        container.add(opass);

        otpass = new JPasswordField();
        otpass.setFont(new Font("Arial", Font.PLAIN, 15));
        otpass.setSize(190, 20);
        otpass.setLocation(150, 530);
        otpass.setEditable(false);
        container.add(otpass);

        signi = new JButton("Sign In");
        signi.setFont(new Font("Arial", Font.PLAIN, 15));
        signi.setSize(440, 40);
        signi.setLocation(20, 580);
        signi.addActionListener(this);
        signi.setForeground(Color.white);
        signi.setBackground(Color.blue);
        container.add(signi);






    }



    @Override
    public void actionPerformed(ActionEvent e) {

        // -------- SIGN UP --------
        if (e.getSource() == sign) {

            if (term.isSelected()) {
                String email = temail.getText();
                String password = new String(tpass.getPassword());

                otemail.setText(email);
                otpass.setText(password);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Please confirm you are not a robot!");
            }
        }


        if (e.getSource() == signi) {

            String def = "";

            tname.setText(def);
            temail.setText(def);
            tpass.setText(def);

            otemail.setText(def);
            otpass.setText(def);



            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
    }

}





