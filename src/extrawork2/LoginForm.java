package extrawork2;

import extrawork.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JPanel panel;
    private JButton loginButton;

    private HelloForm helloForm;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                System.out.println(text);
                LoginForm.super.setVisible(false);
                helloForm = new HelloForm(LoginForm.this, getDoctorByPlan(text));

            }
        });
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("This is my APP");
        form.setContentPane(form.panel);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setSize(300, 150);
        form.setResizable(false);
        form.setLocation(600, 200);
        form.setVisible(true);
    }

    private static String getDoctorByPlan(String plan) {
        if (plan.equals("1")) return "you need to visit our Therapist";
        if (plan.equals("2")) return "you need to visit our Dentist";
        if (plan.equals("3")) return "you need to visit our Surgeon";
        return "you need to go Okulist, there is not a correct option";
    }
}
