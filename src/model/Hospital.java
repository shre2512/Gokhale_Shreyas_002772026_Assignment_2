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
public class Hospital {
    
    private String hospitalName;
    private String hospitalZip;
    private String hospitalCommunity;
    private String hospitalCity;
    private ArrayList<Doctor> hospitalDoctors;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalZip() {
        return hospitalZip;
    }

    public void setHospitalZip(String hospitalZip) {
        this.hospitalZip = hospitalZip;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public ArrayList<Doctor> getHospitalDoctors() {
        return hospitalDoctors;
    }

    public void setHospitalDoctors(ArrayList<Doctor> hospitalDoctors) {
        this.hospitalDoctors = hospitalDoctors;
    }
    
}
