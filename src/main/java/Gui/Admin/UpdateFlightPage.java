package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateFlightPage extends JFrame{

    private JPanel updatePanel;
    private JTextField flightNumField;
    private JTextField statusField;
    private JTextField gateField;
    private JTextField newTimeField;
    private JButton updateBtn;
    private JButton backBtn;

    public UpdateFlightPage() {
        setTitle("AGGIORNA IL VOLO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(updatePanel);

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Aggiornamento avvenuto con successo", "OPERAZIONE RIUSCITA ", JOptionPane.INFORMATION_MESSAGE);
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            }
        });

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
