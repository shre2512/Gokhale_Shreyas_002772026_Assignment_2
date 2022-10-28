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
public class Patient {
    
    private int patientWeight;
    private String patientBloodGroup;
    private String name;
    private String gender;
    private String emailId;
    private int age;
    private String phoneNumber;
    
    private final int patientId;
    private final ArrayList<Encounter> patientEncounters;
    private final String patientUserName;
    private final String patientPassWord;
    
    public Patient(int patientId, String patientUserName, String patientPassWord)
    {
        this.patientEncounters = new ArrayList<>();
        this.patientId = patientId;
        this.patientUserName = patientUserName;
        this.patientPassWord = patientPassWord;
    }

    public int getPatientId() {
        return patientId;
    }

    public ArrayList<Encounter> getPatientEncounters() {
        return patientEncounters;
    }

    public String getPatientUserName() {
        return patientUserName;
    }

    public String getPatientPassWord() {
        return patientPassWord;
    }

    public int getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
