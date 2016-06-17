/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

import java.awt.Graphics;
import java.util.HashMap;
import javax.swing.JTextField;
import java.util.ArrayList;
/**
 *
 * @author Jason
 */
public class main extends javax.swing.JApplet {

    /**
     * Initializes the applet main
     */
    private static HashMap<String, Move> moveLibrary;
    //private static HashMap<String, Pokemon> pokemonLibrary;
    private JTextField userInput;
    private static HashMap<String, Pokemon> pokeLibrary;
    private Pokemon user;
    private Pokemon foe;
    public static HashMap<String, Move> moveLibrary()
    {
        if(moveLibrary == null)
        {
            Move m1 = new BoltStrike();
            Move m2 = new Inferno();
            Move m3 = new Hurricane();
            Move m4 = new Psystrike();
            Move m5 = new DarkPulse();
            Move m6 = new ZenHeadbutt();
            Move m7 = new DragonClaw();
            Move m8 = new Earthquake();
            moveLibrary = new HashMap<String, Move>();
            moveLibrary.put("bolt strike",m1);
            moveLibrary.put("inferno" ,m2);
            moveLibrary.put("hurricane" ,m3);
            moveLibrary.put("psystrike" ,m4);
            moveLibrary.put("dark pulse", m5);
            moveLibrary.put("zen headbutt", m6);
            moveLibrary.put("dragon claw", m7);
            moveLibrary.put("earthquake", m8);
        }
        
        return moveLibrary;
    }  
    
    public static HashMap<String, Pokemon> pokeLibrary()
    {
        if(pokeLibrary == null)
        {
            Pokemon p1 = new Victini();
            Pokemon p2 = new Groundon();
            Pokemon p3 = new DeoxysA();
            Pokemon p4 = new GiratinaO();
            Pokemon p5 = new Kyogre();
            Pokemon p6 = new KyuremW();
            Pokemon p7 = new Mewtwo();
            Pokemon p8 = new Rayquaza();
            Pokemon p9 = new ShayminS();
            pokeLibrary = new HashMap<String, Pokemon>();
            pokeLibrary.put("victini", p1);
            pokeLibrary.put("groundon", p2);
            pokeLibrary.put("deoxys a", p3);
            pokeLibrary.put("giratina o", p4);
            pokeLibrary.put("kyogre", p5);
            pokeLibrary.put("kyurem w", p6);
            pokeLibrary.put("mewtwo", p7);
            pokeLibrary.put("rayquaza", p8);
            pokeLibrary.put("shaymin s", p9);
                    
        }
        
        return pokeLibrary;
        
    }
    @Override
    public void init() {
       
        initComponents();
        
        //user = new Victini();
        //foe = new Groundon();
        
        //display.append("You sent out " + user.showName() + "!" + "\n" +"Opponent sent out " + foe.showName() +"!" + "\n");
        display.append("Pick a pokemon to use" + "\n");
        display.append("victini"+ "\n");
        display.append("groundon"+ "\n");
        display.append("deoxys a"+ "\n");
        display.append("giratina o"+ "\n");
        display.append("kyogre"+ "\n");
        display.append("kyurem w"+ "\n");
        display.append("mewtwo"+ "\n");
        display.append("rayquaza"+ "\n");
        display.append("shaymin s"+ "\n");
        //userHP.setText("Your HP:" + user.showHP());
        
        
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        userHP = new javax.swing.JTextField();
        moveInput = new javax.swing.JTextField();
        foeHP = new javax.swing.JTextField();
        pokemonChooser = new javax.swing.JTextField();
        starter = new javax.swing.JButton();
        pokemonConfirm = new javax.swing.JButton();

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        userHP.setText("Your HP:");

        moveInput.setText("Type in a Move");

        foeHP.setText("Foe HP:");

        pokemonChooser.setText("Type in a Pokemon");

        starter.setText("Confirm");
        starter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starterActionPerformed(evt);
            }
        });

        pokemonConfirm.setText("Confirm ");
        pokemonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemonConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(foeHP)
                    .addComponent(userHP, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moveInput, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(pokemonChooser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(starter, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(pokemonConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starter))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foeHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemonChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemonConfirm))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void starterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starterActionPerformed
        int userDealt =0;
        int foeDealt =0;
        double stab = 1.0;
        String searchTerm = moveInput.getText();
        double typeBonus = 1.0;
        double foeTypeBonus = 1.0;
        int userCrit = 1;
        int foeCrit = 1;
        boolean userAttackMisses = false;
        boolean foeAttackMisses = false;
        //confirms physical move
        if (user.getMove(searchTerm) instanceof SpecifiedPhysical)
        {
            
            SpecifiedPhysical userMove = (SpecifiedPhysical) (user.getMove(searchTerm));
            Type userElement = userMove.getType(); 
            userElement.superEffective(foe.getType1(), foe.getType2());
            userElement.resisted(foe.getType1(), foe.getType2());
            //userElement.immune(foe.getType1(), foe.getType2());
            typeBonus = userElement.getTypeModifier();
            
            if (userMove.hits() == false)
            {
                userDealt = 0;
                //display.append("The attack missed!" + "\n");
                //userAttackMisses = true;
            }
            
            else 
            {
                if (userMove.criticalHit() == true) {
                    userCrit = 2;
                    //display.append("It was a critical hit!" + "\n");
                }

                if (user.showType1().equals(userMove.showType()) || user.showType2().equals(userMove.showType())) {
                    stab = 1.5;
                }
                int random = (int) (Math.random() * 16) + 85;
                userDealt = userMove.inflictPhysicalDamage(user.showAtk(), foe.showDef(), user.showLevel(), stab, typeBonus, random, userCrit);
                //foe.takeDamage(userDealt);
            }
        }
        
        // confirms user special move
        if (user.getMove(searchTerm) instanceof SpecifiedSpecial)
        {
            SpecifiedSpecial userMove = (SpecifiedSpecial) (user.getMove(searchTerm));
            Type userElement = userMove.getType();
            userElement.superEffective(foe.getType1(), foe.getType2());
            userElement.resisted(foe.getType1(), foe.getType2());
            //userElement.immune(foe.getType(), foe.getType2());
            typeBonus = userElement.getTypeModifier();
            
             if (userMove.hits() == false)
            {
                userDealt = 0;
                userAttackMisses=true;
                //display.append("The attack missed!" +"\n");
            }
             
             else if (userMove.hits() == true)
             {
                 if (userMove.criticalHit() == true) {
                     userCrit = 2;
                     //display.append("It was a critical hit!" +"\n");
                 }
                 
                 

                 if (user.showType1().equals(userMove.showType()) || user.showType2().equals(userMove.showType())) {
                     stab = 1.5;
                 }

                 int random = (int) (Math.random() * 16) + 85;
                 userDealt = userMove.inflictSpecialDamage(user.showSpa(), foe.showSdf(), user.showLevel(), stab, typeBonus, random, userCrit);
                 //foe.takeDamage(userDealt);
             }
        }
        // confirms opponents move
       
        int randomKey = (int) (Math.random() * 4);
        int opponentRNG = (int) (Math.random() * 16) + 85;
        String foeUsed = "";
        if (foe.getMove(randomKey) instanceof SpecifiedPhysical)
        {
            SpecifiedPhysical foeMove = (SpecifiedPhysical) (foe.getMove(randomKey));
            foeUsed = foeMove.showNmae();
            Type foeElement = foeMove.getType();
            foeElement.superEffective(user.getType1(), user.getType2());
            foeElement.resisted(user.getType1(), user.getType2());
            foeTypeBonus= foeElement.getTypeModifier();
            if (foeMove.hits() == false) {
                foeDealt = 0;
                foeAttackMisses = true;
                //display.append("The foe used " + foeMove.showName() + "! The foe's attack missed!" +"\n");
            } else {
                if (foe.showType1().equals(foeMove.showType()) || foe.showType2().equals(foeMove.showType())) {
                    stab = 1.5;
                }

                if (foeMove.criticalHit() == true) {
                    foeCrit = 2;
                    //display.append("It was a critical hit!" +"\n");
                }
                foeDealt = foeMove.inflictPhysicalDamage(foe.showSpa(), user.showSdf(), 100, stab, foeTypeBonus, opponentRNG, foeCrit);    
                //foeDealt = foeMove.inflictSpecialDamage(foe.showSpa(), user.showSdf(), 100, stab, foeTypeBonus, opponentRNG, foeCrit);
                //user.takeDamage(foeDealt);
            }
        }
        
        if (foe.getMove(randomKey) instanceof SpecifiedSpecial)
        {
            SpecifiedSpecial foeMove = (SpecifiedSpecial) (foe.getMove(randomKey));
            foeUsed = foeMove.showName();
            Type foeElement = foeMove.getType();
            foeElement.superEffective(user.getType1(), user.getType2());
            foeElement.resisted(user.getType1(), user.getType2());
            foeTypeBonus = foeElement.getTypeModifier();
            if (foeMove.hits() == false) {
                foeDealt = 0;
                foeAttackMisses = true;
                //display.append("The foe used " + foeMove.showName() + "! The foe's attack missed!" +"\n");
            } else {
                if (foe.showType1().equals(foeMove.showType()) || foe.showType2().equals(foeMove.showType())) {
                    stab = 1.5;
                }

                if (foeMove.criticalHit() == true) {
                    foeCrit = 2;
                    //display.append("It was a critical hit!" +"\n");
                }

                foeDealt = foeMove.inflictSpecialDamage(foe.showSpa(), user.showSdf(), 100, stab, foeTypeBonus, opponentRNG, foeCrit);
                //user.takeDamage(foeDealt);
            }
            
        }
        /*SpecifiedSpecial foeMove = (SpecifiedSpecial) (main.moveLibrary().get("inferno"));
        Type foeElement = foeMove.getType();
        foeElement.superEffective(user.getType1(), user.getType2());
        foeElement.resisted(user.getType1(), user.getType2());
        //foeElement.immune(user.getType(), user.getType2());
        foeTypeBonus = foeElement.getTypeModifier();*/
        
        
      
        
        String userHits = "" + userDealt;
        String foeHits = "" + foeDealt;
        if (foe.showSpeed() > user.showSpeed())
        {
            display.append("\n" + "The foe's " + foe.showName() + " used " + foeUsed + "\n");
            if (foeAttackMisses == true)
            {
                display.append("The attack missed!" +"\n");
            }
            else
                
            {
                user.takeDamage(foeDealt);
                
                if (foeTypeBonus > 1.0) {
                    display.append("It was super effective!" + "\n");
                }
                if (foeTypeBonus < 1.0) {
                    display.append("It's not very effective...." + "\n");
                }
                display.append("The foe dealt " + foeHits + "\n");
                if (user.showHP() == 0) {
                    display.append("Your " + user.showName() + " fainted!" + "\n");
                } 
                else {
                    
                    foe.takeDamage(userDealt);
                    display.append(user.showName() + " used " + searchTerm + "!" + "\n");
                    if (userAttackMisses==true)
                    {
                        display.append("Your attack missed!" + "\n");
                    }
                    else{
                    if (typeBonus > 1.0) {
                        display.append("It was super effective!" + "\n");
                    }
                    if (typeBonus < 1.0) {
                        display.append("It's not very effective...." + "\n");
                    }
                    display.append("You dealt " + userHits + "\n");
                    {
                        if (foe.showHP() == 0) {
                            display.append("The foe's " + foe.showName() + " fainted!" + "\n");
                        }
                    }
                    }
                }
            }
        }
        
        if (user.showSpeed()>= foe.showSpeed())
        {
            foe.takeDamage(userDealt);
            display.append("\n" + user.showName() + " used " + searchTerm + "!" + "\n");
            if (userAttackMisses==true);
            {
                //display.append("Your attack missed!" + "\n");
            }
            
            if (typeBonus > 1.0 && userAttackMisses == false) {
                display.append("It was super effective!" + "\n");
            }
            if (typeBonus < 1.0 && userAttackMisses == false) {
                display.append("It's not very effective...." + "\n");
            }
            display.append("You dealt " + userHits +"\n");
            if (foe.showHP()==0)
            {
                display.append("The foe has fainted!" +"\n");
            }
            
            else
            {
                user.takeDamage(foeDealt);
                display. append( "The foe's " + foe.showName() + " used " + foeUsed + "\n");
                if (foeAttackMisses==true)
                {
                    display.append("Your foe's attack missed!" +"\n");
                }
                if (foeTypeBonus > 1.0) {
                    display.append("It was super effective!" + "\n");
                }
                if (foeTypeBonus < 1.0) {
                    display.append("It's not very effective...." + "\n");
                }
                display.append("The foe dealt " + foeHits + "\n");
                if (user.showHP() ==0)
                {
                    display.append("Your " + user.showName() + " has fainted!" +"\n");
                }
            }
        
    }
        
        //display.append(user.showName() + " used " + searchTerm + "!" + "\n");
        if (userCrit ==2 && userAttackMisses == false && user.showHP()>0);
        {
            display.append("Your attack was a critical hit!" +"\n");
        }
        //display. append( "The foe's " + foe.showName() + " used " + foeMove.showName() + "\n");
        if (foeCrit == 2 && foeAttackMisses == false&& foe.showHP()>0)
        {
            display.append("The foe's attack was a critical hit!" + "\n");
        }
        
        //display.append("You dealt " + userHits + "\n" + "The foe dealt " + foeHits + "\n");
        //display.append("You dealt" + userHits +"\n");
        //display.append("The foe dealt " + foeHits + "\n");
        String userHealth =  "" + user.showHP();
        String foeHealth = ""+ foe.showHP();
        userHP.setText("Your HP:" + userHealth);
        foeHP.setText("Foe HP:" + foeHealth);
        pokemonChooser.setText(user.showStatus());
        
    }//GEN-LAST:event_starterActionPerformed

    private void pokemonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemonConfirmActionPerformed
        String pokemonKey = pokemonChooser.getText();
        user = main.pokeLibrary().get(pokemonKey);
        display.append("\n" + "You sent out " + user.showName() +"\n");
        userHP.setText("Your HP:" + user.showHP());
        ArrayList<String> pokeKeys = new ArrayList<String>();
        pokeKeys.add("victini");
        pokeKeys.add("groundon");
        pokeKeys.add("deoxys a");
        pokeKeys.add("giratina o");
        pokeKeys.add("kyogre");
        pokeKeys.add("kyurem w");
        pokeKeys.add("mewtwo");
        pokeKeys.add("rayquaza");
        pokeKeys.add("shaymin s");
        int randomPokeKey = (int) (Math.random() * pokeKeys.size());
        foe = main.pokeLibrary().get(pokeKeys.get(randomPokeKey));
        display.append("The opponent sent out " + foe.showName() + "\n");
        foeHP.setText("Foe HP:" + foe.showHP());
        display.append("Type one into the move box" +"\n");
        display.append("1." + user.getCircumvent().get(0) + " " + "2." + user.getCircumvent().get(1) +"\n");
        display.append("3."+ user.getCircumvent().get(2) + " " + "4." + user.getCircumvent().get(3) + "\n");
        //display.append("1." + foe.getCircumvent().get(0) + " " + "2." + foe.getCircumvent().get(1) + "\n");
        //display.append("3." + foe.getCircumvent().get(2) + " " + "4." + foe.getCircumvent().get(3) + "\n");
        String userHealth = "" + user.showHP();
        String foeHealth = "" + foe.showHP();
        userHP.setText("Your HP:" + userHealth);
        foeHP.setText("Foe HP:" + foeHealth);
                 
        
    }//GEN-LAST:event_pokemonConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea display;
    private javax.swing.JTextField foeHP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField moveInput;
    private javax.swing.JTextField pokemonChooser;
    private javax.swing.JButton pokemonConfirm;
    private javax.swing.JButton starter;
    private javax.swing.JTextField userHP;
    // End of variables declaration//GEN-END:variables
}
