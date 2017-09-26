/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

import java.io.*;
import com.github.koraktor.steamcondenser.steam.community.*;
import com.github.koraktor.steamcondenser.exceptions.*;



/**
 *
 * @author Nick
 */
public class MainPanel {
    
    public static void main(String args[]) {
    
        SteamId focusedID = getID("TheWinged7");
        
        System.out.println(focusedID.getNickname());      
    
    }
    
    static private SteamId getID(String id)
    {
         try{
            SteamId selected = SteamId.create(id);
            return selected;
            
        }catch (SteamCondenserException err)
        {
            System.err.println(err);
            return null;
        }
        
         
    }
    
}
