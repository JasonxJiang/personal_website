/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.simulator.pkg6_5_13;

/**
 *
 * @author Chins
 */
public abstract class Type {
    protected int nothing; 
    protected double typeModifier;
    protected String name;
    protected Type [] resistantTypes ;
    protected Type [] effectiveTypes ;
    protected Type [] immuneTypes ;
    
    public Type()
    {
        typeModifier = 1.0;
    }
    public void superEffective(Type primary)
    {
        int counter = 0;
        for (int i =0; i< effectiveTypes.length; i++)
        {
            if (effectiveTypes[i].equalsTo(primary.showType()))
            {
                counter +=1;
            }
        }
        typeModifier = typeModifier + (2* counter);
    }
    
    public void superEffective (Type primary, Type secondary)
    {
        int counter =0;
        for (int i =0; i<effectiveTypes.length; i++)
        {
            if(effectiveTypes[i].equalsTo(primary.showType()) || effectiveTypes[i].equalsTo(secondary.showType()))
            {
                counter ++;
            }
        }
        if (counter > 0)
        {
            typeModifier = (double) (2* counter);
        }
        
        
    }
    
   
    
    public void immune (Type primary, Type secondary)
    {
        int counter =0;
        if (immuneTypes == null)
        {
            return;
        }
        for (int i =0; i<resistantTypes.length; i++)
        {
            if(immuneTypes[i].equalsTo(primary.showType()) || immuneTypes[i].equalsTo(secondary.showType()))
            {
                typeModifier = 0.0;
            }
        }
     
        
        
    }
    
    public void resisted(Type primary, Type secondary)
    {
        int counter =0;
        for (int i =0; i<resistantTypes.length; i++)
        {
            if(resistantTypes[i].equalsTo(primary.showType()) || resistantTypes[i].equalsTo(secondary.showType()))
            {
                counter ++;
            }
        }
        if (counter > 0)
        {
            typeModifier = (double) Math.pow(.5, (double) counter);
        }
        
        
    }
    public String showType()
    {
        return name;
    }
        
    public boolean equalsTo(String otherName)
    {
        return name.equals(otherName);
    }
    
    public double getTypeModifier()
    {
        return typeModifier;
    }
}
