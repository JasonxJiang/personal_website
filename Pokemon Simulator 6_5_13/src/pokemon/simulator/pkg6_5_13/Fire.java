/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

/**
 *
 * @author Chins
 */
public class Fire extends Type {
    
    public Fire()
    {
         name = "Fire";
        Normal normal = new Normal(0);
        Fighting fighting = new Fighting(0);
        Flying flying = new Flying(0);
        Poison poison = new Poison(0);
        Ground ground = new Ground(0);
        Rock rock = new Rock(0);
        Bug bug = new Bug(0);
        Steel steel = new Steel(0);
        Fire fire = new Fire(0);
        Water water = new Water(0);
        Grass grass = new Grass(0);
        Electric electric = new Electric(0);
        Psychic psychic = new Psychic(0);
        Ice ice = new Ice(0);
        Dragon dragon = new Dragon(0);
        Dark dark = new Dark(0);
        Ghost ghost = new Ghost(0);
         effectiveTypes = new Type[4];
         effectiveTypes[0] = bug;
         effectiveTypes[1] = grass;
         effectiveTypes[2] = ice;
         effectiveTypes[3]=steel;
         resistantTypes = new Type[4];
         resistantTypes[0] = dragon;
         resistantTypes[3] = fire;
         resistantTypes[1] = rock;
         resistantTypes[2] = water;
         immuneTypes = new Type [0];
         
         
    }
    public Fire(int nothing)
    {
        nothing = 0;
        name = "Fire";
    }
}
