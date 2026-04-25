package TrainManagementSystem;

import java.util.Arrays;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JPanel {

    
    public SignUp() {
        initComponents();
        setupButtonActions(); 
    }
private void setupButtonActions() {
    signupbutton1.addActionListener(this::signupbutton1ActionPerformed);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Signup = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Name1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        phoneno1 = new javax.swing.JLabel();
        namefield1 = new javax.swing.JTextField();
        emailfield1 = new javax.swing.JTextField();
        passwordfield1 = new javax.swing.JPasswordField();
        confirmPasswordField1 = new javax.swing.JPasswordField();
        phonenofield1 = new javax.swing.JTextField();
        signupbutton1 = new javax.swing.JButton();
        toppannelsignup1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        Signup.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        Signup.setForeground(new java.awt.Color(0, 153, 102));
        Signup.setText("SIGNUP");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        setBackground(new java.awt.Color(255, 255, 255));
        setName("SignUp"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setName("SignUp"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        Name1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name1.setText("Name");

        email1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email1.setText("Email");

        code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        code.setText("Password");

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setText(" Confirm Password");

        phoneno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneno1.setText("Phone Number");

        namefield1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namefield1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        namefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefield1ActionPerformed(evt);
            }
        });

        emailfield1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailfield1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfield1ActionPerformed(evt);
            }
        });

        passwordfield1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfield1ActionPerformed(evt);
            }
        });

        confirmPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordField1ActionPerformed(evt);
            }
        });

        phonenofield1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phonenofield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenofield1ActionPerformed(evt);
            }
        });

        signupbutton1.setBackground(new java.awt.Color(0, 153, 102));
        signupbutton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signupbutton1.setForeground(new java.awt.Color(204, 255, 204));
        signupbutton1.setText("SignUp");

        toppannelsignup1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("SIGN UP");

        javax.swing.GroupLayout toppannelsignup1Layout = new javax.swing.GroupLayout(toppannelsignup1);
        toppannelsignup1.setLayout(toppannelsignup1Layout);
        toppannelsignup1Layout.setHorizontalGroup(
            toppannelsignup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppannelsignup1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppannelsignup1Layout.setVerticalGroup(
            toppannelsignup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppannelsignup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppannelsignup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signupbutton1)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneno1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenofield1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(toppannelsignup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(code)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phonenofield1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel2, gridBagConstraints);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>                        

    private void namefield1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void emailfield1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void passwordfield1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void confirmPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void phonenofield1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }     
    
    private void signupbutton1ActionPerformed(java.awt.event.ActionEvent evt) {
    // Reset all fields to normal color first
    resetFieldBackgrounds();
    
    // 1. Validate all required fields are filled + highlight empty ones
    if (namefield1.getText().trim().isEmpty() ||
        emailfield1.getText().trim().isEmpty() ||
        passwordfield1.getPassword().length == 0 ||
        confirmPasswordField1.getPassword().length == 0 ||
        phonenofield1.getText().trim().isEmpty()) {
        
        highlightEmptyFields(); // Visual highlight
        JOptionPane.showMessageDialog(this,
            "Please fill all required fields!",
            "Incomplete Form",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 2. Validate email format + highlight
    if (!emailfield1.getText().matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        emailfield1.setBackground(new Color(255, 200, 200));
        JOptionPane.showMessageDialog(this,
            "Please enter a valid email address!",
            "Invalid Email",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 3. Validate phone number + highlight
    if (!phonenofield1.getText().matches("\\d+")) {
        phonenofield1.setBackground(new Color(255, 200, 200));
        JOptionPane.showMessageDialog(this,
            "Phone number must contain only digits!",
            "Invalid Phone",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 4. Validate password match + highlight both fields
    if (!Arrays.equals(passwordfield1.getPassword(), confirmPasswordField1.getPassword())) {
        passwordfield1.setBackground(new Color(255, 200, 200));
        confirmPasswordField1.setBackground(new Color(255, 200, 200));
        JOptionPane.showMessageDialog(this,
            "Passwords do not match!",
            "Validation Error",
            JOptionPane.ERROR_MESSAGE);
        return;
    }
// After successful validation, before showing success message:
    String name = namefield1.getText().trim();
    String email = emailfield1.getText().trim();
    String password = new String(passwordfield1.getPassword());
    String phone = phonenofield1.getText().trim();

    // Create and save the new user
    User newUser = new User(name, email, password, phone);
    UserDataHandler.addUser(newUser);

    // 5. Show success message
    JOptionPane.showMessageDialog(this,
        "Signed up successfully!",
        "Success",
        JOptionPane.INFORMATION_MESSAGE);

    // 6. Close current window and open Main
    User authenticatedUser = UserDataHandler.findUserByEmail(email);
Main.setCurrentUser(authenticatedUser);
    SwingUtilities.invokeLater(() -> {
        SwingUtilities.getWindowAncestor(SignUp.this).dispose();
        Main.main(new String[0]);
    });
}

// Add these helper methods to your class
private void highlightEmptyFields() {
    Color error = new Color(255, 200, 200);
    
    if (namefield1.getText().trim().isEmpty()) 
        namefield1.setBackground(error);
    if (emailfield1.getText().trim().isEmpty()) 
        emailfield1.setBackground(error);
    if (passwordfield1.getPassword().length == 0) 
        passwordfield1.setBackground(error);
    if (confirmPasswordField1.getPassword().length == 0) 
        confirmPasswordField1.setBackground(error);
    if (phonenofield1.getText().trim().isEmpty()) 
        phonenofield1.setBackground(error);
}

private void resetFieldBackgrounds() {
    Color normal = Color.WHITE;
    namefield1.setBackground(normal);
    emailfield1.setBackground(normal);
    passwordfield1.setBackground(normal);
    confirmPasswordField1.setBackground(normal);
    phonenofield1.setBackground(normal);
}
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Signup;
    private javax.swing.JLabel code;
    private javax.swing.JPasswordField confirmPasswordField1;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField emailfield1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namefield1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordfield1;
    private javax.swing.JLabel phoneno1;
    private javax.swing.JTextField phonenofield1;
    private javax.swing.JButton signupbutton1;
    private javax.swing.JPanel toppannelsignup1;
    // End of variables declaration                   
}