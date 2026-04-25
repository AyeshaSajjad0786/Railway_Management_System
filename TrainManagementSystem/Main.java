package TrainManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;



interface PaymentProcessor {
    void processPayment(double amount);
    void showPaymentConfirmation();
}

class Train {
    private int ID;
    private String Departure;
    private String Destination;
    private LocalTime DepartureTime;
    private LocalTime ArrivalTime;
    private LocalDate Date;
    private DateTimeFormatter TimeFormat = DateTimeFormatter.ofPattern("HH:mm");
    private DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Train(){}

    public Train(int iD, String departure, String destination, LocalTime departureTime, LocalTime arrivalTime){
        this.ID=iD;
        this.Departure=departure;
        this.Destination=destination;
        this.DepartureTime=departureTime;
        this.ArrivalTime=arrivalTime;
    }

    public Train(int iD, String departure, String destination, LocalTime departureTime, LocalTime arrivalTime,LocalDate date) {
        ID = iD;
        Departure = departure;
        Destination = destination;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        Date=date;
    }

    //GETTERS
    public int getID() {
        return ID;
    }

    public String getDeparture() {
        return Departure;
    }

    public String getDestination() {
        return Destination;
    }

    public String getDepartureTime() {
        return DepartureTime.format(TimeFormat);
    }

    public String getArrivalTime() {
        return ArrivalTime.format(TimeFormat);
    }

    public String getDate(){
        return Date.format(DateFormat);
    }

    //SETTERS
    public void setID(int iD) {
        ID = iD;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = LocalTime.parse(DepartureTime,TimeFormat);
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = LocalTime.parse(ArrivalTime,TimeFormat);
    }

    public void setDate(String Date){
        this.Date=LocalDate.parse(Date,DateFormat);
    }
}

class Ticket {
    private Train train;
    private String passengerName;
    private String passengerGender = "Not specified";
    private String seatNumber;
    private ImageIcon backgroundImage;
    private JPanel ticketPanel;
    private boolean isGenerated = false;

    public Ticket(Train train, String passengerName) {
        this(train, passengerName, "Not specified");
    }

    public Ticket(Train train, String passengerName, String passengerGender) {
        this.train = train;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.seatNumber = generateSeatNumber();
        try {
            this.backgroundImage = new ImageIcon(getClass().getResource("resizedlogo.jpg"));
        } catch (Exception e) {
            this.backgroundImage = null;
        }
    }

    private String generateSeatNumber() {
        char letter = (char) ('A' + (int) (Math.random() * 5));
        int number = 1 + (int) (Math.random() * 20);
        return letter + String.valueOf(number);
    }

    public JPanel getTicketPanel() {
        if ("Not specified".equals(passengerGender)) {
            askForGender();
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        ticketPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                }

                if (isGenerated) {
                    drawTicket(g);
                }
            }
        };
        ticketPanel.setPreferredSize(new Dimension(500, 300));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton generateButton = new JButton("Generate Ticket");
        JButton printButton = new JButton("Print Ticket");

        generateButton.addActionListener(e -> {
            isGenerated = true;
            ticketPanel.repaint();
            JOptionPane.showMessageDialog(null, "Ticket generated!", "Success", JOptionPane.INFORMATION_MESSAGE);
        });

        printButton.addActionListener(e -> {
            if (!isGenerated) {
                JOptionPane.showMessageDialog(null, "Generate ticket first!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                printTicket();
            }
        });

        buttonPanel.add(generateButton);
        buttonPanel.add(printButton);

        mainPanel.add(ticketPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        return mainPanel;
    }

    private void drawTicket(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(new Color(255, 255, 255, 200));
        g2d.fillRoundRect(20, 20, ticketPanel.getWidth() - 40, ticketPanel.getHeight() - 40, 20, 20);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRoundRect(20, 20, ticketPanel.getWidth() - 40, ticketPanel.getHeight() - 40, 20, 20);

        g2d.setColor(new Color(0, 100, 200));
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("SWIFT RAIL TICKET", ticketPanel.getWidth()/2 - 120, 60);

        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(40, 80, ticketPanel.getWidth() - 40, 80);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 16));
        g2d.drawString("Passenger: " + passengerName, 50, 110);
        g2d.drawString("Gender: " + passengerGender, 50, 140);
        g2d.drawString("Seat: " + seatNumber, ticketPanel.getWidth() - 150, 110);

        g2d.drawString("Train #" + train.getID(), 50, 180);
        g2d.drawString(train.getDeparture() + " → " + train.getDestination(), 50, 210);
        g2d.drawString("Date: " + train.getDate(), ticketPanel.getWidth() - 200, 180);

        g2d.drawString("Departs: " + train.getDepartureTime(), 50, 240);
        g2d.drawString("Arrives: " + train.getArrivalTime(), ticketPanel.getWidth() - 200, 240);

        g2d.setColor(new Color(0, 150, 0));
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("STATUS: CONFIRMED", ticketPanel.getWidth()/2 - 100, 280);
    }

    private void printTicket() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Train Ticket Printing");

        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                drawPrintableTicket(g2d, (int) pageFormat.getImageableWidth());
                return Printable.PAGE_EXISTS;
            }
        });

        if (job.printDialog()) {
            try {
                job.print();
                JOptionPane.showMessageDialog(null, "Ticket sent to printer!", "Print Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Printing failed: " + ex.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void drawPrintableTicket(Graphics2D g2d, int width) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, 400);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(0, 0, width, 400);

        g2d.setColor(new Color(0, 100, 200));
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("SWIFT RAIL TICKET", width/2 - 120, 40);

        g2d.setStroke(new BasicStroke(1));
        g2d.drawLine(20, 60, width - 20, 60);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 16));
        g2d.drawString("Passenger: " + passengerName, 30, 90);
        g2d.drawString("Gender: " + passengerGender, 30, 120);
        g2d.drawString("Seat: " + seatNumber, width - 150, 90);

        g2d.drawString("Train #" + train.getID(), 30, 160);
        g2d.drawString(train.getDeparture() + " → " + train.getDestination(), 30, 190);
        g2d.drawString("Date: " + train.getDate(), width - 200, 160);

        g2d.drawString("Departs: " + train.getDepartureTime(), 30, 220);
        g2d.drawString("Arrives: " + train.getArrivalTime(), width - 200, 220);

        g2d.setColor(new Color(0, 150, 0));
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("STATUS: CONFIRMED", width/2 - 100, 260);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 12));
        g2d.drawString("Thank you for choosing Swift Rail!", width/2 - 120, 350);
        g2d.drawString("Ticket generated on: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                width/2 - 120, 370);
    }

    private void askForGender() {
        Object[] options = {"Male", "Female", "Other"};
        passengerGender = (String) JOptionPane.showInputDialog(
                null,
                "Select passenger gender:",
                "Gender Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        if (passengerGender == null) {
            passengerGender = "Not specified";
        }
    }
}


// Transaction class implementing PaymentProcessor
class Transaction implements PaymentProcessor {
    private String passengerName;
    private double amount;
    private boolean paymentSuccessful;

    public Transaction(String passengerName, double amount) {
        this.passengerName = passengerName;
        this.amount = amount;
        this.paymentSuccessful = false;
    }

    @Override
    public void processPayment(double amount) {
        // Simulate payment processing
        int option = JOptionPane.showConfirmDialog(null,
                "Do you really want to book this ticket for $" + amount + "?",
                "Confirm Payment",
                JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            this.paymentSuccessful = true;
            showPaymentConfirmation();
        } else {
            JOptionPane.showMessageDialog(null, "Payment cancelled", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void showPaymentConfirmation() {
        if (paymentSuccessful) {
            JOptionPane.showMessageDialog(null,
                    "Payment of $" + amount + " deducted successfully from your account  " ,
                    "Payment Successful",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
}


public class Main {
    private static JFrame frame;
    public static JPanel panel;//changed to public from private  //ree
    private static JPanel table;
    private static JComboBox<String> fromBox;
    private static JComboBox<String> toBox;
    private static JSpinner dateSpinner;
    private static ArrayList<Train> trains = new ArrayList<>();
    private static final double TICKET_PRICE = 50.0; // Standard ticket price
    private static User currentUser;
    private static boolean uiInitialized = false;  //ree

public static void setCurrentUser(User user) {
        currentUser = user;
    }
    
    public static User getCurrentUser() {
        return currentUser;
    }
public Main() {   //reeeeeee
    if (!uiInitialized) {
        initializeUI();
    }
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Only closes this window
    frame.pack();
    frame.setLocationByPlatform(true);
    frame.setVisible(true);
}


    
    public static void main(String[] args) {
        populateTrains();
        initializeUI();
         ///reee
    }
public JPanel getMainPanel() {
    return panel; //  existing main JPanel
}
// Add this getter method    reeeeee
public JFrame getFrame() {
    return frame;
}
    private static void initializeUI() {
        
        if (uiInitialized) {  ///reee
        // If UI is already initialized, just refresh the content
        refreshTable(trains);
        return;
    }
        frame = new JFrame("Swift Rail");
        frame.setSize(1050, 650);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new BorderLayout(20, 20));
        panel.setBackground(new Color(0, 160, 100));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
        frame.add(panel);

        JPanel topPanel = new JPanel(new GridLayout(2, 4, 2, 10));
        topPanel.setBackground(Color.WHITE);
        topPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 240, 210), 1),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        topPanel.add(new JLabel("From:"));
        fromBox = new JComboBox<>(new String[]{"Select Departure", "Islamabad", "Lahore", "Karachi", "Peshawar"});
        topPanel.add(fromBox);

        topPanel.add(new JLabel("To:"));
        toBox = new JComboBox<>(new String[]{"Select Arrival", "Lahore", "Islamabad", "Karachi", "Quetta"});
        topPanel.add(toBox);

        topPanel.add(new JLabel("Date:"));
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.DAY_OF_MONTH);
        dateSpinner = new JSpinner(dateModel);
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "dd-MM-yyyy"));
        topPanel.add(dateSpinner);

        topPanel.add(new JLabel(""));
        JButton searchButton = new JButton("Search Trains");
        topPanel.add(searchButton);

        panel.add(topPanel, BorderLayout.NORTH);

        table = new JPanel(new GridLayout(6, 1));
        table.setBackground(Color.WHITE);
        JScrollPane scrollbar = new JScrollPane(table);
        panel.add(scrollbar, BorderLayout.CENTER);
        refreshTable(trains);

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

        frame.setVisible(true);
        uiInitialized = true; /////reeee
    }

    private static void populateTrains() {
        trains.add(new Train(101, "Islamabad", "Lahore", LocalTime.of(9, 0), LocalTime.of(12, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(102, "Islamabad", "Karachi", LocalTime.of(10, 0), LocalTime.of(22, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(103, "Lahore", "Islamabad", LocalTime.of(13, 0), LocalTime.of(16, 0), LocalDate.now().plusDays(1)));
        trains.add(new Train(104, "Karachi", "Quetta", LocalTime.of(6, 30), LocalTime.of(13, 30), LocalDate.now().plusDays(1)));
        trains.add(new Train(105, "Peshawar", "Lahore", LocalTime.of(8, 0), LocalTime.of(14, 0), LocalDate.now().plusDays(1)));
    }

    private static void refreshTable(ArrayList<Train> trains) {
        int rows = trains.size() + 1;
        if (rows < 6) rows = 6;
        new GridLayout(6, 1).setRows(rows);
        table.add(row(0, null));
        for (int i = 0; i < trains.size(); i++) {
            JPanel train = row(i, trains.get(i));
            if (trains.get(i) != null) {
                JButton bookButton = new JButton("Book Ticket");
                final Train currentTrain = trains.get(i);
                bookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showTicketDialog(currentTrain);
                    }
                });
                train.add(bookButton);
            }
            table.add(train);
        }
    }

    private static JPanel row(int index, Train train) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        if (index % 2 == 0) row.setBackground(Color.decode("#e5e5e5"));
        else row.setBackground(Color.decode("#EEEEEE"));
        String trainS, startS, destS, dateS, deptTimeS, arrTimeS, statusS;
        if (train != null) {
            trainS = String.valueOf(train.getID());
            startS = train.getDeparture();
            destS = train.getDestination();
            dateS = train.getDate();
            deptTimeS = train.getDepartureTime();
            arrTimeS = train.getArrivalTime();
            statusS = "Available";
        } else {
            trainS = "Train";
            startS = "To";
            destS = "From";
            dateS = "Date";
            deptTimeS = "depTime";
            arrTimeS = "arrTime";
            statusS = "Status";
        }
        JLabel trainNo = makeLabel(trainS, 100);
        row.add(trainNo);
        JLabel start = makeLabel(startS, 100);
        row.add(start);
        JLabel dest = makeLabel(destS, 100);
        row.add(dest);
        JLabel date = makeLabel(dateS, 150);
        row.add(date);
        JLabel deptTime = makeLabel(deptTimeS, 65);
        row.add(deptTime);
        JLabel arrTime = makeLabel(arrTimeS, 65);
        row.add(arrTime);
        JLabel status = makeLabel(statusS, 100);
        row.add(status);

        return row;
    }

    private static JLabel makeLabel(String text, int width) {
        JLabel label = new JLabel(text);
        label.setPreferredSize(new Dimension(width, 20));
        label.setFont(new Font(null, Font.PLAIN, 20));
        label.setForeground(Color.decode("#13678A"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }

    private static void showTicketDialog(Train train) {
       
String passengerName;
        
        // If user is logged in, use their name as default
        if (currentUser != null) {
            passengerName = currentUser.getName();
        } else {
            passengerName = JOptionPane.showInputDialog(frame, "Enter Passenger Name:");
            if (passengerName == null || passengerName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Passenger name is required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Object[] genderOptions = {"Male", "Female", "Other"};
        String passengerGender = (String) JOptionPane.showInputDialog(
                frame,
                "Select Passenger Gender:",
                "Gender Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                genderOptions,
                genderOptions[0]);

        if (passengerGender == null) {
            JOptionPane.showMessageDialog(frame, "Gender selection is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Process payment before showing ticket
        PaymentProcessor payment = new Transaction(passengerName, TICKET_PRICE);
        payment.processPayment(TICKET_PRICE);

        // Only show ticket if payment was successful
        if (((Transaction) payment).isPaymentSuccessful()) {
            Ticket ticket = new Ticket(train, passengerName.trim(), passengerGender);
            JScrollPane scrollPane = new JScrollPane(ticket.getTicketPanel());
            scrollPane.setPreferredSize(new Dimension(550, 350));
            JOptionPane.showMessageDialog(frame, scrollPane, "Generated Ticket", JOptionPane.PLAIN_MESSAGE);
        }
    }}

