/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.votingsystem;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author hp
 */
public class Form8 extends javax.swing.JFrame {

    /**
     * Creates new form Form8
     */
    Statement stmt;
    Connection con;
    ImageIcon icon;
    public Form8() throws SQLException, ClassNotFoundException {
        initComponents();
        icon=new ImageIcon("C:/Users/Oem/Documents/NetBeansProjects/com.mycompany_VotingSystem_jar_1.0-SNAPSHOT/src/main/java/com/mycompany/votingsystem/Images/images.png");
        setIconImage(icon.getImage());
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(204,255,153));
        addWindowListener(new WinClose());
                   Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Pritpal@1999");
        stmt=con.createStatement();
        
        ResultSet rs= stmt.executeQuery("select * from timeslot");
        while(rs.next())
        {
            if(rs.getString(1).equals("Y") && rs.getInt(2)==8 && rs.getInt(3)==11)
            {
                jRadioButton1.setSelected(true);
                return;
            }
            
            if(rs.getString(1).equals("Y") && rs.getInt(2)==11 && rs.getInt(3)==1)
            {
                jRadioButton2.setSelected(true);
                return;
            }
            
            if(rs.getString(1).equals("Y") && rs.getInt(2)==1 && rs.getInt(3)==3)
            {
                jRadioButton3.setSelected(true);
                return;
            }
            
            if(rs.getString(1).equals("Y") && rs.getInt(2)==3 && rs.getInt(3)==5)
            {
                jRadioButton4.setSelected(true);
                return;
            }
        }
        
    }
     class WinClose extends WindowAdapter
	{
                @Override
		public void windowClosing(WindowEvent e)
		{
                    try {
                        new Form6().setVisible(true);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
                    }
                      
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Time Slot Settings");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 4));

        jRadioButton1.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton1.setText("        8:00 am to 11:00 am");

        jRadioButton2.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton2.setText("         11:00 am to 1:00 pm");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(102, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton3.setText("        1:00 pm to 3:00 pm");

        jRadioButton4.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton4.setText("        3:00 pm to 5:00 pm");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Activate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 480, 410));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("     TIME SLOT SETTINGS");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 480, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()==true)
        {
            String x="Y";
            String y="X";
            try {
                stmt.executeUpdate("update timeslot set ACTIVATE='"+x+"'where TIME_FROM=8 AND TIME_TO=11") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=11 AND TIME_TO=1") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=1 AND TIME_TO=3") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=3 AND TIME_TO=5") ;
                jRadioButton1.setSelected(true);
                JOptionPane.showMessageDialog(this,"OK,The Time Slot 8:00 am to 11:00 am has been activated","DONE",INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
         if(jRadioButton2.isSelected()==true)
        {
            String x="Y";
            String y="X";
            try {
                stmt.executeUpdate("update timeslot set ACTIVATE='"+x+"'where TIME_FROM=11 AND TIME_TO=1") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=8 AND TIME_TO=11") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=1 AND TIME_TO=3") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=3 AND TIME_TO=5") ;
                jRadioButton2.setSelected(true);
                JOptionPane.showMessageDialog(this,"OK,The Time Slot 11:00 am to 1:00 pm has been activated","DONE",INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
          if(jRadioButton3.isSelected()==true)
        {
            String x="Y";
            String y="X";
            try {
                stmt.executeUpdate("update timeslot set ACTIVATE='"+x+"'where TIME_FROM=1 AND TIME_TO=3") ;
                 stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=11 AND TIME_TO=1") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=8 AND TIME_TO=11") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=3 AND TIME_TO=5") ;
                jRadioButton3.setSelected(true);
                JOptionPane.showMessageDialog(this,"OK,The Time Slot 1:00 pm to 3:00 pm has been activated","DONE",INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
          
           if(jRadioButton4.isSelected()==true)
        {
            String x="Y";
            String y="X";
            try {
                stmt.executeUpdate("update timeslot set ACTIVATE='"+x+"'where TIME_FROM=3 AND TIME_TO=5") ;
                 stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=1 AND TIME_TO=3") ;
                 stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=11 AND TIME_TO=1") ;
                stmt.executeUpdate("update timeslot set ACTIVATE='"+y+"'where TIME_FROM=8 AND TIME_TO=11") ;
                jRadioButton4.setSelected(true);
                JOptionPane.showMessageDialog(this,"OK,The Time Slot 3:00 pm to 5:00 pm has been activated","DONE",INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            new Form6().setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form8().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Form8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
