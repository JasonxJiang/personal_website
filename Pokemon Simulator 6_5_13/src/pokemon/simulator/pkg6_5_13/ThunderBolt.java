/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

/**
 *
 * @author Jason
 */
public class ThunderBolt extends SpecifiedSpecial{
    public ThunderBolt() {
        basepower = 95;
        accuracy = 100;
        primary = new Electric();
        name = "thunderbolt";

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
