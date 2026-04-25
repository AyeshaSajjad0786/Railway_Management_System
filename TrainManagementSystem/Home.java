package TrainManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Home extends JPanel {

    private JComboBox<String> fromBox;
    private JComboBox<String> toBox;
    private JSpinner dateSpinner;
    private JPanel table;
    private ArrayList<Train> trains;

    public Home() {
        setLayout(new BorderLayout());
        trains = new ArrayList<>();
        populateTrains();

        // ===== Main vertical panel =====
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);

        
        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.setBackground(new Color(0, 120, 100));
       bannerPanel.setPreferredSize(new Dimension(300, 500));

       
        ImageIcon trainIcon = new ImageIcon(getClass().getResource("train.jpg")); 
        Image img = trainIcon.getImage().getScaledInstance(400, 500, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        bannerPanel.add(imageLabel, BorderLayout.WEST);

        JLabel tagline = new JLabel(
    "<html>" +
    "<div style='text-align:center;'>" +
        "<h1 style='color:white; font-size:36px; margin:10px 0;'>Swift Rail - Fast, Safe, Reliable</h1>" +
        "<p style='color:white; font-size:18px; margin:5px 0;'>Book your journey across Pakistan with ease.</p>" +
        "<p style='color:white; font-size:20px; font-weight:bold; margin:10px 0;'>Login or Sign Up to book your seat now!</p>" +
    "</div>" +
    "</html>"
);


       // JLabel tagline = new JLabel("<html><h1 style='color:white;'>Swift Rail - Fast, Safe, Reliable</h1><p style='color:white;'>Book your journey across Pakistan with ease.</p></html>");
        tagline.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));
        bannerPanel.add(tagline, BorderLayout.CENTER);

        mainPanel.add(bannerPanel);

        // ===== Search Panel =====
        JPanel searchPanel = new JPanel(new GridLayout(2, 4, 10, 10));
        searchPanel.setMaximumSize(new Dimension(950, 100));
        searchPanel.setBackground(Color.WHITE);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        searchPanel.add(new JLabel("From:"));
        fromBox = new JComboBox<>(new String[]{"Select Departure", "Islamabad", "Lahore", "Karachi", "Peshawar"});
        searchPanel.add(fromBox);

        searchPanel.add(new JLabel("To:"));
        toBox = new JComboBox<>(new String[]{"Select Arrival", "Lahore", "Islamabad", "Karachi", "Quetta"});
        searchPanel.add(toBox);

        searchPanel.add(new JLabel("Date:"));
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.DAY_OF_MONTH);
        dateSpinner = new JSpinner(dateModel);
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "dd-MM-yyyy"));
        searchPanel.add(dateSpinner);

        searchPanel.add(new JLabel(""));
        JButton searchButton = new JButton("Search Trains");
        searchPanel.add(searchButton);

        mainPanel.add(searchPanel);

        // ===== Train Table Panel =====
        table = new JPanel(new GridLayout(6, 1));
        table.setBackground(Color.WHITE);
        refreshTable(trains);
        mainPanel.add(table);

        // ===== Scroll Pane wrapping everything =====
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // smoother scroll
        add(scrollPane, BorderLayout.CENTER);

        // ===== Search button logic =====
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String from = (String) fromBox.getSelectedItem();
                String to = (String) toBox.getSelectedItem();

                table.removeAll();
                ArrayList<Train> filtered = new ArrayList<>();
                for (Train t : trains) {
                    if (t.getDeparture().equals(from) && t.getDestination().equals(to)) {
                        filtered.add(t);
                    }
                }

                if (filtered.isEmpty()) {
                    table.add(makeLabel("No trains found for selected route.", 100));
                } else {
                    refreshTable(filtered);
                }

                table.revalidate();
                table.repaint();
            }
        });
    }

    // Populate dummy data
    private void populateTrains() {
        trains.add(new Train(101, "Islamabad", "Lahore", LocalTime.of(9, 0), LocalTime.of(12, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(102, "Islamabad", "Karachi", LocalTime.of(10, 0), LocalTime.of(22, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(103, "Lahore", "Islamabad", LocalTime.of(13, 0), LocalTime.of(16, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(104, "Karachi", "Quetta", LocalTime.of(6, 30), LocalTime.of(13, 30), LocalDate.now().plusDays(1)));
        trains.add(new Train(105, "Peshawar", "Lahore", LocalTime.of(8, 0), LocalTime.of(14, 0), LocalDate.now().plusDays(1)));
    }

    private void refreshTable(ArrayList<Train> trainList) {
        int rows = trainList.size() + 1;
        if (rows < 6) rows = 6;
        table.setLayout(new GridLayout(rows, 1));
        table.add(row(0, null)); // header
        for (int i = 0; i < trainList.size(); i++) {
            table.add(row(i + 1, trainList.get(i)));
        }
    }

    private JPanel row(int index, Train train) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        if (index % 2 == 0) row.setBackground(Color.decode("#e5e5e5"));
        else row.setBackground(Color.decode("#EEEEEE"));

        String[] values;
        if (train != null) {
            values = new String[]{
                String.valueOf(train.getID()), train.getDeparture(), train.getDestination(),
                train.getDate(), train.getDepartureTime(), train.getArrivalTime(), "Available"
            };
        } else {
            values = new String[]{"Train", "From", "To", "Date", "Dep", "Arr", "Status"};
        }

        int[] widths = {100, 100, 100, 150, 65, 65, 100};
        for (int i = 0; i < values.length; i++) {
            row.add(makeLabel(values[i], widths[i]));
        }
        return row;
    }

    private JLabel makeLabel(String text, int width) {
        JLabel label = new JLabel(text);
        label.setPreferredSize(new Dimension(width, 20));
        label.setFont(new Font(null, Font.PLAIN, 18));
        label.setForeground(Color.decode("#13678A"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
}
