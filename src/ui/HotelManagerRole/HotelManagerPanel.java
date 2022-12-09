package ui.HotelManagerRole;

import ProjectModel.SystemAdmin;

public class HotelManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public HotelManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 204, 204));
        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        orgBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgBtn.setOpaque(true);
        orgAdminBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgAdminBtn.setOpaque(true);
        manageRooms.setBackground(new java.awt.Color(244, 120, 140));
        manageRooms.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        orgAdminBtn = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        manageRooms = new javax.swing.JButton();

        setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("HOTEL MANAGER");
        add(lblsysadmin);
        lblsysadmin.setBounds(320, 40, 317, 44);

        orgAdminBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });
        add(orgAdminBtn);
        orgAdminBtn.setBounds(320, 290, 312, 40);

        orgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANIZATION ");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });
        add(orgBtn);
        orgBtn.setBounds(320, 220, 312, 40);

        viewTask.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(320, 150, 312, 40);

        manageRooms.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageRooms.setText("MANAGE ROOMS");
        manageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomsActionPerformed(evt);
            }
        });
        add(manageRooms);
        manageRooms.setBounds(330, 360, 294, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void manageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_manageRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JButton manageRooms;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
