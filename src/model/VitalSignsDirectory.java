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
public class VitalSignsDirectory {
    
    private ArrayList<VitalSigns> vitalSignsDirectory;
    
    public VitalSignsDirectory()
    {
        this.vitalSignsDirectory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }
    
    public VitalSigns addNewVitalSigns()
    {
        VitalSigns newVitalSigns = new VitalSigns();
        vitalSignsDirectory.add(newVitalSigns);
        return newVitalSigns;
    }
    
}
