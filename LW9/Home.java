package LW9;

import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        setTitle("Home");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        add(back);

        back.addActionListener(e -> {
            new SignUp();
            dispose();
        });

        setVisible(true);
    }
}
