import java.util.List;
import java.util.Iterator;
/**
 * Write a description of class Dalek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dalek extends Animal
{
    // instance variables - replace the example below with your own
        // The rabbit's age.
    private static final int FOX_FOOD_LEVEL = 10;
    private int age;
    private int foodLevel;
     private static final int RABBIT_FOOD_VALUE = 9;
     private int hungerLevel = 0;

    /**
     * Constructor for objects of class Dalek
     */
    public Dalek(boolean randomAge, Field field, Location location)
    {
       
        super(randomAge, field, location);
        age = 0;
    
        }
    
    public void act(List<Animal> newDalek){
        incrementHunger();
        if(super.alive) {
            Location newLocation = super.field.freeAdjacentLocation(super.location);
            if(newLocation != null) {
                setLocation(newLocation);
            }
        }
        if (hungerLevel >= 50){
            explode();
            setDead();
            
        }
        }
        
    private void incrementHunger()
    {
        foodLevel--;
    }
    
    private Location findFood()
    {
        List<Location> adjacent = field.adjacentLocations(location);
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = field.getObjectAt(where);
            if(animal instanceof Fox) {
                Fox fox = (Fox) animal;
                if(fox.isAlive()) { 
                    fox.setDead();
                    foodLevel = FOX_FOOD_LEVEL;
                    return where;
                }
            }
            if(animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal;
                if(rabbit.isAlive()) { 
                    rabbit.setDead();
                    foodLevel = RABBIT_FOOD_VALUE;
                    return where;
                }
            }
        }
        return null;
    }
    
    private void explode()
    {
        List<Location> adjacent = field.adjacentLocations(location);
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = field.getObjectAt(where);
            if(animal instanceof Fox) {
                Fox fox = (Fox) animal;
                if(fox.isAlive()) { 
                    fox.setDead();
                }
            }
            if(animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal;
                if(rabbit.isAlive()) { 
                    rabbit.setDead();
                }
            }
        }
 
    }
}
