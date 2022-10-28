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
public class City {
    
    private String cityName;
    private String stateName;
    private final ArrayList<Community> cityCommunities;

    public City()
    {
        this.cityCommunities = new ArrayList<>();
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<Community> getCityCommunities() {
        return cityCommunities;
    }
}
