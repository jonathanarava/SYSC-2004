import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game in a very
 * simple GUI window.
 * 
 * @author Lynn Marshall
 * @version November 8, 2012
 */

public class TicTacToeFrame extends JButton implements ActionListener 
{ 
    JTextArea status; // text area to print game status
   
    public static final String PLAYER_X = "X"; // player using "X"
    public static final String PLAYER_O = "O"; // player using "O"
    private String board[][];
    
   public static ImageIcon X,O;
   public static byte value=0;
   static JTextArea S;
   public static String words;
   JScrollPane scrollPane ;
   
  
   /** 
    * Constructs a new Tic-Tac-Toe board and sets up the basic
    * JFrame containing a JTextArea in a JScrollPane GUI.
    */
  public TicTacToeFrame()
   { 
      X=new ImageIcon(this.getClass().getResource("X.png"));
      O=new ImageIcon(this.getClass().getResource("O.png"));
      this.addActionListener(this);
      
  }
   
   
  public void actionPerformed(ActionEvent a) 
  {

       value++;
      value%=2;
        
       switch (value){
           case 0:
                setIcon(X);
               // board[i][j] = PLAYER_X;
                //this.S = " Player O's turn ";
                removeActionListener(this);
                //S = new JTextArea("turn O");
                
               // words = "O's turn";
                break;
            case 1:
                setIcon(O);
               // board[i][j] = PLAYER_O;
                //this.S = " Player X's turn ";
                removeActionListener(this);
               // S = new JTextArea("turn X");
               
                //words = "O's turn";
                break;
            }  
        
        
        }
        
     public static JTextArea getS(){
       return S;
    }
    
   /**
    * Prints the board to the GUI using toString().
    */
    public void print() 
    {  
     
      
    }

   }

