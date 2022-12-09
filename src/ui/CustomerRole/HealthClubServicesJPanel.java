package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ProjectModel.Booking;
import ProjectModel.HealthClub;
import ProjectModel.SystemAdmin;
import ProjectModel.services.HealthClubService;
import ui.main.DateUtils;

public class HealthClubServicesJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public HealthClubServicesJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (HealthClub healthClub : booking.getNetwork().getEnterpriseDirectory().getListOfHealthClub()) {
            healthClubCombo.addItem(healthClub);
        }
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        addServiceBtn.setBackground(new java.awt.Color(244, 120, 140));
        addServiceBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        yogaBtn = new javax.swing.JCheckBox();
        massageBtn = new javax.swing.JCheckBox();
        medicalServiceBtn = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        healthClubCombo = new javax.swing.JComboBox<>();

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("HEALTH CLUB SERVICES");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        yogaBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yogaBtn.setText("YOGA ($20)");
        yogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogaBtnActionPerformed(evt);
            }
        });

        massageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        massageBtn.setText("MASSAGE AND SPA ($20)");
        massageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massageBtnActionPerformed(evt);
            }
        });

        medicalServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicalServiceBtn.setText("MEDICAL SERVICE  ($60)");
        medicalServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalServiceBtnActionPerformed(evt);
            }
        });

        addServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");

        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("SELECT A DATE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Health Club");

        healthClubCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backBtn)
                        .addGap(155, 155, 155)
                        .addComponent(lblbookservices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(massageBtn)
                            .addComponent(medicalServiceBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(yogaBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(healthClubCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(addServiceBtn)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblbookservices)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(healthClubCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yogaBtn)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(massageBtn))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalServiceBtn)
                    .addComponent(jLabel6))
                .addGap(101, 101, 101)
                .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalServiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalServiceBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed

        HealthClub healthClub = (HealthClub) healthClubCombo.getSelectedItem();
        if (healthClub == null) {
            JOptionPane.showMessageDialog(this, "Please select a health club from the dropdown.");
            return;
        }
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();

        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean yogaBtnSelected = yogaBtn.isSelected();
        boolean massageRadioBtnSelected = massageBtn.isSelected();
        boolean medicalRadioBtnSelected = medicalServiceBtn.isSelected();

        if (!yogaBtnSelected && !massageRadioBtnSelected && !medicalRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        HealthClubService healthClubService = new HealthClubService(healthClub, date);
        if (yogaBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.TRAINER);
        }

        if (massageRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.THERAPIST);
        }

        if (medicalRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.PHYSICIAN);
        }

        booking.addService(healthClubService);
        JOptionPane.showMessageDialog(this, "Your health club appointment is booked for " + date);
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void yogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogaBtnActionPerformed

    }//GEN-LAST:event_yogaBtnActionPerformed

    private void massageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massageBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<HealthClub> healthClubCombo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JCheckBox massageBtn;
    private javax.swing.JCheckBox medicalServiceBtn;
    private javax.swing.JCheckBox yogaBtn;
    // End of variables declaration//GEN-END:variables
}
