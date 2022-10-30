/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.IOException;


import model.Doctor;
import model.EncounterDirectory;
import model.PatientDirectory;
import model.VitalSignsDirectory;

/**
 *
 * @author shrey
 */

public class doctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdmin
     */
    Doctor d;
    EncounterDirectory ed;
    PatientDirectory patientDirectory;
    VitalSignsDirectory vitalSignsDirectory;
    
    public doctorJPanel(Doctor d, EncounterDirectory ed, PatientDirectory patientDirectory, VitalSignsDirectory vitalSignsDirectory) throws IOException {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.ed = ed;
        this.d = d;
        this.vitalSignsDirectory = vitalSignsDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        doctorEncounters = new javax.swing.JPanel();
        encountersSplitPane = new javax.swing.JSplitPane();
        encountersControlArea = new javax.swing.JPanel();
        btnViewEncounter = new javax.swing.JButton();
        btnUpdateEncounter = new javax.swing.JButton();
        encountersWorkArea = new javax.swing.JPanel();
        vitalSigns = new javax.swing.JPanel();
        vitalSignSplitPane = new javax.swing.JSplitPane();
        vitalSignsControlArea = new javax.swing.JPanel();
        btnCreateVitalSigns = new javax.swing.JButton();
        btnUpdateVitalSigns = new javax.swing.JButton();
        vitalSignsWorkArea = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 102));
        tabbedPane.setForeground(new java.awt.Color(0, 0, 255));
        tabbedPane.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        encountersSplitPane.setPreferredSize(new java.awt.Dimension(250, 23));

        encountersControlArea.setBackground(new java.awt.Color(102, 255, 102));

        btnViewEncounter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewEncounter.setText("View");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnUpdateEncounter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateEncounter.setText("Update");
        btnUpdateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout encountersControlAreaLayout = new javax.swing.GroupLayout(encountersControlArea);
        encountersControlArea.setLayout(encountersControlAreaLayout);
        encountersControlAreaLayout.setHorizontalGroup(
            encountersControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encountersControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encountersControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnViewEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        encountersControlAreaLayout.setVerticalGroup(
            encountersControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encountersControlAreaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        encountersSplitPane.setLeftComponent(encountersControlArea);

        encountersWorkArea.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout encountersWorkAreaLayout = new javax.swing.GroupLayout(encountersWorkArea);
        encountersWorkArea.setLayout(encountersWorkAreaLayout);
        encountersWorkAreaLayout.setHorizontalGroup(
            encountersWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        encountersWorkAreaLayout.setVerticalGroup(
            encountersWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        encountersSplitPane.setRightComponent(encountersWorkArea);

        javax.swing.GroupLayout doctorEncountersLayout = new javax.swing.GroupLayout(doctorEncounters);
        doctorEncounters.setLayout(doctorEncountersLayout);
        doctorEncountersLayout.setHorizontalGroup(
            doctorEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encountersSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        doctorEncountersLayout.setVerticalGroup(
            doctorEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encountersSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Encounters", doctorEncounters);

        vitalSignsControlArea.setBackground(new java.awt.Color(102, 255, 102));

        btnCreateVitalSigns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateVitalSigns.setText("Create");
        btnCreateVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignsActionPerformed(evt);
            }
        });

        btnUpdateVitalSigns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateVitalSigns.setText("Update");

        javax.swing.GroupLayout vitalSignsControlAreaLayout = new javax.swing.GroupLayout(vitalSignsControlArea);
        vitalSignsControlArea.setLayout(vitalSignsControlAreaLayout);
        vitalSignsControlAreaLayout.setHorizontalGroup(
            vitalSignsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignsControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdateVitalSigns, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(vitalSignsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vitalSignsControlAreaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCreateVitalSigns, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        vitalSignsControlAreaLayout.setVerticalGroup(
            vitalSignsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vitalSignsControlAreaLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(btnUpdateVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(vitalSignsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vitalSignsControlAreaLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(btnCreateVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );

        vitalSignSplitPane.setLeftComponent(vitalSignsControlArea);

        vitalSignsWorkArea.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout vitalSignsWorkAreaLayout = new javax.swing.GroupLayout(vitalSignsWorkArea);
        vitalSignsWorkArea.setLayout(vitalSignsWorkAreaLayout);
        vitalSignsWorkAreaLayout.setHorizontalGroup(
            vitalSignsWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        vitalSignsWorkAreaLayout.setVerticalGroup(
            vitalSignsWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        vitalSignSplitPane.setRightComponent(vitalSignsWorkArea);

        javax.swing.GroupLayout vitalSignsLayout = new javax.swing.GroupLayout(vitalSigns);
        vitalSigns.setLayout(vitalSignsLayout);
        vitalSignsLayout.setHorizontalGroup(
            vitalSignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vitalSignSplitPane)
        );
        vitalSignsLayout.setVerticalGroup(
            vitalSignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vitalSignSplitPane)
        );

        tabbedPane.addTab("Vital Signs", vitalSigns);

        lblWelcome.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 0, 0));
        lblWelcome.setText("                                                                                        Welcome Doctor !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        viewDoctorEncounters viewEncounters = new viewDoctorEncounters(d, ed, patientDirectory);
        encountersSplitPane.setRightComponent(viewEncounters);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnCreateVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignsActionPerformed
        // TODO add your handling code here:
        createVitalSigns createVitals = new createVitalSigns(d, ed, patientDirectory, vitalSignsDirectory);
        vitalSignSplitPane.setRightComponent(createVitals);
    }//GEN-LAST:event_btnCreateVitalSignsActionPerformed

    private void btnUpdateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncounterActionPerformed
        // TODO add your handling code here:
        updateDoctorEncounters updateEncounters = new updateDoctorEncounters(d, ed, patientDirectory);
        encountersSplitPane.setRightComponent(updateEncounters);
    }//GEN-LAST:event_btnUpdateEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateVitalSigns;
    private javax.swing.JButton btnUpdateEncounter;
    private javax.swing.JButton btnUpdateVitalSigns;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JPanel doctorEncounters;
    private javax.swing.JPanel encountersControlArea;
    private javax.swing.JSplitPane encountersSplitPane;
    private javax.swing.JPanel encountersWorkArea;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JSplitPane vitalSignSplitPane;
    private javax.swing.JPanel vitalSigns;
    private javax.swing.JPanel vitalSignsControlArea;
    private javax.swing.JPanel vitalSignsWorkArea;
    // End of variables declaration//GEN-END:variables
}
