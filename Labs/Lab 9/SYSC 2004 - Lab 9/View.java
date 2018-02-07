import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Write a description of interface View here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface View
{
    /**
     * Determine whether the simulation should continue to run.
     * @return true If there is more than one species alive.
     */
    public void setColor(Class animalClass, Color color);
    
    public boolean isViable(Field field);
    
    public void showStatus(int step, Field field);
    
}
