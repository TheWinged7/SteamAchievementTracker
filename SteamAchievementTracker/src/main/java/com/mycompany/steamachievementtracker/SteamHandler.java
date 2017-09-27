/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

//import java.io.*;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.SteamId;
import sun.security.ssl.Debug;




/**
 *
 * @author Nick
 */
public class SteamHandler {
    
    private static SteamId selected;
    public SteamHandler()
    {
        selected=null;
    }
    public static void main(String args[]) {
        Debug.println("SteamHandler started:", "true");
    
    }
    
    public static SteamId getID()
    {     
     return selected;    
    }
    
    public static boolean setID(String id)
    {
         try{
             selected = SteamId.create(id);
             return true;
        }catch (SteamCondenserException err)
        {
            System.err.println(err);
            return false;
        }
        
         
    }
    
    public static boolean setID(long id)
    {
         try{
             selected = SteamId.create(id);
             return true;
        }catch (SteamCondenserException err)
        {
            System.err.println(err);
            return false;
        }
        
         
    }
    
}
