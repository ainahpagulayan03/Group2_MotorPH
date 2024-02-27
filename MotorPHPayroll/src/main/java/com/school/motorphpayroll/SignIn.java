/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.school.motorphpayroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SignIn extends javax.swing.JFrame {
    
    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EmployeeIDlogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PasswordLogin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adm_emp = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1226, 600));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Sign in with your organizational account");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setOpaque(true);
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        EmployeeIDlogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bg.add(EmployeeIDlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 250, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Employee ID");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 99, 35));

        PasswordLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordLogin.setToolTipText("");
        bg.add(PasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Password");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 99, 30));

        LoginBtn.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(51, 102, 255));
        LoginBtn.setText("Sign In");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        bg.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, 30));

        jPanel2.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("If you are unable to login, please navigate");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Password Reset Tool");

        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("to reset your password, ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("<HTML>\nUpdate an expired password, or unlock \n<br>\nyour account.\n<br>");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 286, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("x");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 20, 20));

        adm_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee" , "Admin" }));
        bg.add(adm_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("User");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 90, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MousePressed
    
    private int xMouse, yMouse;
    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_bgMouseDragged

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // log in path:
       
        PreparedStatement st;
        ResultSet rs;
        
        // get the username & password
        String username = EmployeeIDlogin.getText();
        String password = String.valueOf(PasswordLogin.getPassword());
        
        //create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM motorphemployeedb.`motorphemployeedata-employeedetails` WHERE `Employee_#` = ? AND `Password` = ? ";
        
        // show a message if the username or the password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }
        else{
           
            try {
            st = (PreparedStatement) db.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                maindash dash = new maindash(username);
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Sign in Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
       
        
    }//GEN-LAST:event_LoginBtnActionPerformed


    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmployeeIDlogin;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordLogin;
    private javax.swing.JComboBox<String> adm_emp;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private Connection db() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
