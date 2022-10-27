/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class Encounters {
    
    private String hospitalName;
    private int doctorID;
    private int encounterDay;
    private int encounterMonth;
    private int encounterYear;
    private ArrayList<VitalSigns> encounterVitalSigns;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getEncounterDay() {
        return encounterDay;
    }

    public void setEncounterDay(int encounterDay) {
        this.encounterDay = encounterDay;
    }

    public int getEncounterMonth() {
        return encounterMonth;
    }

    public void setEncounterMonth(int encounterMonth) {
        this.encounterMonth = encounterMonth;
    }

    public int getEncounterYear() {
        return encounterYear;
    }

    public void setEncounterYear(int encounterYear) {
        this.encounterYear = encounterYear;
    }

    public ArrayList<VitalSigns> getEncounterVitalSigns() {
        return encounterVitalSigns;
    }

    public void setEncounterVitalSigns(ArrayList<VitalSigns> encounterVitalSigns) {
        this.encounterVitalSigns = encounterVitalSigns;
    }
    
    public String encounterDate()
    {
        return LocalDate.of(encounterYear, encounterMonth, encounterDay).toString();
    }
}
