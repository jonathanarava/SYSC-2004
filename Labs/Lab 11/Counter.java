import javax.swing.*;
/**
 * A simple rollover counter
 * 
 * @author Jonathan 
 */
public class Counter{

    public final static int DEFAULT_MIN_VALUE = 0;
    public final static int DEFAULT_MAX_VALUE = 10;

    private int value;
    private int max;
    private int min;
    JLabel l;

    
    public Counter(JLabel l) {
        // initialise instance variables
        this(DEFAULT_MAX_VALUE);
        this.l = l;
    }
    
    /**
     * Another Constructor, this one takes a custom max value.
     * 
     * @param m the max value
     */
    public Counter(int m) {
        this(DEFAULT_MIN_VALUE, m);
    }
    
    /**
     * A constructor where one can specify both the min and max values
     * 
     * @param min the min value
     * @param max the max value
     */
    
    public Counter(int min, int max) {
        this.min = min;
        this.max = max;
        value = min;
    }

    /**
     * return the current value of the counter
     * 
     * @return     the current value 
     */
    public int getValue() {
        return value;
    }
    
    /**
     * increment the counter
     * 
     * @return true if counter rolled over, false otherwise
     */
    public boolean increment() {
        value++;
        l.setText("Count is "+value);
        
        if (value == max) {
            value = min;
            return true;
        }
        else return false;
    }
    
    /**
     * @return a string representation of the counter
     */
    public String toString() {
        if (value < 10) 
            return "0" + value;
        else return "" + value;    
    }
   
    
    
}



