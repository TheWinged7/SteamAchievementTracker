/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

//import java.io.*;
import com.github.koraktor.steamcondenser.steam.community.*;
import java.awt.Image;

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
            //  selected.haltThreads();
        }
        selected = null;
        selected = new Account(id, false);
        return true;
    }

    public static boolean setID(long id) {
        if (selected != null) {
            // selected.haltThreads();
        }
        selected = null;
        selected = new Account(id, false);
        //selected.fetchData();
        return true;
    }
    
    public void setFriends()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                selected.fetchFriends();
            }
        }).start();
    }

}
