
/**
 * Write a description of class TrafficSignal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficSignal
{
    // instance variables - replace the example below with your own
    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;

    private int light;
    /**
     * Constructor for objects of class TrafficSignal
     */
    public TrafficSignal(int light)
    {
       this.light = light;
      
    
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void advance()
    {
        light++;
        light%=3;
       // switch(light){
       //     case 0:
       //         light = GREEN;
       //         break;
       //     case 1:
      //          light = YELLOW;
       //         break;
       //     case 2:
      //           light = RED;
      //           break;
       //         }
        
        //if(light == RED){
        //    light = GREEN;
       // }
       // else{    
       //     light++;
       }
    
    
    public boolean greenLightisOn(){
        if( light == GREEN){
            return true;
        }
        return false;
    }
    
    public boolean yellowLightisOn(){
        if( light == YELLOW){
            return true;
        }
        return false;
    }
    public boolean redLightisOn(){
        if( light == RED){
            return true;
        }
        return false;
    }
    
    @Override
    public  String toString() {
        if (light == GREEN){
            return  "green light ";
        }
        else if (light == RED){
            return "red light ";
        }
        else {
            return "yellow light ";
        }
        
    }
    
    @Override
    public  boolean equals(Object obj) {
        if(obj.toString() == this.toString()){
          return true;
        }
        else{
        return false;
       }
        
    }

}
