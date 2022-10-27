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
public class Patient extends Person {
    
    private ArrayList<Encounters> patientEncounters;
    private int patientHeight;
    private int patientWeight;
    
    public Patient(int patientHeight, int patientWeight, String name, String gender, String emailId, int age, String phoneNumber, String userName, String passWord)
    {
        super(name, gender, emailId, age, phoneNumber, userName, passWord);
        this.patientEncounters = new ArrayList<>();
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
    }

    public ArrayList<Encounters> getPatientEncounters() {
        return patientEncounters;
    }

    public void setPatientEncounters(ArrayList<Encounters> patientEncounters) {
        this.patientEncounters = patientEncounters;
    }

    public int getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(int patientHeight) {
        this.patientHeight = patientHeight;
    }

    public int getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }
    
}
