/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.steamachievementtracker;


import com.github.koraktor.steamcondenser.steam.community.*;
import com.mycompany.steamachievementtracker.SteamHandler;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.ImageIcon;






/**
 *
 * @author Nick
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    private static SteamHandler sh;
    private static List<ImageIcon> friendIcons;
    public MainUI() {
        initComponents();
       sh = new SteamHandler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        cosmeticAchievemnts = new javax.swing.JPanel();
        AchievementsScroll = new javax.swing.JScrollPane();
        SearchPanel = new javax.swing.JPanel();
        SearchLabel = new javax.swing.JLabel();
        SearchIcon = new javax.swing.JLabel();
        IDSearchBox = new javax.swing.JTextField();
        cosmeticFriends = new javax.swing.JPanel();
        FriendsScroll = new javax.swing.JScrollPane();
        FriendsTable = new javax.swing.JPanel(new GridLayout(1,2));
        AccountPanel = new javax.swing.JPanel();
        AccountName = new javax.swing.JLabel();
        AccountIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 35, 35));

        BasePanel.setBackground(new java.awt.Color(0, 0, 0));

        AchievementsScroll.setBackground(new java.awt.Color(51, 51, 51));
        AchievementsScroll.setBorder(null);
        AchievementsScroll.setForeground(new java.awt.Color(0, 0, 0));
        AchievementsScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout cosmeticAchievemntsLayout = new javax.swing.GroupLayout(cosmeticAchievemnts);
        cosmeticAchievemnts.setLayout(cosmeticAchievemntsLayout);
        cosmeticAchievemntsLayout.setHorizontalGroup(
            cosmeticAchievemntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cosmeticAchievemntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AchievementsScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
        );
        cosmeticAchievemntsLayout.setVerticalGroup(
            cosmeticAchievemntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(cosmeticAchievemntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cosmeticAchievemntsLayout.createSequentialGroup()
                    .addComponent(AchievementsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SearchPanel.setBackground(new java.awt.Color(51, 51, 51));
        SearchPanel.setForeground(new java.awt.Color(51, 51, 51));
        SearchPanel.setPreferredSize(new java.awt.Dimension(131, 60));

        SearchLabel.setBackground(new java.awt.Color(51, 51, 51));
        SearchLabel.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        SearchLabel.setForeground(new java.awt.Color(146, 146, 146));
        SearchLabel.setText("Search");

        BufferedImage raw = null;
        try{raw = javax.imageio.ImageIO.read(getClass().getResource("/search_icon.png"));}
        catch(java.io.IOException ex){ex.printStackTrace();}
        Image scaled = raw.getScaledInstance(34,34,
            java.awt.Image.SCALE_SMOOTH);

        SearchIcon.setIcon(new javax.swing.ImageIcon(scaled));
        SearchIcon.setToolTipText("");
        SearchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchIconMouseClicked(evt);
            }
        });

        IDSearchBox.setBackground(new java.awt.Color(75, 75, 75));
        IDSearchBox.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        IDSearchBox.setForeground(new java.awt.Color(204, 204, 204));
        IDSearchBox.setToolTipText("Search for Steam account by User ID or Nickname");
        IDSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        IDSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SearchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchPanelLayout.createSequentialGroup()
                        .addComponent(IDSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        cosmeticFriends.setBackground(new java.awt.Color(51, 51, 51));
        cosmeticFriends.setForeground(new java.awt.Color(51, 51, 51));

        FriendsScroll.setBackground(new java.awt.Color(51, 51, 51));
        FriendsScroll.setBorder(null);
        FriendsScroll.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout FriendsTableLayout = new javax.swing.GroupLayout(FriendsTable);
        FriendsTable.setLayout(FriendsTableLayout);
        FriendsTableLayout.setHorizontalGroup(
            FriendsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        FriendsTableLayout.setVerticalGroup(
            FriendsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        FriendsScroll.setViewportView(FriendsTable);

        javax.swing.GroupLayout cosmeticFriendsLayout = new javax.swing.GroupLayout(cosmeticFriends);
        cosmeticFriends.setLayout(cosmeticFriendsLayout);
        cosmeticFriendsLayout.setHorizontalGroup(
            cosmeticFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cosmeticFriendsLayout.createSequentialGroup()
                .addComponent(FriendsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cosmeticFriendsLayout.setVerticalGroup(
            cosmeticFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FriendsScroll)
        );

        AccountPanel.setBackground(new java.awt.Color(51, 51, 51));
        AccountPanel.setForeground(new java.awt.Color(51, 51, 51));

        AccountName.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        AccountName.setForeground(new java.awt.Color(146, 146, 146));
        AccountName.setMaximumSize(new java.awt.Dimension(28, 16));
        AccountName.setMinimumSize(new java.awt.Dimension(28, 16));
        AccountName.setPreferredSize(new java.awt.Dimension(28, 16));

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AccountPanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(AccountIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(495, Short.MAX_VALUE)))
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccountName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AccountPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AccountIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cosmeticFriends, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(AccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cosmeticAchievemnts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cosmeticFriends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cosmeticAchievemnts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setIcon()
    {
        Image accIcon = sh.getAccountIcon().getScaledInstance(34,34,
            java.awt.Image.SCALE_SMOOTH);
        AccountIcon.setIcon(new javax.swing.ImageIcon(accIcon));
        AccountIcon.setText("");
    }
    
    public void setNickname()
    {
        AccountName.setText(sh.getNickname());
    }
    
    
    private void IDSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchBoxActionPerformed
        // TODO add your handling code here:
           String user =IDSearchBox.getText();
           //SteamId selectedUser = null;
           System.out.println(user);
           if (user.matches("^[0-9]*$") && user.length()==17)
           {
               System.out.println("long version");
               long id = Long.parseLong(user);
                if (sh.setID(id))
                {
                    System.out.println("Success setting ID");
                    setIcon();
                    setNickname();
                }
           }
           else if (user.length()>0)
           {
               System.out.println("string version");
               //need some validation here i guess
               
               
               if (sh.setID(user))
                {
                    System.out.println("Success setting ID");
                    setIcon();
                    setNickname();
                }
           }
           if (sh.getID()!=null)
           {
               System.out.println("Get via user input\t"+sh.getID().getNickname());
           }
           
           /*
           thewinged7:
           76561198022970953
           grom:
           76561198020664832
           hunter:
           76561198036732968
           slayer (? catria)
           76561198083901071
           [TBoS]Grim_Fate56 | TPI //grom your already breaking shit -_-
           */
    }//GEN-LAST:event_IDSearchBoxActionPerformed

    
    
    private void SearchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIconMouseClicked
        // TODO add your handling code here:
       if (evt.getButton()==MouseEvent.BUTTON1)
       {
           String user =IDSearchBox.getText();
           //SteamId selectedUser = null;
           System.out.println(user);
           if (user.matches("^[0-9]*$") && user.length()==17)
           {
               System.out.println("long version");
               long id = Long.parseLong(user);
                if (sh.setID(id))
                {
                    System.out.println("Success setting ID");
                    setIcon();
                    setNickname();
                }
           }
           else if (user.length()>0)
           {
               System.out.println("string version");
               //need some validation here i guess
               
               
               if (sh.setID(user))
                {
                    System.out.println("Success setting ID");
                    setIcon();
                    setNickname();
                }
           }
           if (sh.getID()!=null)
           {
               System.out.println("Get via user input\t"+sh.getID().getNickname());
           }
       }
       else
       {
           System.out.println(evt.getButton());
       }
    }//GEN-LAST:event_SearchIconMouseClicked

    
    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountIcon;
    private javax.swing.JLabel AccountName;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JScrollPane AchievementsScroll;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JScrollPane FriendsScroll;
    private javax.swing.JPanel FriendsTable;
    private javax.swing.JTextField IDSearchBox;
    private javax.swing.JLabel SearchIcon;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel cosmeticAchievemnts;
    private javax.swing.JPanel cosmeticFriends;
    // End of variables declaration//GEN-END:variables
}
