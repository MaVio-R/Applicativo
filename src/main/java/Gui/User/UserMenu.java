package Gui.User;

import Gui.HomeWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends JFrame {

    private JPanel userPanel;
    private JButton bookBtn;
    private JButton seeBookBtn;
    private JButton reportBtn;
    private JButton exitBtn;

    public UserMenu() {
        setTitle("HOME PAGE");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(userPanel);
        bookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                            BookMenu bookMenu = new BookMenu();
                            bookMenu.setVisible(true);
            }
        });

        seeBookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BookedPage bookedPage = new BookedPage();
                bookedPage.setVisible(true);
            }
        });
        reportBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            LuggageReportPage luggageReportPage = new LuggageReportPage();
            luggageReportPage.setVisible(true);
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
