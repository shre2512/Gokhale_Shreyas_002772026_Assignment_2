/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Person {
    
    private final String name;
    private final String gender;
    private final String emailId;
    private final int age;
    private final String phoneNumber;
    private final String userName;
    private final String passWord;
    
    public Person(String name, String gender, String emailId, int age, String phoneNumber, String userName, String passWord)
    {
        this.name = name;
        this.gender = gender;
        this.emailId = emailId;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
    
}
