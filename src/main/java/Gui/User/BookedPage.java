package Gui.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookedPage extends JFrame {

    private JPanel bookedPanel;
    private JTable table1;
    private JButton backBtn;
    private JButton deleteBtn;

    public BookedPage() {
        setTitle("LE TUE PRENOTAZIONI");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(bookedPanel);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });
        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Prenotazione eliminata con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });
    }
}
