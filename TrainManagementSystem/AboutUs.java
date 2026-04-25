package TrainManagementSystem;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends javax.swing.JPanel {

    public AboutUs() {
        // Set panel properties
        setPreferredSize(new Dimension(1000, 500));
        setBackground(new Color(204, 255, 204));
        setLayout(new BorderLayout(10, 10)); // Adds some padding
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margins

        // Title Label
        JLabel titleLabel = new JLabel("About Us", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 28));
        titleLabel.setForeground(new Color(0, 102, 51));
        add(titleLabel, BorderLayout.NORTH);

        // Info Text
        JTextArea infoText = new JTextArea();
        infoText.setText("Welcome to the Smart Railway Booking System!\n\n"
                + "This system is designed to simplify railway ticket booking.\n\n"
                + "Features:\n"
                + "- User-friendly interface\n"
                + "- Secure login\n"
                + "- Easy navigation\n\n"
                + "Developed by: Ayesha Sajjad , Aleeza Imran , Sidra Pervaiz\n"
                + "Contact: support@railway.com");
        infoText.setFont(new Font("Arial", Font.PLAIN, 18));
        infoText.setEditable(false);
        infoText.setLineWrap(true);
        infoText.setWrapStyleWord(true);
        infoText.setBackground(new Color(230, 255, 230));

        // ScrollPane
        JScrollPane scrollPane = new JScrollPane(infoText);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);

        // Footer
        JLabel footerLabel = new JLabel("© 2025 Smart Railway", SwingConstants.CENTER);
        footerLabel.setFont(new Font("Serif", Font.ITALIC, 14));
        add(footerLabel, BorderLayout.SOUTH);
    }
}