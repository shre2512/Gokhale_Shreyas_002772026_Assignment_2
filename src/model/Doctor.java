/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Doctor {
    
    private String doctorSpecialization;
    private String name;
    private String gender;
    private String emailId;
    private int age;
    private String phoneNumber;
    private String houseAddress;
    private String communityName;
    private String cityName;
    
    private final int doctorId;
    private final String doctorUserName;
    private final String doctorPassWord;
    
    public Doctor(int doctorId, String doctorUserName, String doctorPassWord)
    {
        this.doctorId = doctorId;
        this.doctorUserName = doctorUserName;
        this.doctorPassWord = doctorPassWord;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorUserName() {
        return doctorUserName;
    }

    public String getDoctorPassWord() {
        return doctorPassWord;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
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

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
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
        return this.name;
    }

}
