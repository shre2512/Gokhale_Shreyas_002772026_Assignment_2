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
public class Community {
    
    private String communityName;
    private final ArrayList<House> communityHouses;
    private final ArrayList<Hospital> communityHospitals;
    
    public Community()
    {
        this.communityHouses = new ArrayList<>();
        this.communityHospitals = new ArrayList<>();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getCommunityHouses() {
        return communityHouses;
    }

    public ArrayList<Hospital> getCommunityHospitals() {
        return communityHospitals;
    }    
}
