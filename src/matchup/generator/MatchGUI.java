/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matchup.generator;

import java.awt.Font;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 17865
 */

public class MatchGUI extends javax.swing.JFrame {
    
    public MatchGUI() {
        
        initComponents();
        
        //Stretch Image
            
            //Image for SionPfp
        Icon i = SionImg.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(SionImg.getWidth(), SionImg.getHeight(),Image.SCALE_SMOOTH);
        SionImg.setIcon(new ImageIcon(image));
        SelectChampList.setEnabled (false);
        
            //Image for The Rune pages
        Icon ad = JRunes.getIcon();
        icon = (ImageIcon)ad;
        image = icon.getImage().getScaledInstance(JRunes.getWidth(), JRunes.getHeight(),Image.SCALE_SMOOTH);
        JRunes.setIcon(new ImageIcon(image));
        
        SelectChampList.setEnabled (true);
       
    }
   
    public static void main(String args[]) {
  
        for(int o = 0; o < 1; o++){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchGUI().setVisible(true);
            }
        });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel3 = new javax.swing.JPanel();
        JWinningChance = new javax.swing.JLabel();
        Jla = new javax.swing.JLabel();
        JDifficulty = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JComment = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JDm = new javax.swing.JLabel();
        JRunes = new javax.swing.JLabel();
        JBuild = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SionImg = new javax.swing.JLabel();
        SelectChampList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EnemyChampList = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JWinningChance.setForeground(new java.awt.Color(204, 204, 204));
        JWinningChance.setText(getName());

        Jla.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 12)); // NOI18N
        Jla.setText("Difficulty:");

        JDifficulty.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 12)); // NOI18N
        jLabel3.setText("Match up:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JWinningChance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Jla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JWinningChance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Jla, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Title.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 36)); // NOI18N
        Title.setText("Sion MatchUp Generator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        JComment.setBackground(new java.awt.Color(51, 51, 51));
        JComment.setColumns(20);
        JComment.setForeground(new java.awt.Color(204, 204, 204));
        JComment.setRows(5);
        jScrollPane1.setViewportView(JComment);

        jLabel4.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 12)); // NOI18N
        jLabel4.setText("Comment:");

        jLabel5.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 12)); // NOI18N
        jLabel5.setText("Runes:");

        JDm.setForeground(new java.awt.Color(204, 204, 204));

        JRunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/AD Runes.png"))); // NOI18N

        JBuild.setFont(new java.awt.Font("Friz Quadrata Std", 0, 12)); // NOI18N
        JBuild.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JRunes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(433, 433, 433)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDm, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(JBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JDm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JRunes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SionImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/Sion_Square.png"))); // NOI18N
        SionImg.setAutoscrolls(true);
        SionImg.setMinimumSize(new java.awt.Dimension(40, 40));

        SelectChampList.setBackground(new java.awt.Color(51, 51, 51));
        SelectChampList.setFont(new java.awt.Font("Friz Quadrata Std", 0, 12)); // NOI18N
        SelectChampList.setForeground(new java.awt.Color(204, 204, 204));
        SelectChampList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sion" }));
        SelectChampList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectChampListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 18)); // NOI18N
        jLabel1.setText("Enemy Champion");

        jLabel2.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 18)); // NOI18N
        jLabel2.setText("Your Selected Champion");

        EnemyChampList.setBackground(new java.awt.Color(51, 51, 51));
        EnemyChampList.setFont(new java.awt.Font("Friz Quadrata Std", 0, 12)); // NOI18N
        EnemyChampList.setForeground(new java.awt.Color(204, 204, 204));
        EnemyChampList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EnemyChampList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnemyChampListActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("BeaufortW01-Regular", 0, 12)); // NOI18N
        SubmitButton.setText("Go");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(SionImg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectChampList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(EnemyChampList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelectChampList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EnemyChampList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SionImg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           
        JBuild.setVisible(false);
        
        JWinningChance.setVisible(false);
        JComment.setVisible(false);
        JRunes.setVisible(false);

        String []data = {"Aatrox","Akali", "Camille", "Cassiopeia", "Cho'Gath", 
            "Darius","Diana", "Dr. Mundo", "Fiora","Gangplank", "Garen", "Gnar", "Hemerdinger",
            "Illaoi", "Irelia", "Jax", "Jayce", "Kalista","Karma", "Kayle", "Kennen", "Kled", "Lucian",
            "Malphite","Maokai", "Mordekaiser", "Nasus", "Neeko","Olaf","Ornn", "Pantheon", "Poppy",
            "Quinn", "Renekton","Riven", "Rumble", "Ryze", "Sett", "Shen","Singed",
                "Swain", "Sylas", "Teemo", "Tryndamere", "Urgot","Vayne", "Volibear", "Vladimir",
                "Wukong", "Yasuo","Yorick", "Zac","Yone"};
        
        DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
        EnemyChampList.setModel(mod);

        
        String x = String.valueOf(EnemyChampList.getSelectedItem());
        String w = "Win",runes;
        String l = "Lose";
        String s = "Skill";
        System.out.println(x);
        
    }//GEN-LAST:event_formWindowOpened

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        
        Icon t = new ImageIcon("D:\\Destop\\College\\Java\\"
            + "Final Project things\\tank Runes.png");
        Icon ad = new ImageIcon("D:\\Destop\\College\\Java\\"
            + "Final Project things\\AD Runes.png");
        
      
        JWinningChance.setFont(new Font("Friz Quadrata Std", Font.PLAIN, 12));
        JDifficulty.setFont(new Font("Friz Quadrata Std", Font.PLAIN, 12));
        JComment.setFont(new Font("Friz Quadrata Std", Font.PLAIN, 12));
        JDm.setFont(new Font("Friz Quadrata Std", Font.PLAIN, 12));   
        JComment.setText(null);
        JBuild.setText(null);
        
      if(!JBuild.isVisible()){
          JBuild.setVisible(true);
          JWinningChance.setVisible(true);
          JComment.setVisible(true);
          JRunes.setVisible(true);
          
      }
        JDm.setText("");
        String z = JDm.getText(), x = String.valueOf(EnemyChampList.getSelectedItem());
        String winChance = "", w = "Win", e = "Easy", imp = "Impossible", l = "Lose";
        String s = "Skill",h = "Hard", m = "Medium", T = "Tank", Ad = "Lethality";
        
         //System.out.println(x);
      
      if("Aatrox".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append(" try and juke the sweet spots of his Q and only charge"
                  + " your Q when he \n has no way of ccing you anymore only take quick trades "); 
          winChance = l; JDifficulty.setText(h); 
      }if("Akali".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append("never charge Q if you dont have minion in front of you to protect you \nfrom her "
                  + "E if she ulties you then ulty away so she ulties with her 2nd R into\nyour ult if you "
                  + "can then take long trades dont be afraid to brute force her \ndown and just auto her to death you"
                  + " win long trades"); 
           winChance = w; JDifficulty.setText(h); 
      }if("Camille".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("wkite and outrange her with your range after she went in with E never try to "
                  + "\nult away since she will just ult you and mess you up W her W so you lock\na lot of dmg but "
                  + "still doesnt break it so you get dmg off aswell on your W ");
          winChance = s; JDifficulty.setText(h); 
      }if("Cassiopeia".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("dont walk up and Q unless its a guranteed knockup and that you can \ndissengage"
                  + " after since she can just Q and kill you if she wont get knocked \nup burn her F before lvl 6"
                  + " (probably you will die doing it) then at lvl 6 \njust E into R her and you win");
          winChance = w; JDifficulty.setText(m);
      }if("Cho'Gath".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("walk up and Q him and if he uses his W to interrupt you then let him \ninterrupt"
                  + " but if he uses his Q to interrupt then release your Q at the last \nsecond never let him"
                  + " auto you he cant kill you so just farm and outscale \n(can kill him early game)");
          winChance = w; JDifficulty.setText(m);
      }if("Darius".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("Goddamn broken champ you can't win trades against this champion can be \nconsidered as"
                  + " a ban if it is often pick in your elo");
          winChance = l; JDifficulty.setText(imp);
      }if("Diana".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("poke her down with Q even if you were to die in this matchup you will \nmost likely "
                  + "kill her in passive");
          winChance = w; JDifficulty.setText(e);
      }if("Dr. Mundo".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("you have kill potential early game but later just looking to farm up and \noutscale "
                  + "if you would die early game then just kill him in the passive");
          winChance = w; JDifficulty.setText(e);
      }if("Fiora".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append("mindgames with her W and your Q. In early game only do fast Q \n(no knockup) then "
                  + "when you got serrated dirk and some lvls you can \ncharge it fully but she has to parry early"
                  + " or else she wins so be careful a \ncombo to gurantee fully charge is to let her dash on you "
                  + "then ult her melee \nrange into q charge this will make her panic and do fast parry but then you "
                  + "\njust hold your Q and she parries nothing basically buy a bramble vest");
          winChance = s; JDifficulty.setText(h);
      }if("Gangplank".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("you win by poking him down with Q but only if you dodge his barrels \nand never let him "
                  + "auto you otherwise you lose look to kill him in your \npassive whenever you die. Dont proxy vs gp");
          winChance = w; JDifficulty.setText(m);
      }if("Garen".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("poke him down with Q never let him get in melee range of you E him \nafter he uses his"
                  + " Q not before");
          winChance = w; JDifficulty.setText(e);
      }if("Gnar".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("poke him down with fast Q if he ever uses his E then E into R him. care for \nhis mega"
                  + " its the only time he can beat you");
          winChance = s; JDifficulty.setText(m);
      }if("Hemerdinger".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("focus on csing and then lvl 6 E into R him should be 1shot. get null magic \nmantle and"
                  + " he doesnt deal dmg anymore if he ever places big boy turret \nthen just E it away ");
          winChance = w; JDifficulty.setText(e);
      }if("Illaoi".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("juke her E if her E is down just walk up slow her and fully charge Q. if you \nexpect "
                  + "that she will try and ult you just charge your Q she will think she \ncan time it to dodge the "
                  + "cc but 99% of the times they miss time it if you \ndo it fully charge and then you can just release "
                  + "it and run away");
          winChance = w; JDifficulty.setText(m);
      }if("Irelia".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append("sit at your turret can only try and trade with her when she doesnt have \nminions to dash "
                  + "on 5 stacks on her passive. ");
          winChance = l; JDifficulty.setText(h);
      }if("Jax".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append("force the wave to be at your turret not his wait with all your cds untill he \nwent in on "
                  + "you and his e is down then you can fully charge him");
          winChance = l; JDifficulty.setText(h);
          
      }if("Jayce".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("care early game lvl 6 E into R him. pre charge your Q so he might jump on you and \nyou"
                  + " interrupt him mid air (if you start charge too late he will just \njump on you and e you before"
                  + " youre able to knock him up)");
          winChance = w; JDifficulty.setText(m);

      }if("Kalista".equals(x)){
          JRunes.setIcon(t); Icon tankIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)tankIcon; JBuild.setText(T);
          JComment.append("stay back and hope to get help dont charge Q since she just jumps out of it better \n"
                  + "to hold it so she has to respect it");
          winChance = l; JDifficulty.setText(imp);
      }if("Karma".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("litteraly free lane just slow her into Q or R and you insta win");
          winChance = w; JDifficulty.setText(e);
      }if("Kayle".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("only way she beats you is if she dodge your Q so always slow her before \nchargin it "
                  + "dont be afraid to E into R even if she ulties your ulty you will still \nget a fully charged Q s"
                  + "o she dies anyways ");
          winChance = w; JDifficulty.setText(e);
      }if("Kennen".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("try and bait his E by walking up and charging Q on him your Q will be back \nup a lot fast"
                  + " so then you can either E into R or E into Q and it should be a free kill. \ncare his early game tho"
                  + " since its hard killing him in the passive");
          winChance = s; JDifficulty.setText(e);
      }if("Kled".equals(x)){
          JRunes.setIcon(null); JDm.setText("You can go either Tank or Lethality, Go whichever you like");
          JComment.append("dont ever be melee range when he is about to dismount. dont E into Q in \nthis nmatchup "
                  + "you just want to Q so that you can interrupt his E if you E \ninto Q this is rarely going to work.  "
                  + "make it a short lane so he cant run you \ndown (minions at your turret)");
          winChance = s; JDifficulty.setText(h);
      }if("Tryndamere".equals(x)){
          JRunes.setIcon(ad); Icon adIcon = JRunes.getIcon(); ImageIcon icon = (ImageIcon)adIcon; JBuild.setText(Ad);
          JComment.append("make it a short lane (minions at your turret not his) never charge your Q \nunless youre "
                  + "from max range or his E is down. You win by kiting if he uses his e to \nengage just slow him move "
                  + "out of melee range and get a good Q off");
          winChance = s; JDifficulty.setText(h);
      }
          
    
      
      
      
      if(!z.equals("")){JDm.setText("");}
      if(!winChance.equals(s)){
      if(!winChance.equals(s)){JWinningChance.setText("You " + winChance + " this match up");}
        }else{JWinningChance.setText("This is a " + winChance + " match up, Beware");}
      
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void EnemyChampListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnemyChampListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnemyChampListActionPerformed

    private void SelectChampListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectChampListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectChampListActionPerformed
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EnemyChampList;
    private javax.swing.JLabel JBuild;
    private javax.swing.JTextArea JComment;
    private javax.swing.JLabel JDifficulty;
    private javax.swing.JLabel JDm;
    private javax.swing.JLabel JRunes;
    private javax.swing.JLabel JWinningChance;
    private javax.swing.JLabel Jla;
    private javax.swing.JComboBox<String> SelectChampList;
    private javax.swing.JLabel SionImg;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
   
}
