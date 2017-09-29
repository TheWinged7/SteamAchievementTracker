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
import java.util.Arrays;
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
        Thread th;
        try {
            ID = SteamId.create(id);
            ID.fetchData();

            icon = null;

        } catch (SteamCondenserException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!friend) {
            System.out.println("should only happen once");
            friends = new ArrayList<Account>();
            threads = new ArrayList<Thread>();
            URL iconUrl = null;
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

//            th = new Thread(new Runnable() {
//                @Override
//                public void run() {
            //fetchFriends();
            //Thread T = new Thread(fetchFriends());
            // T.start();
//                }
//            });
//            threads.add(th);
//            th.start();

            //threads.get(threads.size()-1).start();
            System.out.println(ID.getNickname());
        }
    }

    public void haltThreads() {

        for (int i = 0; i < threads.size(); i++) {
            if (threads.get(i).isAlive()) {
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

            icon = null;

        } catch (SteamCondenserException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!friend) {
            System.out.println("should only happen once");
            friends = new ArrayList<Account>();

            URL iconUrl = null;
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

            //Account t = this;
//            Thread th;
//            th = new Thread(new Runnable() {
//                @Override
//                public void run() {
           // fetchFriends();
            //Thread T = new Thread(fetchFriends());
            //T.start();
//                }
//            });
//            threads.add(th);
//            th.start();

            //why has this classes ID changed when it shouldnt have?
            System.out.println(ID.getNickname());
        }
    }

    public void fetchFriends() {
        List<SteamId> ids;
        ids = new ArrayList();
        if (!ID.isFetched()) {
            try {
                ID.fetchData();
                System.out.println("fetching ID info");

            } catch (SteamCondenserException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        boolean fetched = false, completed = false;

        // while (!Thread.interrupted() && !completed) {
        if (!fetched) {
            try {
                ids = Arrays.asList(ID.getFriends());
            } catch (SteamCondenserException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            fetched = true;
        }
        if (!completed) {
            ids.forEach((id)
                    -> {
                try {
                    id.fetchData();
                } catch (SteamCondenserException ex) {
                    Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(id.getNickname());
                friends.add(new Account(id.getSteamId64(), true));
            }
            );
            completed = true;
            // }
        }
        // return "completed";
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

}
