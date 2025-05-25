package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFlightPage extends JFrame {

    private JPanel addPanel;
    private JTextField flightNumField;
    private JTextField airCompField;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField departureField;
    private JTextField arrivingField;
    private JButton addBtn;
    private JButton backBtn;

    public AddFlightPage() {
        setTitle("AGGIUNGI VOLO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(addPanel);
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Volo aggiunto con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
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
