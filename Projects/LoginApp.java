// Import necessary Swing and AWT libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp {
    public static void main(String[] args) {
        // Create the login frame
        JFrame frame = new JFrame("Login Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);  // Set frame size
        frame.setLayout(new BorderLayout());

        // Create the panel for user input
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create labels and text fields for username and password
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Add labels and text fields to the panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);

        // Create login button
        JButton loginButton = new JButton("Login");

        // Add panel and button to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(loginButton, BorderLayout.SOUTH);

        // Login button action listener
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();           // Get username input
                String password = new String(passField.getPassword());  // Get password input

                // Simple login check (you can customize this)
                if(username.equals("admin") && password.equals("password123")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
