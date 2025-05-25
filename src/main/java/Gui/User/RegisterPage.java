package Gui.User;

import Gui.HomeWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JFrame{
    private JPanel RegisterPanel;
    private JTextField usernameField;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JButton confirmButton;
    private JTextField surnameField;
    private JTextField dobField;
    private JTextField ssnField;
    private JTextField emailField;
    private JTextField numberField;
    private JButton exitBtn;

    public RegisterPage() {

        setTitle("REGISTRATI");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(RegisterPanel);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                HomeWindow homeWindow = new HomeWindow();
                homeWindow.setVisible(true);
                dispose();
            }
        });
    }
}
