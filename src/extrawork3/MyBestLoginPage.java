package extrawork3;

import lesson11.WrongLoginException;
import lesson11.WrongPasswordException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestLoginPage extends JFrame {
    private JPanel panel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton button1;

    public MyBestLoginPage() {
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredentials(loginField.getText(), passwordField.getText());
                    JOptionPane.showMessageDialog(MyBestLoginPage.this,"Login and password are correct");
                } catch (WrongLoginException ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this,ex.getMessage(),"Oops, something bad with login",JOptionPane.ERROR_MESSAGE);
                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this,ex.getMessage(),"Oops, something bad with password",JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this,ex.getMessage(),"Access denied",JOptionPane.WARNING_MESSAGE);
            }
            }
        });
    }

    public static void main(String[] args) {
        MyBestLoginPage form = new MyBestLoginPage();
        form.setTitle("This is my APP");
        form.setContentPane(form.panel);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setSize(270, 120);
        form.setResizable(false);
        form.setLocation(600, 200);
        form.setVisible(true);

    }

    private static boolean checkCredentials(String login, String password) throws Exception {
        String correctLogin = "Super";
        String correctPassword = "puper";
        if (login.length() < 3) throw new WrongLoginException("Login is to short");
        if (password.length() < 3) throw  new WrongPasswordException("Password is to short");
        if (login.equals(correctLogin) && password.equals(correctPassword)) return true;
        throw new Exception("Login or password are incorrect");
    }
}
