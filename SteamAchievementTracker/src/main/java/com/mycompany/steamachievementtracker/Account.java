/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.*;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Nick
 */
public class Account {

    private static HashMap<Integer, SteamGame> games;
    private static List<GameAchievement> achieves;
    private static List<Account> friends;
    private static Image icon;
    private static SteamId ID;
    private static List<Thread> threads;

    public Account(String id, boolean friend) {

        try {
            ID = SteamId.create(id);
            ID.fetchData();
            URL iconUrl = null;
            icon = null;
            try {
                iconUrl = new URL(ID.getAvatarIconUrl());
                if (iconUrl != null) {
                    try {
                        icon = ImageIO.read(iconUrl);
                    } catch (IOException ex) {
                        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SteamCondenserException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!friend) {
            System.out.println("should only happen once");
            friends = new ArrayList<Account>();
            threads = new ArrayList<Thread>();

            Account t = this;
            Thread th;

            th = new Thread(new Runnable() {
                @Override
                public void run() {
                    fetchInfo fr = new fetchInfo(t, 0);
                    // Thread T = new Thread(fr);
                    // threads.add(T);
                    fr.run();
                }
            });
            threads.add(th);
            th.start();

            //threads.get(threads.size()-1).start();
            System.out.println(ID.getNickname());
        }
    }

    public void haltThreads() {

        for (int i = 0; i < threads.size(); i++) {
            if (threads.get(i).isAlive())
            {
                System.out.println("thread " + i + " is alive");
            }
            threads.get(i).interrupt();
        }
        threads.clear();

    }

    public Account(long id, boolean friend) {
        try {
            ID = SteamId.create(id);
            ID.fetchData();
            URL iconUrl = null;
            icon = null;
            try {
                iconUrl = new URL(ID.getAvatarIconUrl());
                if (iconUrl != null) {
                    try {
                        icon = ImageIO.read(iconUrl);
                    } catch (IOException ex) {
                        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SteamCondenserException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!friend) {
            System.out.println("should only happen once");
            friends = new ArrayList<Account>();

            Account t = this;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fetchInfo fr = new fetchInfo(t, 0);
                    Thread T = new Thread(fr);
                    T.run();;
                }
            }).start();

            //why has this classes ID changed when it shouldnt have?
            System.out.println(ID.getNickname());
        }
    }

    public void testFriends() {
        fetchFriendsInfo();
        friends.forEach((acc) -> {
            acc.getID().getNickname();
        });
    }

    public void fetchFriendsInfo() {
        friends.forEach((ac) -> {
            try {
                ac.getID().fetchData();
            } catch (SteamCondenserException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public SteamId getID() {
        return ID;
    }

    public Image getIcon() {
        return icon;
    }

    public String getNickname() {
        return ID.getNickname();
    }

    public void setFriends(List<Account> fr) {
        if (fr != null) {
            // SteamId current = ID; //shitty workarround that shouldnt be needed
            /*
            System.out.println("shouldnt be null, length:" + fr.size());
            fr.forEach((id) -> {
                //somehow this is chaning this Accounts ID
                System.out.println("ID before adding friend: " + ID.getNickname());
                friends.add(new Account(id.getSteamId64(), true) );
                System.out.println("current ID: " + ID.getNickname()+"\n");
            });*/
            System.out.println("attempting to add friends");
            friends.addAll(fr);
            // ID = current;//shitty workarround that shouldnt be needed
        } else {
            System.out.println("Shits null mate");
        }
    }

}
