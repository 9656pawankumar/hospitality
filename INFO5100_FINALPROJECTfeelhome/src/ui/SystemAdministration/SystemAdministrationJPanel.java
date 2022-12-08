package ui.SystemAdministration;

import java.awt.Color;
import ProjectModel.SystemAdmin;

public class SystemAdministrationJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public SystemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 204, 204));

        btnmanagenetworks.setBackground(new java.awt.Color(244, 120, 140));
        btnmanagenetworks.setOpaque(true);
        btnmanagecustomers.setBackground(new java.awt.Color(244, 120, 140));
        btnmanagecustomers.setOpaque(true);
        btnmanagemanagers.setBackground(new java.awt.Color(244, 120, 140));
        btnmanagemanagers.setOpaque(true);
        enterpriseBtn.setBackground(new java.awt.Color(244, 120, 140));
        enterpriseBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanagenetworks = new javax.swing.JButton();
        enterpriseBtn = new javax.swing.JButton();
        btnmanagecustomers = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        btnmanagemanagers = new javax.swing.JButton();

        btnmanagenetworks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagenetworks.setText("MANAGE NETWORKS");
        btnmanagenetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagenetworksActionPerformed(evt);
            }
        });

        enterpriseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseBtn.setText("MANAGE ENTERPRICES");
        enterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseBtnActionPerformed(evt);
            }
        });

        btnmanagecustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagecustomers.setText("MANAGE CUSTOMERS");
        btnmanagecustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagecustomersActionPerformed(evt);
            }
        });

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");

        btnmanagemanagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagemanagers.setText("MANAGE MANAGERS");
        btnmanagemanagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagemanagersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(enterpriseBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnmanagenetworks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnmanagemanagers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnmanagecustomers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblsysadmin)
                .addGap(76, 76, 76)
                .addComponent(btnmanagenetworks, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(enterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnmanagemanagers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnmanagecustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseBtnActionPerformed
        callOnCreateMethod2.run();

    }//GEN-LAST:event_enterpriseBtnActionPerformed

    private void btnmanagenetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagenetworksActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnmanagenetworksActionPerformed

    private void btnmanagecustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagecustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnmanagecustomersActionPerformed

    private void btnmanagemanagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagemanagersActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnmanagemanagersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanagecustomers;
    private javax.swing.JButton btnmanagemanagers;
    private javax.swing.JButton btnmanagenetworks;
    private javax.swing.JButton enterpriseBtn;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
