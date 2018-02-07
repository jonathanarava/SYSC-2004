import java.util.List;
import java.util.Iterator;
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Animal
{
    // instance variables - replace the example below with your own
    protected Field field;
    protected Location location;
    protected boolean alive;
   

    /**
     * Constructor for objects of class Animal
     */
    public Animal(boolean randomAge, Field field, Location location)
    {
        alive = true;
        this.field = field;
        setLocation(location);
    }

    /**
     * Place the fox at the new location in the given field.
     * @param newLocation The fox's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
       
        /**
     * Check whether the fox is alive or not.
     * @return True if the fox is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }
    
        /**
     * Indicate that the fox is no longer alive.
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
   
       public Location getLocation()
    {
        return location;
    }
    
    public Field getField()
    {
        return field;
    }
    
    public abstract void act(List<Animal> newAnimals);//{
   /*     // Let all animals act.
        for(Iterator<Animal> it = newAnimals.iterator(); it.hasNext(); ) {
            Animal animal = it.next();
            animal.act(newAnimals);
            // Remove dead animals from the simulation.
            if(! animal.isAlive()) {
                it.remove();
            }
        }
    }*/
}