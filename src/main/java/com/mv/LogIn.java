package main.java.com.mv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Log-in window.
 * Created by Dimon on 20.04.2015.
 */
public class LogIn extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton buttonLogIn;
    private JLabel registration;
    private JPanel rootPanel;

    public LogIn(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // experiment
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            e.printStackTrace();
        }
        setContentPane(rootPanel);
        setBounds(590, 380, 380, 140);
        setVisible(true);
        registration.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
                // TODO: run Registration window
            }
        });
        buttonLogIn.addActionListener(e -> {
            if (!Adds.checkLogin(textField1.getText())) return;
            if (!Adds.checkPassword(passwordField1.getPassword())) return;
            // TODO: check for existing account
            System.exit(0);
            // TODO: log-in action: run MainForm
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(LogIn::new);
    }
}
