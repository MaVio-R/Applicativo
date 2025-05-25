package Gui.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LuggageReportPage extends JFrame {

    private JPanel reportPanel;
    private JTextField bookCodeField;
    private JTextField ticketField;
    private JTextField seatField;
    private JButton backBtn;
    private JButton reportBtn;

    public LuggageReportPage() {
        setTitle("SEGNALA LO SMARRIMENTO DEL TUO BAGAGLIO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(reportPanel);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });

        reportBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Segnalazione avvenuta con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });
    }
}
