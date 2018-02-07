import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
/**
 * Write a description of class MyGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyGUI 
{
    private Counter count;
    // instance variables - replace the example below with your own

    //public void MyGUI(){
    //}
    
    public MyGUI(){
        //count= new Counter();
    
      JFrame frame = new JFrame("Lab 1");
      frame.setSize(300,100);
      
      FlowLayout layout = new FlowLayout();



      JLabel lab1 = new JLabel ("Counter");
      //JLabel lab2 = new JLabel("Count is: ");
      count = new Counter(lab1);
      ButtonHandler button = new ButtonHandler(count);
      frame.add(lab1);
      //frame.add(lab2);
      
      //JButton but1 = new JButton ("Increment Counter");
      JButton but1 = new JButton ("Click to Count");  
      
      but1.addActionListener(button);
      frame.add(but1);
      
      frame.setVisible(true);
      
      lab1.setVisible(true);
      frame.setLayout(layout);
      but1.setVisible(true);
      
    }
    
}


