package Gui.Admin;

import Gui.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends JFrame {

    private JPanel adminPanel;
    private JButton newFlightBtn;
    private JButton updateBtn;
    private JButton viewBtn;
    private JButton deleteBtn;
    private JButton lostBtn;
    private JButton updateLostBtn;
    private JButton exitBtn;

    public AdminMenu() {
        setTitle("GESTIONE INTERNA");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(adminPanel);

        newFlightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            AddFlightPage addFlightPage = new AddFlightPage();
            addFlightPage.setVisible(true);
            }
        });

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            UpdateFlightPage updateFlightPage = new UpdateFlightPage();
            updateFlightPage.setVisible(true);
            }
        });

        viewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdminAllFlightPage adminAllFlightPage = new AdminAllFlightPage();
                adminAllFlightPage.setVisible(true);
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            DeleteFlightPage deleteFlightPage = new DeleteFlightPage();
            deleteFlightPage.setVisible(true);

            }
        });

        lostBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            LostListPage lostListPage = new LostListPage();
            lostListPage.setVisible(true);
            }
        });


        updateLostBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            UpdateLuggagePage updateLuggagePage = new UpdateLuggagePage();
            updateLuggagePage.setVisible(true);
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
