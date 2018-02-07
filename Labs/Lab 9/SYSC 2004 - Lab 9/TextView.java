import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Write a description of class TextView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextView implements View
{
    // instance variables - replace the example below with your own
    private FieldStats stats;

    /**
     * Constructor for objects of class TextView
     */
    public TextView(Simulator simy)
    {
        simy.addview(this);
        stats = new FieldStats();
    }

    public void showStatus(int step, Field field)
    {
        System.out.println("Steps " + step);
        stats.reset();
        System.out.println("Population: " + stats.getPopulationDetails(field));
    }
    
    public void setColor(Class animalClass, Color color)
    {
        
    }
    
    public boolean isViable(Field field){
        return true;
    }
}
