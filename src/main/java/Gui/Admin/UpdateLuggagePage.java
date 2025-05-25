package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateLuggagePage extends JFrame {
    private JPanel UpdateLuggagePanel;
    private JTextField NumField;
    private JTextField statusField;
    private JButton updateBtn;
    private JButton backBtn;

    public UpdateLuggagePage() {

        setTitle("AGGIORNA LO STATO DEL BAGAGLIO SMARRITO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(UpdateLuggagePanel);

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Aggiornamento avvenuto con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
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
