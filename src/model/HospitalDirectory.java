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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory()
    {
        this.hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital addNewHospital()
    {
        Hospital newHospital = new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
           
}
