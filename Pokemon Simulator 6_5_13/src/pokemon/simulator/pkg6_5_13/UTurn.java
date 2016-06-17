/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

/**
 *
 * @author Jason
 */
public class UTurn extends SpecifiedPhysical{
    public UTurn() {
        basepower = 70;
        accuracy = 100;
        type = "Bug";
        primary = new Bug();
        name = "u-turn";
    }

    public int recoilDamage(int damageDealt) {
        return 0;
    }

    public int statBoost() {
        return 0;
    }

    public int statDrop() {
        return 0;
    }

    public int recoverHealth() {
        return 0;
    }

    public double typeModifier() {
        return 0;
    }
}
