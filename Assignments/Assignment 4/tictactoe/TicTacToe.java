 import java.util.*;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;


/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game.
 * 
 * @author Lynn Marshall
 * @version November 8, 2012
 */

public class TicTacToe extends JFrame
{
   public static final String PLAYER_X = "X"; // player using "X"
   public static final String PLAYER_O = "O"; // player using "O"
   public static final String EMPTY = " ";  // empty cell              
   public static final String TIE = "T"; // game ended in a tie
 
   private String player;   // current player (PLAYER_X or PLAYER_O)

   private String winner;   // winner: PLAYER_X, PLAYER_O, TIE, EMPTY = in progress     

   private int numFreeSquares; // number of squares still free
   
   private String board[][]; // 3x3 array representing the board
   
   
   JPanel panel = new JPanel(); //
   JPanel status = new JPanel(); //
   TicTacToeFrame buttons[]=new TicTacToeFrame[9]; //
   
   JTextArea S ;
   public  String words;
   
   public  ImageIcon X,O;
   
   JMenuBar menuBar;
   JMenu menu, submenu;
   JMenuItem menuItem;
   
  
   
   
   int b;
   /** 
    * Constructs a new Tic-Tac-Toe board.
    */
   public TicTacToe()
   {
      setTitle("TicTacToe Game");
        setSize(300, 500);
        
        
        
        
        
        setLayout(new BorderLayout());

        getContentPane().add(panel,BorderLayout.CENTER);
        getContentPane().add(status,BorderLayout.SOUTH);
       
       
        
         
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
        
        newAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 for (int i = 0; i < 3; i++) {
                   
                       buttons[i] = null;
                       panel.add(buttons[i]);
                       
                       setVisible(true);
                }
          winner = EMPTY;
          numFreeSquares = 9;
          player = PLAYER_X;     // Player X always has the first turn.
            }
        });
        
        quitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    
      
    
       panel.setBorder(
            BorderFactory.createTitledBorder("The Game"));
       panel.setOpaque(true);
       panel.setBackground(Color.WHITE);
       
        status.setBorder(
            BorderFactory.createTitledBorder("Status"));
       status.setOpaque(true);
       status.setBackground(Color.WHITE);
        
       S = new JTextArea("words");  // never added scrollPane.add.(...
       
       JScrollPane scrollPane = new JScrollPane(S); 
       
        
       
       scrollPane.setPreferredSize(new Dimension(250, 100));
       status.add(scrollPane);
       //add(scrollPane,BorderLayout.SOUTH);
       status.add(S);
       setResizable(false);
    
       
      
       
       
        panel.setLayout(new GridLayout(3,3));
        status.setLayout(new FlowLayout());   
      
      //setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
     //final private JTextArea txt1 = new JTextArea(" ");  
     for(int i=0;i<9;i++){
            
           buttons[i]=new TicTacToeFrame();
           panel.add(buttons[i]);
           
           //buttons[i].addActionListener(new myActionListener());        
           }
     
   
    add(panel); 
    
       
    
    board = new String[3][3];
     
    setVisible(true);
      
    }

  /**
    * Sets everything up for a new game.  Marks all squares in the Tic Tac Toe board as empty,
    * and indicates no winner yet, 9 free squares and the current player is player X.
    */
   private void clearBoard()
   {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            board[i][j] = EMPTY;
         }
      }
      winner = EMPTY;
      numFreeSquares = 9;
      player = PLAYER_X;     // Player X always has the first turn.
   }


   /**
    * Plays one game of Tic Tac Toe.
    */

   public void playGame()
   {
      int row, col;
      Scanner sc;

      clearBoard(); // clear the board

      // print starting board
      print();

      // loop until the game ends
      while (winner==EMPTY) { // game still in progress
    
         // get input (row and column)
         while (true) { // repeat until valid input
            System.out.print("Enter row and column of chosen square (0, 1, 2 for each): ");
            sc = new Scanner(System.in);
            row = sc.nextInt();
            col = sc.nextInt();
            if (row>=0 && row<=2 && col>=0 && col<=2 && board[row][col]==EMPTY) break;
            System.out.println("Invalid selection, try again.");
         }

         board[row][col] = player;        // fill in the square with player
        // if (player == PLAYER_X){
        //     buttons[i][j].setText("X");
        //     buttons[i][j].setEnabled(false);
            
        numFreeSquares--;            // decrement number of free squares

         // see if the game is over
         if (haveWinner(row,col)) {
            winner = player;} // must be the player who just went
            
            
         else if (numFreeSquares==0){ 
            winner = TIE; // board is full so it's a tie}
        }
         // print current board
         print();
         
         // change to other player (this won't do anything if game has ended
         if (player==PLAYER_X) {
            player=PLAYER_O;}
         else {
            player=PLAYER_X;}
            
            
        
        }
      
        
    }


   /**
    * Returns true if filling the given square gives us a winner, and false
    * otherwise.
    *
    * @param int row of square just set
    * @param int col of square just set
    * 
    * @return true if we have a winner, false otherwise
    */
   private boolean haveWinner(int row, int col) 
   {
       // unless at least 5 squares have been filled, we don't need to go any further
       // (the earliest we can have a winner is after player X's 3rd move).

       if (numFreeSquares>4) return false;

       // Note: We don't need to check all rows, columns, and diagonals, only those
       // that contain the latest filled square.  We know that we have a winner 
       // if all 3 squares are the same, as they can't all be blank (as the latest
       // filled square is one of them).

       // check row "row"
       if ( board[row][0].equals(board[row][1]) &&
            board[row][0].equals(board[row][2]) ) return true;
       
       // check column "col"
       if ( board[0][col].equals(board[1][col]) &&
            board[0][col].equals(board[2][col]) ) return true;

       // if row=col check one diagonal
       if (row==col)
          if ( board[0][0].equals(board[1][1]) &&
               board[0][0].equals(board[2][2]) ) return true;

       // if row=2-col check other diagonal
       if (row==2-col)
          if ( board[0][2].equals(board[1][1]) &&
               board[0][2].equals(board[2][0]) ) return true;

       // no winner yet
       return false;
   }

   
   /**
    * Prints the board to standard out using toString().
    */
    public void print() 
    {
        System.out.print(toString());
        if(winner == TIE){
            System.out.print("Game Tied");
        }
        
        if (winner != TIE && winner != EMPTY) {
        System.out.print("Player " + winner + " won!");
       }
    }
  
    
   /**
    * Returns a string representing the current state of the game.  This should look like
    * a regular tic tac toe board, and be followed by a message if the game is over that says
    * who won (or indicates a tie).
    *
    * @return String representing the tic tac toe game state
    */
    public String toString() 
    {
        String b = "";

       // creates a vertical bar at the beginning and the end of each row
       for (int rows = 0; rows < board.length; rows++)
       {
         b += "| ";
         // adds a space for each row and column character in tic-tac-toe board.
         for (int columns = 0; columns < board[rows].length; columns++)
         {
          b += board[rows][columns] + " ";  
          }
           b += "|\n";// prints a | space space space | and breaks off to create two new lines.
          }
           return b; // prints the tic-tac-toe board to be accessed by the user.
        }
        
     
       public  void main(String[] args) {
        TicTacToe me = new TicTacToe();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
        

    }
    
    
    //public  JTextArea getS(){
    //    return  S = "Hello World";
   // }
        
}
       
   
    

