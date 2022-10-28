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
public class Encounter {
    
    private String hospitalName;
    private String doctorName;
    private int encounterDay;
    private int encounterMonth;
    private int encounterYear;
    private String encounterDate;
    private final ArrayList<VitalSigns> encounterVitalSigns;
    
    public Encounter()
    {
        this.encounterVitalSigns = new ArrayList<>();
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

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate() {
        this.encounterDate = LocalDate.of(encounterYear, encounterMonth, encounterDay).toString();
    }
}
