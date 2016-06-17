/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;


/**
 * Write a description of interface Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Move
{
    int recoilDamage(int damageDealt);
    int statBoost();
    int statDrop();
    int recoverHealth();
    double typeModifier();
    
}
