package Gui.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookMenu extends JFrame {

    private JPanel bookPanel;
    private JButton bookBtn;
    private JButton backBtn;
    private JTable flightTable;
    private JScrollPane scrollPane;

    public BookMenu() {
        setTitle("PRENOTA IL TUO VOLO");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(bookPanel);

        

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });

        bookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Prenotazione avvenuta con successo", "OPERAZIONE RIUSCITA", JOptionPane.INFORMATION_MESSAGE);
                UserMenu userMenu = new UserMenu();
                userMenu.setVisible(true);
                dispose();
            }
        });
    }

}
