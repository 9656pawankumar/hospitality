package ui.HealthClubManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjectModel.Booking;
import ProjectModel.Customer;
import ProjectModel.CustomerDirectory;
import ProjectModel.HealthClub;
import ProjectModel.Organization;
import ProjectModel.PhysicianOrg;
import ProjectModel.SystemAdmin;
import ProjectModel.TherapistOrg;
import ProjectModel.TrainerOrg;
import ProjectModel.services.HealthClubService;
import ProjectModel.services.Service;

public class ViewTaskPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private HealthClub healthClub;

    public ViewTaskPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, HealthClub healthClub) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.healthClub = healthClub;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
        assignWork.setBackground(new java.awt.Color(244, 120, 140));
        assignWork.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        therapistOrg = new javax.swing.JComboBox<>();
        physicianOrg = new javax.swing.JComboBox<>();
        trainerOrg = new javax.swing.JComboBox<>();
        assignWork = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "THERAPIST", "PHYSICIAN", "TRAINER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS");

        therapistOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        physicianOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        trainerOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        assignWork.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignWork.setText("ASSIGN AND CONFIRM TASK");
        assignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A THERAPIST ORG");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("SELECT A PHYSICIAN ORG");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A TRAINER ORG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(299, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(therapistOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(physicianOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trainerOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(assignWork)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(therapistOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(physicianOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(assignWork, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HealthClubService healthClubService = null;
        for (Service service : booking.getServices()) {
            if (healthClub.getName().equals(service.getEnterprise().getName())) {
                healthClubService = (HealthClubService) service;
                break;
            }
        }

        if (healthClubService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find health club");
            return;
        }
        if (!healthClubService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        TherapistOrg therapist = (TherapistOrg) therapistOrg.getSelectedItem();
        PhysicianOrg physician = (PhysicianOrg) physicianOrg.getSelectedItem();
        TrainerOrg trainer = (TrainerOrg) trainerOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
            switch (type) {
                case THERAPIST:
                    if (therapist == null) {
                        JOptionPane.showMessageDialog(this, "Please select therapist organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(therapist);
                    }
                    break;
                case PHYSICIAN:
                    if (physician == null) {
                        JOptionPane.showMessageDialog(this, "Please select physician organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(physician);
                    }
                    break;
                case TRAINER:
                    if (trainer == null) {
                        JOptionPane.showMessageDialog(this, "Please select trainer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(trainer);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            healthClubService.addOrganization(organization);
        }
        healthClubService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all healthclub services to the booking: " + booking.getId());

        return;

    }//GEN-LAST:event_assignWorkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignWork;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<PhysicianOrg> physicianOrg;
    private javax.swing.JComboBox<TherapistOrg> therapistOrg;
    private javax.swing.JComboBox<TrainerOrg> trainerOrg;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(healthClub.getName())) {

                        HealthClubService healthClubService = (HealthClubService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = healthClubService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
                            switch (type) {
                                case THERAPIST:
                                    row[3] = "YES";
                                    break;
                                case PHYSICIAN:
                                    row[4] = "YES";
                                    break;
                                case TRAINER:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                    
                }
            }
        }

    }

    private void populateComboBox() {
        therapistOrg.addItem(null);
        physicianOrg.addItem(null);
        trainerOrg.addItem(null);

        for (TherapistOrg therapist : healthClub.getListOfTherapistOrg()) {
            if (therapist != null) {
                therapistOrg.addItem(therapist);
            }
        }
        for (PhysicianOrg physician : healthClub.getListOfPhysicianOrg()) {
            if (physician != null) {
                physicianOrg.addItem(physician);
            }
        }
        for (TrainerOrg trainer : healthClub.getListOfTrainerOrg()) {
            if (trainer != null) {
                trainerOrg.addItem(trainer);
            }
        }
    }

}
