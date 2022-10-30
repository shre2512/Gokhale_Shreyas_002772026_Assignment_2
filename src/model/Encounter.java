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
public class Encounter {
    
    private static int count = 0;
    private final int encounterID;
    
    private String hospitalName;
    private String doctorName;
    private String encounterDate;
    private String encounterSymptoms;
    private final int patientID;
    private final ArrayList<VitalSigns> encounterVitalSigns;
    
    public Encounter(int patientID)
    {
        this.encounterID = ++count;
        this.patientID = patientID;
        this.encounterVitalSigns = new ArrayList<>();
    }

    public int getEncounterID() {
        return encounterID;
    }

    public int getPatientID() {
        return patientID;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public ArrayList<VitalSigns> getEncounterVitalSigns() {
        return encounterVitalSigns;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getEncounterSymptoms() {
        return encounterSymptoms;
    }

    public void setEncounterSymptoms(String encounterSymptoms) {
        this.encounterSymptoms = encounterSymptoms;
    }
    
    @Override
    public String toString()
    {
        return this.encounterDate;
    }
    
}
