/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nick
 */
public class fetchInfo implements Runnable {

    //private static List<Account> friends;
    private static Account acc;
    private static int type;

    public fetchInfo(Account ac, int ty) {
        acc = ac;
        type = ty;
    }

    @Override
    public void run() {
        switch (type) {
            case 0:
                System.out.println(acc.getID().getSteamId64());
                acc.setFriends(getFriends(acc.getID()));
                return;
                //break;
            case 1:
                // setGames(id);
                break;
            default:
                System.err.println("unknown type");
                break;
        }

        
    }

    public List<Account> getFriends(SteamId id) {

        List<SteamId> ids = null;
        try {
            id.fetchData();
            ids = Arrays.asList(id.getFriends());
        } catch (SteamCondenserException ex) {
            Logger.getLogger(SteamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Account> friends = new ArrayList<Account>();
        int i=0;
        while (i<ids.size() && !Thread.interrupted())
        {
            try {
                ids.get(i).fetchData();
            } catch (SteamCondenserException ex) {
                Logger.getLogger(fetchInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("adding friend: " + ids.get(i).getNickname());
            friends.add(new Account(ids.get(i).getSteamId64(), true));
            i++;
        };
        return friends;
    }

    /*
    private static void setFriends(SteamId id)
    {
        try {
            id.fetchData();
            
            List<SteamId> ids =  Arrays.asList(id.getFriends());
            for (SteamId ID : ids)
            {
                
                System.out.println(ID.getNickname());
                //friends.add(new Account(ID));
            }
        } catch (SteamCondenserException ex) {
            Logger.getLogger(SteamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private static void setAchieve(SteamId id)
    {
        
    }
    
    private static void setGames(SteamId id)
    {
        
        try {
            System.out.println(id.getGames().isEmpty() +"\n"+ id.getGames().size());            
        } catch (SteamCondenserException ex) {
            Logger.getLogger(SteamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     */
}
