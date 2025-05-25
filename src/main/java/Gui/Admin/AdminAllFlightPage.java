package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminAllFlightPage extends JFrame {

    private JPanel bookPanel;
    private JButton backBtn;
    private JTable flightTable;
    private JScrollPane scrollPane;
    private JPanel bookablePanel;


    public AdminAllFlightPage() {
        setTitle("VOLI PRESENTI");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(bookablePanel);


        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            }
        });

    }

}
