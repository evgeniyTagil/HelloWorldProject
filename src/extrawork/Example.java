package extrawork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame{
    private JButton okButton;
    private JTextField полеДляЛогинаTextField;
    private JPasswordField passwordField1;
    private JPanel panel;

    public Example() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("someone clicked");
                JOptionPane.showMessageDialog(okButton,"HI " + полеДляЛогинаTextField.getText());
            }
        });
    }

    public static void main(String[] args) {
        Example form = new Example();
        form.setTitle("This is my APP");
        form.setContentPane(form.panel);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setSize(300,150);
        form.setVisible(true);

    }
}
