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
public class CommunityDirectory {
    
    private ArrayList<Community> communityDirectory;
    
    public CommunityDirectory()
    {
        this.communityDirectory = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
    
    public Community addNewCommunity()
    {
        Community newCommunity = new Community();
        communityDirectory.add(newCommunity);
        return newCommunity;
    }
    
}
