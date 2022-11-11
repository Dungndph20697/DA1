/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.domainModel.ChiTietComBo;
import com.mycompany.domainModel.ComBo;
import com.mycompany.domainModel.MonAn;
import com.mycompany.service.IChiTietComBoService;
import com.mycompany.service.impl.ChiTietComBoService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewChiTietComBo extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private List<ChiTietComBo> lstChiTietComBos;
    private IChiTietComBoService ctcbs;

    public ViewChiTietComBo() {
        initComponents();
        dtm = new DefaultTableModel();
        ctcbs = new ChiTietComBoService();
        String header[] = {"Id món ăn", "Id combo", "Số lượng món ăn"};
        tbShow.setModel(dtm);
        dtm.setColumnIdentifiers(header);
        lstChiTietComBos = ctcbs.getAll();
        showData(lstChiTietComBos);
    }

    private void showData(List<ChiTietComBo> lstChiTietComBos) {
        dtm.setRowCount(0);
        for (ChiTietComBo lstChiTietComBo : lstChiTietComBos) {
            dtm.addRow(lstChiTietComBo.toDataRow());
        }
    }

    private void fill(int index) {
        ChiTietComBo ctcb = lstChiTietComBos.get(index);
        txtComBo.setText(ctcb.getComBo().getId());
        txtMonAn.setText(ctcb.getMonAn().getId());
        txtSoLuongMonAn.setText(ctcb.getSoLuongMonAn().toString());
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
        jLabel3 = new javax.swing.JLabel();
        txtMonAn = new javax.swing.JTextField();
        txtComBo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuongMonAn = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShow = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("ChiTietComBo");

        jLabel2.setText("Id món ăn:");

        jLabel3.setText("Id combo:");

        jLabel4.setText("Số lượng món ăn:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtExit.setText("Exit");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        tbShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbShow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSoLuongMonAn, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                            .addComponent(txtComBo)
                                            .addComponent(txtMonAn)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)
                                        .addComponent(btnRemove)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtComBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuongMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove)
                    .addComponent(txtExit))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        ComBo comBo = new ComBo();
        comBo.setId(txtComBo.getText());
        MonAn monAn = new MonAn();
        monAn.setId(txtMonAn.getText());
        ChiTietComBo ctcb = new ChiTietComBo(null, comBo, monAn, Integer.valueOf(txtSoLuongMonAn.getText()));
        JOptionPane.showMessageDialog(this, ctcbs.add(ctcb));
        lstChiTietComBos = ctcbs.getAll();
        showData(lstChiTietComBos);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        ComBo comBo = new ComBo();
        comBo.setId(txtComBo.getText());
        MonAn monAn = new MonAn();
        monAn.setId(txtMonAn.getText());
        ChiTietComBo ctcb = new ChiTietComBo(null, null, null, Integer.valueOf(txtSoLuongMonAn.getText()));
        JOptionPane.showMessageDialog(this, ctcbs.update(ctcb, comBo, monAn));
        lstChiTietComBos = ctcbs.getAll();
        showData(lstChiTietComBos);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        ComBo comBo = new ComBo();
        comBo.setId(txtComBo.getText());
        MonAn monAn = new MonAn();
        monAn.setId(txtMonAn.getText());
        ChiTietComBo ctcb = new ChiTietComBo(null, null, null, Integer.valueOf(txtSoLuongMonAn.getText()));
        JOptionPane.showMessageDialog(this, ctcbs.remove(ctcb, comBo, monAn));
        lstChiTietComBos = ctcbs.getAll();
        showData(lstChiTietComBos);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtExitActionPerformed

    private void tbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowMouseClicked
        // TODO add your handling code here:
        int index = tbShow.getSelectedRow();
        fill(index);
    }//GEN-LAST:event_tbShowMouseClicked

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
            java.util.logging.Logger.getLogger(ViewChiTietComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChiTietComBo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbShow;
    private javax.swing.JTextField txtComBo;
    private javax.swing.JButton txtExit;
    private javax.swing.JTextField txtMonAn;
    private javax.swing.JTextField txtSoLuongMonAn;
    // End of variables declaration//GEN-END:variables
}
