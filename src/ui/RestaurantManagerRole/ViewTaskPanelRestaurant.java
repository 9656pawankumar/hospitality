package ui.RestaurantManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjectModel.Booking;
import ProjectModel.Customer;
import ProjectModel.CustomerDirectory;
import ProjectModel.DeliverymanOrg;
import ProjectModel.Organization;
import ProjectModel.Restaurant;
import ProjectModel.SystemAdmin;
import ProjectModel.services.BusinessEventService;
import ProjectModel.services.RestaurantService;
import ProjectModel.services.Service;

public class ViewTaskPanelRestaurant extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Restaurant restaurant;

    public ViewTaskPanelRestaurant(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Restaurant restaurant) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.restaurant = restaurant;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        acceptBtn.setBackground(new java.awt.Color(244, 120, 140));
        acceptBtn.setOpaque(true);
        denyBtn.setBackground(new java.awt.Color(244, 120, 140));
        denyBtn.setOpaque(true);
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deliveryOrg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER DETAIL", "ADDRESS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deliveryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A ORGANIZATION FOR DELIVERYMAN");

        acceptBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        acceptBtn.setText("ACCEPT ORDER");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        denyBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        denyBtn.setText("DENY ORDER");
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("VIEW ORDER DETAILS FOR RESTAURANT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (restaurant.getName().equals(service.getEnterprise().getName())) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }

        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        DeliverymanOrg delivery = (DeliverymanOrg) deliveryOrg.getSelectedItem();
        if (delivery == null) {
            JOptionPane.showMessageDialog(this, "Please select delivery organization to be assinged.");
            return;
        }

        resService.addOrganization(delivery);
        resService.setStatus(Service.Status.CONFIRMED);

        JOptionPane.showMessageDialog(this, String.format("Booking %s is assigned to delivery ord '%s'",
                booking.getId(), delivery));

        populateTable();
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (service instanceof RestaurantService) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }
        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        resService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, String.format("Booking '%s' is denied.", booking.getId()));
        populateTable();
    }//GEN-LAST:event_denyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<DeliverymanOrg> deliveryOrg;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    if (service.getEnterprise().getName().equals(restaurant.getName())) {
                        RestaurantService restaurantService = (RestaurantService) service;
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = booking.getStatus();
                        row[3] = customer.getAddress();
                        row[4] = restaurantService.getStatus();
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        deliveryOrg.addItem(null);
        for (DeliverymanOrg delivery : restaurant.getListOfDeliveryManOrg()) {
            if (delivery != null) {
                deliveryOrg.addItem(delivery);
            }
        }
    }
}
