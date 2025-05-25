package Gui.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LostListPage extends JFrame{

    private JPanel lostPanel;
    private JTable table1;
    private JButton backBtn;

    public LostListPage() {
        setTitle("LISTA BAGAGLI SMARRITI");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        add(lostPanel);

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
