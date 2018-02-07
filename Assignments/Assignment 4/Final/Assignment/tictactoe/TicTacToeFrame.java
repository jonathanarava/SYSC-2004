import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game in a very
 * simple GUI window.
 * 
 * @author Lynn Marshall
 * @version November 8, 2012
 */

public class TicTacToeFrame extends javax.swing.JFrame implements ActionListener
{ 
   private JTextArea status; // text area to print game status
   private JFrame frame;
   private JLabel label;
   private JMenuBar menu;
   private JButton ButBoard[][];
   private TicLocation location;
   public boolean flag;
   
   JPanel panel = new JPanel(); //
   JPanel state = new JPanel(); //
   JScrollPane scrollPane;
   /** 
    * Constructs a new Tic-Tac-Toe board and sets up the basic
    * JFrame containing a JTextArea in a JScrollPane GUI.
    */
   public TicTacToeFrame()
   { 
   
       setTitle("TicTacToe Game");
        setSize(300, 500);

        setLayout(new BorderLayout());

        getContentPane().add(panel,BorderLayout.CENTER);
        getContentPane().add(state,BorderLayout.SOUTH);
  
        // Creates a menubar for a JFrame
        JMenuBar menuBar = new JMenuBar();
         
        // Add the menubar to the frame
        setJMenuBar(menuBar);
         
        // Define and add two drop down menu to the menubar
        JMenu fileMenu = new JMenu("File");
       
        menuBar.add(fileMenu);
          
        // Create and add simple menu item to one of the drop down menu
        JMenuItem newAction = new JMenuItem("New");
        JMenuItem quitAction = new JMenuItem("Quit");

        fileMenu.add(newAction);
        fileMenu.add(quitAction);
        
        quitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    

       panel.setBorder(
            BorderFactory.createTitledBorder("The Game"));
       panel.setOpaque(true);
       panel.setBackground(Color.WHITE);
       
        state.setBorder(
            BorderFactory.createTitledBorder("Status"));
       state.setOpaque(true);
       state.setBackground(Color.WHITE);
        
       status = new JTextArea();  // never added scrollPane.add.(...
       status.setEditable(false);
      JScrollPane scrollPane = new JScrollPane(status); 
       
       scrollPane.setPreferredSize(new Dimension(250, 100));
       state.add(scrollPane);
       //add(scrollPane,BorderLayout.SOUTH);

        panel.setLayout(new GridLayout(3,3));
        state.setLayout(new FlowLayout());   
       ButBoard = new JButton[3][3];
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               ButBoard[i][j] = new JButton();
               panel.add(ButBoard[i][j]);
               ButBoard[i][j].addActionListener(this);
            }
        }

       setVisible(true);

   }
   
   /**
   * Prints the board to the GUI using toString().
   */
   public void print(String s) 
   {  
      //scrollPane.setText(null);
      status.append(null);
      status.append(s);
       
   }
    
   public void actionPerformed(ActionEvent e)
   {
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               if(e.getSource() == ButBoard[i][j]){
                   location = new TicLocation(i, j);
                   ButBoard[i][j].setEnabled(false);
                   flag = true;
               }
           }
       }
   }
   
   public TicLocation getTicLocation()
   {
       return location;
   }
     
   public void setButton(String s)
   {
       ButBoard[location.getRow()][location.getCol()].setBackground(Color.WHITE);
       ButBoard[location.getRow()][location.getCol()].setOpaque(true);
       ButBoard[location.getRow()][location.getCol()].setText(s);
   }
   
   public void EndButton()
   {
       for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
              ButBoard[i][j].setEnabled(false);
            }
        }
   }

}