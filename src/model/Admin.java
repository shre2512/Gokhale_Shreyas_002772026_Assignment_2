/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Admin extends Person{
    
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public Admin(String role, String name, String gender, String emailId, int age, String phoneNumber, String userName, String passWord)
    {
        super(name, gender, emailId, age, phoneNumber, userName, passWord);
        this.role = role;
    }
}
