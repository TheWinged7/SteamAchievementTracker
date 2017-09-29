/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

//import java.io.*;
import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.*;
import java.awt.Image;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import sun.security.ssl.Debug;

/**
 *
 * @author Nick
 */
public class SteamHandler {

    private static Account selected;
    //private

    public SteamHandler() {
        selected = null;
    }

    public static void main(String args[]) {
        Debug.println("SteamHandler started:", "true");

    }

    public SteamId getID() {
        return selected.getID();
    }

    public Image getAccountIcon() {
        return selected.getIcon();
    }

    public String getNickname() {
        return selected.getNickname();
    }

    public static boolean setID(String id) {
        if (selected != null) {
            selected.haltThreads();
        }
        selected = new Account(id, false);
        return true;
    }

    public static boolean setID(long id) {
        if (selected != null) {
            selected.haltThreads();
        }
        selected = new Account(id, false);

        //selected.fetchData();
        return true;
    }

    /*
    private static void setFriends()
    {
        try {
            selected.fetchData();
            
            friends =  Arrays.asList(selected.getFriends());
            for (SteamId id : friends)
            {
                id.fetchData();
               // System.out.println(id.getNickname());
            }
            
        } catch (SteamCondenserException ex) {
            Logger.getLogger(SteamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private static void setAchieve()
    {
        
    }
    
    private static void setGames()
    {
        
        try { 
            System.out.println(selected.getGames().isEmpty() +"\n"+ selected.getGames().size());            
        } catch (SteamCondenserException ex) {
            Logger.getLogger(SteamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     */
}
