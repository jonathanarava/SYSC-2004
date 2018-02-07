
/**
 * Write a description of class Intersection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intersection 
{
    // instance variables - replace the example below with your own
    private TrafficSignal eastWest;
    private TrafficSignal northSouth;
    
    /**
     * Constructor for objects of class Intersection
     */
    public Intersection()
    {
       
       eastWest = new TrafficSignal(0);
       northSouth = new TrafficSignal(2);
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void change()
    {
       
       
       if( eastWest.greenLightisOn() == true ){
           eastWest.advance();
           return;
       }
       
       if( northSouth.greenLightisOn() == true){
            northSouth.advance();
            return;
       }
       
       eastWest.advance();
       northSouth.advance();
    }
    
    @Override
    public String toString(){
        return "east-west: " + eastWest.toString() + "  north-south: " + northSouth.toString() ;
        
    }
    
    public boolean equalsEastWest(Intersection in){
        return eastWest.equals(in.eastWest);
    }
}
