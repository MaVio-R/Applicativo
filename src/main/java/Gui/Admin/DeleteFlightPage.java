package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteFlightPage extends JFrame{
    private JPanel deletePanel;
    private JTable deletableTable;
    private JButton deleteBtn;
    private JButton backBtn;
    private JScrollPane scrollPane;

    public DeleteFlightPage() {
        setTitle("ELIMINA VOLO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(deletePanel);


        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Volo eliminato con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
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
