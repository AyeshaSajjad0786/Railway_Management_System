package TrainManagementSystem;
import TrainManagementSystem.User;
import TrainManagementSystem.UserDataHandler;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
       
        // Existing SignUp button listener
        SignupInLogin.addActionListener(evt -> {
            Container parent = this.getParent(); 
            if (parent.getLayout() instanceof CardLayout) {
                CardLayout layout = (CardLayout) parent.getLayout();
                layout.show(parent, "signupcard");
            }
        });
        
        // Add login authentication to the existing LoginButton listener
        LoginButton.addActionListener(evt -> {
            String email = nameTextField.getText().trim();
            String password = new String(jPasswordField1.getPassword());
            
            // Authenticate user
            User user = UserDataHandler.findUserByEmail(email);
            
            if (user != null && user.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(this, 
                    "Login successful!", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
                
        
                
               // After successful login validation 
    User authenticatedUser = UserDataHandler.findUserByEmail(email);
Main.setCurrentUser(authenticatedUser);

 //   reeeeeeeeeee
        SwingUtilities.invokeLater(() -> {
           SwingUtilities.invokeLater(() -> {
        SwingUtilities.getWindowAncestor(Login.this).dispose();
        Main.main(new String[0]);
    }); 
        });
         } else {
                JOptionPane.showMessageDialog(this, 
                    "Invalid email or password", 
                    "Login Failed", 
                    JOptionPane.ERROR_MESSAGE);
            }
        });
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Login = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        dontHaveLabel = new javax.swing.JLabel();
        SignupInLogin = new javax.swing.JButton();
        topLoginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();

        setName("Login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 495));
        setLayout(new java.awt.GridBagLayout());

        Login.setBackground(new java.awt.Color(153, 255, 153));
        Login.setName("Login"); // NOI18N
        Login.setPreferredSize(new java.awt.Dimension(500, 400));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email");

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        LoginButton.setBackground(new java.awt.Color(0, 153, 102));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(153, 255, 153));
        LoginButton.setText("Login");

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dontHaveLabel.setText("I don't have an account");

        SignupInLogin.setBackground(new java.awt.Color(0, 153, 102));
        SignupInLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SignupInLogin.setForeground(new java.awt.Color(153, 255, 153));
        SignupInLogin.setText("Sign Up");

        topLoginPanel.setBackground(new java.awt.Color(0, 153, 102));

        loginLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(153, 255, 153));
        loginLabel.setText("LOGIN");

        javax.swing.GroupLayout topLoginPanelLayout = new javax.swing.GroupLayout(topLoginPanel);
        topLoginPanel.setLayout(topLoginPanelLayout);
        topLoginPanelLayout.setHorizontalGroup(
            topLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        topLoginPanelLayout.setVerticalGroup(
            topLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLoginPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(dontHaveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignupInLogin))
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(topLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(topLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignupInLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dontHaveLabel))
                .addGap(13, 13, 13))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(Login, gridBagConstraints);
        Login.getAccessibleContext().setAccessibleName("Login");
    }// </editor-fold>                        

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void SignupInLoginActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        java.awt.Container parent = this.getParent();
        if (parent.getLayout() instanceof java.awt.CardLayout) {
            java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();
            layout.show(parent, "SignUp"); 
        }
    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JPanel Login;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignupInLogin;
    private javax.swing.JLabel dontHaveLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel topLoginPanel;
    // End of variables declaration                   
}