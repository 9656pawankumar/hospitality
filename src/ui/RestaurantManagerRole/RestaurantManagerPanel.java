package ui.RestaurantManagerRole;

import ProjectModel.SystemAdmin;

public class RestaurantManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public RestaurantManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 204, 204));

        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        orgButton.setBackground(new java.awt.Color(244, 120, 140));
        orgButton.setOpaque(true);
        orgAdminBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgAdminBtn.setOpaque(true);
        addMenu.setBackground(new java.awt.Color(244, 120, 140));
        addMenu.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewTask = new javax.swing.JButton();
        orgButton = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addMenu = new javax.swing.JButton();

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewTask.setText("VIEW ORDERS");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        orgButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        orgButton.setText("MANAGE ORGANIZATION");
        orgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgButtonActionPerformed(evt);
            }
        });

        orgAdminBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("RESTAURANT MANAGER PANEL");

        addMenu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addMenu.setText("ADD MENU ");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(viewTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(110, 110, 110)
                .addComponent(viewTask)
                .addGap(46, 46, 46)
                .addComponent(orgButton)
                .addGap(47, 47, 47)
                .addComponent(orgAdminBtn)
                .addGap(43, 43, 43)
                .addComponent(addMenu)
                .addContainerGap(304, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgButtonActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgButtonActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_addMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgButton;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
