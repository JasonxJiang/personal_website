/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;


/**
 * Write a description of class boltStrike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoltStrike extends SpecifiedPhysical
{
    // instance variables - replace the example below with your own
   //Has chance of paralysis at 20% chance

    /**
     * Constructor for objects of class boltStrike
     */
    public BoltStrike()
    {
       basepower = 130;
       accuracy = 80;
       type = "Electric";
       primary = new Electric();
       name = "bolt strike";
    }

    public int recoilDamage(int damageDealt)
    {
        return 0;
    }
    
    public int statBoost()
    {
        return 0;
    }
    
    public int statDrop()
    {
        return 0;
    }
    public int recoverHealth()
    {
        return 0;
    }
    public double typeModifier()
    {
        return 0;
    }

}

