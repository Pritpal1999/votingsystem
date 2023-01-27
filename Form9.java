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

/**
 *
 * @author hp
 */
public class Form9 extends javax.swing.JFrame {

    /**
     * Creates new form Form9
     */
   
    Statement stmt;
    Connection con;
    ImageIcon icon;
    public Form9() throws ClassNotFoundException, SQLException {
        initComponents();
        icon=new ImageIcon("C:/Users/Oem/Documents/NetBeansProjects/com.mycompany_VotingSystem_jar_1.0-SNAPSHOT/src/main/java/com/mycompany/votingsystem/Images/images.png");
        setIconImage(icon.getImage());
         setExtendedState(JFrame.MAXIMIZED_BOTH);
          getContentPane().setBackground(new Color(255,255,153));
        addWindowListener(new WinClose());
      
          
        Class.forName("com.mysql.cj.jdbc.Driver");  //Driver loading
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Pritpal@1999");
        stmt=con.createStatement();
    }
    class WinClose extends WindowAdapter
	{
                @Override
		public void windowClosing(WindowEvent e)
		{
                    try {
                        new Form2().setVisible(true);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Presiding Officer Diary Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 255), 4, true));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Total Vote Caste");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Male, Female and Third Gender %Age Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Slot Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 510));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 102, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 0));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 580, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            new Form6().setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            int total=0;
            ResultSet rs =stmt.executeQuery("Select * from result");
            while(rs.next())
             {
                       total=total+rs.getInt(1);                     
             }
            jTextArea1.setText("========================================\n"
                    + "TOTAL VOTES ="+total+"\n========================================");
            
        } catch (SQLException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ResultSet rs;
        int t1,t2,t3,t4;
        try {
            rs = stmt.executeQuery("Select * from timeslot");
            rs.next();
            t1=rs.getInt(4);
             rs.next();
            t2=rs.getInt(4);
            
             rs.next();
            t3=rs.getInt(4);
            
             rs.next();
            t4=rs.getInt(4);
            
            jTextArea1.setText("========================================\n"
                    + "VOTES CASTED FROM : 8 AM TO 11 AM ="+t1+"\nVOTES CASTED FROM : 11 AM TO 1 PM =" +t2 
            +"\nVOTES CASTED FROM : 1 PM TO 3 PM ="+t3+"\nVOTES CASTED FROM : 3 PM TO 5 PM ="+t4
            +                  "\n========================================");
        } catch (SQLException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            ResultSet rs=stmt.executeQuery("select * from voting ");
            int m=0,f=0,t=0;
            while(rs.next())
            {
                if(rs.getString(3).equals("MALE"))
                {
                    m=m+1;
                }
                if(rs.getString(3).equals("FEMALE"))
                {
                    f=f+1;
                }
                if(rs.getString(3).equals("THIRD GENDER"))
                {
                    t=t+1;
                }
            }
            
             rs=stmt.executeQuery("select * from passwords");
             int b=0;
             while(rs.next())
             {
               if(rs.getString(2).equals("BA"))
              {
                  b=Integer.parseInt(rs.getString(3));    
              }
            }
        
           rs=stmt.executeQuery("select * from booths");
           int sum=0;
        
           while(rs.next())
           {
                if(rs.getInt(3)==b)
                {
                   sum=rs.getInt(5); 
                }
           }
           int total=0;
             try {
            // TODO add your handling code here:
            
            rs =stmt.executeQuery("Select * from result");
            while(rs.next())
             {
                       total=total+rs.getInt(1);                     
             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
        }
           double d=(total/(double)sum)*100;
             jTextArea1.setText("========================================\n"
                    + "NUMBER OF MALE VOTES CASTED = "+m+"\nNUMBER OF FEMALE VOTES CASTED =" +f 
            +"\nNUMBER OF THIRD GENDER VOTES CASTED ="+t
             +"\n========================================"+
                     "\nTOTAL VOTE CASTED ="+total+"\nTOTAL VOTERS ="+sum+"\nTOTAL CASTED %AGE="+d
             +"\n========================================");
        } catch (SQLException ex) {
            Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Form9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form9().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Form9.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}