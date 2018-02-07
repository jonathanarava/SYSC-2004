
/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight
{
    // instance variables - replace the example below with your own
    private int x;
    private String Black;
    private String White;

    /**
     * Constructor for objects of class Knight
     * - Initialize the owner, location and the game
     * - Place yourself on the chessboard with the initialLocation
     */
    public  KnightClass(String owner, ChessLocation initialLocation, ChessGame game) 
    {
        // initialise  instance variables
        this.owner = owner;
        this.game = game;
        ChessBoard.multi[row][col]= initialLocation;
        
    }

    /**
     * - Check the legality of the move 
     * - If the move is legal, get ChessBoard from the object game, remove the knight from 
     *   the old location and place the knight at the newLocation 
     */
    public  void moveTo(ChessLocationClass newLocation) 
    {
        // put your code here
        return x + y;
    }
}
