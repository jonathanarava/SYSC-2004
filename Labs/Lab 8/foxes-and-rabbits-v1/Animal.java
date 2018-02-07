import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;

/**
 * Abstract class Animal - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal
{
  
   // Individual characteristics (instance fields).
    
    // The rabbit's age.
    public int age;
    // Whether the rabbit is alive or not.
    public boolean alive;
    // The rabbit's position.
    public Location location;
    // The field occupied.
    public Field field;
    
    private List<Animal> animals;
    
    public Animal(boolean randomAge, Field field, Location location){
        
        this.field = field;
        this.location = location;
    }

    /**
     * Check whether the rabbit is alive or not.
     * @return true if the rabbit is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }
    
    /**
     * Indicate that the rabbit is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    /**
     * Return the rabbit's location.
     * @return The rabbit's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Place the rabbit at the new location in the given field.
     * @param newLocation The rabbit's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    public Field getField()
    {
        return field;
    }
    
    /**
     * represents whatever behavior is appropriate for the animal
     * 
     */
    
     public void act(List<Animal> newAnimals){
         
         // rabbit act
        incrementAge();
        if(alive) {
            giveBirth(newAnimals);            
            // Try to move into a free location.
            Location newLocation = field.freeAdjacentLocation(location);
            if(newLocation != null) {
                super.setLocation(newLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
         
         // monster act
        incrementHunger();
        Location newLocation = findFood();
        if(newLocation == null) { 
           // No food found - try to move to a free location.
           newLocation = field.freeAdjacentLocation(location);
        }
            // See if it was possible to move.
        else if(newLocation != null) {
           super.setLocation(newLocation);
        }
        
        // fox act
        incrementAge();
        incrementHunger();
        if(alive) {
            giveBirth(newAnimals);            
            // Move towards a source of food if found.
            Location newLocation = findFood();
            if(newLocation == null) { 
                // No food found - try to move to a free location.
                newLocation = field.freeAdjacentLocation(location);
            }
            // See if it was possible to move.
            if(newLocation != null) {
                super.setLocation(newLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
   }
   
}
