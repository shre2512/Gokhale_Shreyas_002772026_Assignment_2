/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class VitalSigns {
    
    private int patientBodyTemperature;
    private int patientPulseRate;
    private int patientRespirationRate;
    private int patientBloodPressure;
    private int doctorID;
    private int encounterID;
    private String encounterDate;

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getPatientBodyTemperature() {
        return patientBodyTemperature;
    }

    public void setPatientBodyTemperature(int patientBodyTemperature) {
        this.patientBodyTemperature = patientBodyTemperature;
    }

    public int getPatientPulseRate() {
        return patientPulseRate;
    }

    public void setPatientPulseRate(int patientPulseRate) {
        this.patientPulseRate = patientPulseRate;
    }

    public int getPatientRespirationRate() {
        return patientRespirationRate;
    }

    public void setPatientRespirationRate(int patientRespirationRate) {
        this.patientRespirationRate = patientRespirationRate;
    }

    public int getPatientBloodPressure() {
        return patientBloodPressure;
    }

    public void setPatientBloodPressure(int patientBloodPressure) {
        this.patientBloodPressure = patientBloodPressure;
    }
    
    @Override
    public String toString()
    {
        return this.encounterDate;
    }
}
