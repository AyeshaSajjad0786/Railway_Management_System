package TrainManagementSystem;
import java.awt.Image;
import javax.swing.*;
import java.awt.CardLayout;
public class Assembler extends javax.swing.JFrame {

   public Assembler() {
    initComponents(); // initialize GUI
    UserDataHandler.loadUsers();
    contentpannel.setLayout(new CardLayout());
    //home panel
    Home homePanel = new Home();
 contentpannel.add(homePanel, "Homecard");

    // login pannel
Login loginPannel = new Login();
contentpannel.add(loginPannel,"logincard");
// signup pannel
SignUp SignUpPannel = new SignUp();
contentpannel.add(SignUpPannel,"signupcard");

 //  AboutUs panel
 AboutUs aboutUsPannel = new AboutUs();
 contentpannel.add(aboutUsPannel, "aboutuscard");
    //  Load and scale image
    ImageIcon originalIcon = new ImageIcon("C:\\Users\\Sajjad\\Downloads\\logoooo-removebg-preview.png"); // change to your image path
    Image image = originalIcon.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(image);

    //  Add image to JLabel and then to topPanel
    JLabel imageLabel = new JLabel(scaledIcon);
    topPanel.add(imageLabel);

    // Optional: Revalidate layout so it shows properly
    topPanel.revalidate();
    topPanel.repaint();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        toppannellabel = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();
        dashboardpannel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homebutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        contentpannel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));
        setName("Home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 700));

        topPanel.setBackground(new java.awt.Color(0, 153, 102));
        topPanel.setPreferredSize(new java.awt.Dimension(1000, 85));

        toppannellabel.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        toppannellabel.setForeground(new java.awt.Color(204, 255, 204));
        toppannellabel.setText("Your Smart Railway Booking Companion!");
logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("logresize.png")));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(toppannellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(toppannellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        dashboardpannel.setName(""); // NOI18N
        dashboardpannel.setPreferredSize(new java.awt.Dimension(1000, 400));
        dashboardpannel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        homebutton.setBackground(new java.awt.Color(0, 102, 51));
        homebutton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        homebutton.setForeground(new java.awt.Color(153, 255, 153));
        homebutton.setText("Home");
        homebutton.setBorder(null);
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 255, 153));
        jButton2.setText("Sign Up");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 255, 153));
        jButton3.setText("About Us");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt); 
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(689, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebutton)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        dashboardpannel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        contentpannel.setPreferredSize(new java.awt.Dimension(1000, 520));
        contentpannel.setLayout(new java.awt.CardLayout());
        dashboardpannel.add(contentpannel, java.awt.BorderLayout.CENTER);

        getContentPane().add(dashboardpannel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CardLayout cl = (CardLayout) contentpannel.getLayout();
        cl.show(contentpannel, "Homecard");
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout cl = (CardLayout) contentpannel.getLayout();
    cl.show(contentpannel, "logincard");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
CardLayout cl = (CardLayout) contentpannel.getLayout();
    cl.show(contentpannel, "signupcard");        
    }   

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout cl = (CardLayout) contentpannel.getLayout();
        cl.show(contentpannel, "aboutuscard");
    }   
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assembler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel contentpannel;
    private javax.swing.JPanel dashboardpannel;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel toppannellabel;
    // End of variables declaration                   
}