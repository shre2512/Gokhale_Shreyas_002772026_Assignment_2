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
public class EncounterDirectory {
    
    private ArrayList<Encounter> encounterDirectory;
    
    public EncounterDirectory()
    {
        this.encounterDirectory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(ArrayList<Encounter> encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }
    
    public Encounter addNewEncounter(int patientID)
    {
        Encounter newEncounter = new Encounter(patientID);
        encounterDirectory.add(newEncounter);
        return newEncounter;
    }
}
