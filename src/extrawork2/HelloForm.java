package extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JPanel panel1;
    private JLabel label;
    private JButton backToMenuButton;

    private LoginForm loginForm;

    public HelloForm(LoginForm loginForm, String text) {
        this.setTitle("This is my APP");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocation(600, 200);
        this.label.setText(text);
        this.loginForm = loginForm;
        this.setVisible(true);
        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);
            }
        });
    }
}
