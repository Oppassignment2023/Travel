/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpm.dbapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sspmcoe
 */
public class editForm extends javax.swing.JFrame {

    /**
     * Creates new form addForm
     */
    
     Connection conn;
    PreparedStatement st,st1,st2;
    ResultSet rs1,rs2;
    public editForm() {
        initComponents();
        try {       
             Class.forName("com.mysql.jdbc.Driver");
                    conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travelbooking",
                        "root", "");
               System.out.println("Connect");
               
               st1 = (PreparedStatement) conn.prepareStatement("Select transid from travel_booking");
              rs1 = st1.executeQuery();
              while(rs1.next())
              {
                  cmbtransid.addItem(rs1.getString("transid"));
              }
              rs1.close();
               
            } catch (Exception e) {
                    System.out.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbtransid = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txttrcompany = new javax.swing.JTextField();
        txtvehicletype = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        txtvehicleno = new javax.swing.JTextField();
        txtseatno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttransid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search & Update Data");

        jLabel2.setText("date");

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel4.setText("Select transid");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel5.setText("trcompany");

        txttrcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrcompanyActionPerformed(evt);
            }
        });

        txtvehicletype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehicletypeActionPerformed(evt);
            }
        });

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        txtvehicleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehiclenoActionPerformed(evt);
            }
        });

        txtseatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseatnoActionPerformed(evt);
            }
        });

        jLabel3.setText("vehicletype");

        jLabel6.setText("vehicleno");

        jLabel7.setText("seatno");

        jLabel8.setText("amount");

        jLabel9.setText("transid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbtransid, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtvehicletype, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(txtvehicleno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtseatno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEdit))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttransid, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(txtdate)
                            .addComponent(txttrcompany))))
                .addGap(34, 34, 34)
                .addComponent(btnSearch)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbtransid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txttransid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdate)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txttrcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvehicletype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvehicleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtseatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addComponent(btnEdit)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(validates())
        {try {
              String sqlstr ="Update travel_booking set transid = "+ txttransid.getText()+" ,date = '" + txtdate.getText()+ "',trcompany = '" + txttrcompany.getText()+ "',vehicleno = '" + txtvehicleno.getText()+ "',vehicletype = '" + txtvehicletype.getText()+ "',seatno = '" + txtseatno.getText()+ "',amount = '" + txtamount.getText()+ "' where transid = " + cmbtransid.getSelectedItem().toString();
              //System.out.println(sqlstr);
              st = (PreparedStatement) conn.prepareStatement(sqlstr);
              
            
            if(st.execute(sqlstr)==false)
            {
                JOptionPane.showMessageDialog(editForm.this, "Data inserted Successfully!!");
                this.setVisible(false);
                new MainUI().setVisible(true);
                conn.close();
            }
            else
            {
                JOptionPane.showMessageDialog(editForm.this, "Enter correct Data");
                
            }
         
        }
        catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
        
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {       
                           
              st2 = (PreparedStatement) conn.prepareStatement("Select * from travel_booking where transid = "+ cmbtransid.getSelectedItem().toString());
              rs2 = st2.executeQuery();
              
              while(rs2.next())
              {
                  txttransid.setText(rs2.getString("transid"));
                  txtdate.setText(rs2.getString("date"));
                  txttrcompany.setText(rs2.getString("trcompany"));
                  txtvehicletype.setText(rs2.getString("vehicletype"));
                  txtvehicleno.setText(rs2.getString("vehicleno"));
                  txtseatno.setText(rs2.getString("seatno"));
                  txtamount.setText(rs2.getString("amount"));
              }
              rs2.close();
               
            } catch (Exception e) {
                    System.out.println(e);
                }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txttrcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrcompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrcompanyActionPerformed

    private void txtvehicletypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehicletypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehicletypeActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void txtvehiclenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehiclenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehiclenoActionPerformed

    private void txtseatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseatnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseatnoActionPerformed

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
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editForm().setVisible(true);
            }
        });
    }
  public boolean validates()
  {
      if(txttransid.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter transid");
          txttransid.grabFocus();
          return false;
      }
      if(txtdate.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter date");
          txtdate.grabFocus();
          return false;
      }
      if(txttrcompany.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter trcompany");
          txttrcompany.grabFocus();
          return false;
      }
      if(txtvehicletype.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter vehicletype");
          txtvehicletype.grabFocus();
          return false;
      }
      if(txtvehicleno.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter vehicleno");
          txtvehicleno.grabFocus();
          return false;
      }
      if(txtseatno.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter seatno");
          txtseatno.grabFocus();
          return false;
      }
      if(txtamount.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(editForm.this, "Enter amount");
          txtamount.grabFocus();
          return false;
      }
      return true;
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbtransid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtseatno;
    private javax.swing.JTextField txttransid;
    private javax.swing.JTextField txttrcompany;
    private javax.swing.JTextField txtvehicleno;
    private javax.swing.JTextField txtvehicletype;
    // End of variables declaration//GEN-END:variables
}
