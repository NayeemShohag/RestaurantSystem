/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theluxuryrestaurantsystem;

import javax.swing.JOptionPane;
import java.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author msi
 */
public class SignUpform extends javax.swing.JFrame {

    /**
     * Creates new form SignUpform
     * 
     */
    
    PrintWriter pw;
    
    public SignUpform() {
        initComponents();
                
        try{
            
            pw=new PrintWriter("login.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        new_name = new javax.swing.JTextField();
        mail = new javax.swing.JLabel();
        new_mail = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        new_number = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        new_male = new javax.swing.JRadioButton();
        new_female = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        new_password = new javax.swing.JPasswordField();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        new_textarea = new javax.swing.JTextArea();
        new_join_now = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("NAME :");
        getContentPane().add(name);
        name.setBounds(48, 213, 112, 31);

        new_name.setBackground(new java.awt.Color(204, 204, 204));
        new_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(new_name);
        new_name.setBounds(170, 213, 400, 31);

        mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setText("MAIL :");
        getContentPane().add(mail);
        mail.setBounds(48, 292, 112, 31);

        new_mail.setBackground(new java.awt.Color(204, 204, 204));
        new_mail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(new_mail);
        new_mail.setBounds(170, 292, 400, 31);

        number.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number.setForeground(new java.awt.Color(255, 255, 255));
        number.setText("NUMBER :");
        getContentPane().add(number);
        number.setBounds(48, 357, 112, 31);

        new_number.setBackground(new java.awt.Color(204, 204, 204));
        new_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(new_number);
        new_number.setBounds(170, 357, 217, 31);

        gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("GENDER :");
        getContentPane().add(gender);
        gender.setBounds(48, 428, 112, 31);

        new_male.setBackground(new java.awt.Color(204, 204, 204));
        new_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_male.setText("MALE");
        new_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_maleActionPerformed(evt);
            }
        });
        getContentPane().add(new_male);
        new_male.setBounds(170, 428, 90, 31);

        new_female.setBackground(new java.awt.Color(204, 204, 204));
        new_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_female.setText("FEMALE");
        new_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_femaleActionPerformed(evt);
            }
        });
        getContentPane().add(new_female);
        new_female.setBounds(288, 428, 90, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PASSWORD :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 477, 112, 30);

        new_password.setBackground(new java.awt.Color(204, 204, 204));
        new_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(new_password);
        new_password.setBounds(170, 477, 217, 30);

        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("ADDRESS :");
        getContentPane().add(address);
        address.setBounds(48, 525, 112, 30);

        new_textarea.setBackground(new java.awt.Color(204, 204, 204));
        new_textarea.setColumns(20);
        new_textarea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        new_textarea.setRows(5);
        jScrollPane1.setViewportView(new_textarea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 525, 400, 111);

        new_join_now.setBackground(new java.awt.Color(153, 0, 51));
        new_join_now.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        new_join_now.setForeground(new java.awt.Color(255, 255, 255));
        new_join_now.setText("JOIN NOW");
        new_join_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_join_nowActionPerformed(evt);
            }
        });
        getContentPane().add(new_join_now);
        new_join_now.setBounds(750, 590, 140, 40);

        exit.setBackground(new java.awt.Color(153, 0, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(900, 590, 80, 40);

        back_button.setBackground(new java.awt.Color(153, 0, 51));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button);
        back_button.setBounds(900, 10, 80, 40);

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Web-Toto-Eva-Vera-Kuini-Estudio-014.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int c_exit_button = JOptionPane.showConfirmDialog(null,"Do you reallay want to EXIT ?","EXIT",JOptionPane.YES_NO_OPTION);
        if(c_exit_button==0){
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        new SignUp_LogIn().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void new_join_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_join_nowActionPerformed
        // TODO add your handling code here:
        
        String S = new_name.getText();
        pw.write(S+" ");
        S = new_mail.getText();
        pw.write(S+" ");
         S = new_number.getText();
        pw.write(S+" ");
        
        if(new_male.isSelected()==true)
        {
            pw.write(new_male.getText()+" ");
           
        }
        if(new_female.isSelected()==true)
        {
            pw.write(new_female.getText()+ " ");
        }
        char ps [] = new_password.getPassword();
        S= String.copyValueOf(ps);
        pw.write(S+" ");
        
        S= new_textarea.getText();
        pw.write(S+"\n");
        pw.close();
        
        new_name.setText("");
        new_mail.setText("");
        new_number.setText("");
        new_password.setText("");
        new_textarea.setText("");
        
        new_female.setEnabled(true);
        new_male.setEnabled(true);
        new_female.setSelected(false);
        new_male.setSelected(false);
        
        new SignUp_LogIn().setVisible(true);
        
        this.dispose();
        
        
        
        
        
    }//GEN-LAST:event_new_join_nowActionPerformed

    private void new_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_maleActionPerformed
            // TODO add your handling code here:
        if(new_male.isSelected()== true)
        {
            new_female.setEnabled(false);
        }
        else{
        new_female.setEnabled(true);
        }
    }//GEN-LAST:event_new_maleActionPerformed

    private void new_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_femaleActionPerformed
        // TODO add your handling code here:
        if(new_female.isSelected()== true)
        {
            new_male.setEnabled(false);
        }
        else{
        new_male.setEnabled(true);
        }
    }//GEN-LAST:event_new_femaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton back_button;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton new_female;
    private javax.swing.JButton new_join_now;
    private javax.swing.JTextField new_mail;
    private javax.swing.JRadioButton new_male;
    private javax.swing.JTextField new_name;
    private javax.swing.JTextField new_number;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JTextArea new_textarea;
    private javax.swing.JLabel number;
    // End of variables declaration//GEN-END:variables
}
