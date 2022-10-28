/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory()
    {
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addNewPatient(int patientId, String patientUserName, String patientPassWord)
    {
        Patient newPatient = new Patient(patientId, patientUserName, patientPassWord);
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
}
