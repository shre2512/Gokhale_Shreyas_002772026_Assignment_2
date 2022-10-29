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
public class House {
    
    private String streetAddress;
    private String communityName;
    private String cityName;
    private final ArrayList<Person> residents;
    
    public House()
    {
        this.residents = new ArrayList<>();
    }

    public ArrayList<Person> getResidents() {
        return residents;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    @Override
    public String toString()
    {
        return this.streetAddress;
    }
}
