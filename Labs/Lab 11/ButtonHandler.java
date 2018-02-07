import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class ButtonHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHandler implements ActionListener
{
    // instance variables - replace the example below with your own
    private Counter counter;

    /**
     * Constructor for objects of class ButtonHandler
     */
    public ButtonHandler(Counter counter)
    {
        // initialise instance variables
        this.counter = counter;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void actionPerformed(ActionEvent e)
    {
        // put your code here
        counter.increment();
    }
}
