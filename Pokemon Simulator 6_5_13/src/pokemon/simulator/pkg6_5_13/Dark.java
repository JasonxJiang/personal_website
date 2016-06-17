/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

/**
 *
 * @author Chins
 */
public class Dark extends Type{
    public Dark()
    {
        name = "Dark";
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
        effectiveTypes = new Type [2];
        effectiveTypes[0] = ghost;
        effectiveTypes[1] = psychic;
        resistantTypes = new Type [3];
        resistantTypes[0] = dark;
        resistantTypes[1] = fighting;
        resistantTypes[2] = steel;
        immuneTypes = new Type [0];
    }
    
    public Dark(int something)
    {
        nothing = something;
        name = "Dark";
    }
}
