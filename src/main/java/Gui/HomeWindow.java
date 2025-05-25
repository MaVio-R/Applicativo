package Gui;

import Controller.Controller;
import Gui.Admin.*;
import Gui.User.*;
import Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindow extends JFrame {

    private JPanel homePanel;
    private JLabel welcomeLabel;
    private JLabel textLabel;
    private JLabel logLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField OpCodeField;
    private JButton logInButton;
    private JButton registerButton;
    private JButton temporaryAdminMenuButtonButton;
    private JButton exitBtn;
    private Controller controller;

    public HomeWindow() {
        controller = new Controller();
        setTitle("AEROPORTO INTERNAZIONALE DI NAPOLI");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(homePanel);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (controller.login(username, password)) {
                    UserMenu userMenu = new UserMenu();
                    userMenu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "CREDENZIALI NON VALIDE");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RegisterPage registerPage = new RegisterPage();
                registerPage.setVisible(true);
            }
        });
        temporaryAdminMenuButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            AdminMenu adminMenu = new AdminMenu();
            adminMenu.setVisible(true);
            }
        });

    }
}
