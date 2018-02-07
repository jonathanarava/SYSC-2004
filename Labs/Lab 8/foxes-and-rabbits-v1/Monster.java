import java.util.List;
import java.util.Random; 
import java.util.Iterator;
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Animal
{
    // instance variables - replace the example below with your ow
    private int foodLevel = 200;
     private static final int BREEDING_AGE = 0;
    // The age to which a fox can live.
    private static final int MAX_AGE = 0;
    // The likelihood of a fox breeding.
    private static final double BREEDING_PROBABILITY = 0.00;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 0;
    // The food value of a single rabbit. In effect, this is the
    // number of steps a fox can go before it has to eat again.
    private static final int RABBIT_FOOD_VALUE = 9;
    
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();
    
    private int age;
    // Whether the fox is alive or not.
    private boolean alive;
    // The fox's position.
    private Location location;
    // The field occupied.
    private Field field;
    /**
     * Constructor for objects of class Monster
     */
    public Monster(boolean randomAge, Field field, Location location)
    {
        // initialisenstance variables
         super(randomAge, field, location);
         foodLevel = rand.nextInt(RABBIT_FOOD_VALUE); 
    }
    
    private void incrementHunger(){
        foodLevel--;
        if(foodLevel > 100){
            setDead();
        }
    }
    
   
   
     private Location findFood()
    {
        List<Location> adjacent = field.adjacentLocations(location);
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = field.getObjectAt(where);
            if((animal instanceof Rabbit)|| animal instanceof Fox) {
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
    
      public int getMAX_AGE(){
        return MAX_AGE;
    }
    
    public int getBreedingAge(){
        return BREEDING_AGE; 
    }
    
     public int getLitterSize(){
        return MAX_LITTER_SIZE; 
    }
    
     
     public double getBreedingProb(){
        return BREEDING_PROBABILITY; 
    }
}
