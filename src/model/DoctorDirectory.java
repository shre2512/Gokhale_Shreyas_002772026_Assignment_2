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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory()
    {
        this.doctorDirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addNewDoctor(int doctorId, String doctorUserName, String doctorPassWord)
    {
        Doctor newDoctor = new Doctor(doctorId, doctorUserName, doctorPassWord);
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }
}
