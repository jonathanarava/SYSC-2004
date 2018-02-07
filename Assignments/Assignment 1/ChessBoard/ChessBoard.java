
/**
 * ChessBoard class should allow you to store a knight piece at different locations
 * 
 * @author (Jonathan Arava) 
 * @version (a version number or a date)
 */
public  class ChessBoard
{
    // instance variables - replace the example below with your own
    
    public static int[][] multi = new int[8][8];
    
    /**
     * The constructor will initialize the chess board. The job of the constructor would be to
     * initialize all the elements in your data structure to all nulls, as initially there aren't any pieces on
     * the board. 
     */
    public static void ChessBoard()
    {
        for (int i=0; i<8; i++){
             System.out.println();
             for (int j=0; j<8; j++){
                   System.out.print( "  " + multi[i][j]);
                }
            }
    }

 
    /**
     *The first one, isPieceAt, should, return true if a knight is located at the specified row and
     *column, or false if no piece exists at the current location
    */ 
    public boolean isPieceAt(int row, int col)
    {     
        if(multi[row][col] != 1){
            return false;
        }
        return true;
        
    }
    
 
    /**
   
     * placePieceAt should place the given knight on your ChessBoard at the given location If
     * the user attempts to add a piece to a location where one already exists, placePieceAt should
     * overwrite the old piece with the new one. Do not forget to update the knight’s own location in
     * Knight class.
    
    
    public void placePieceAt (Knight knight, ChessLocation location)
    {
    
    
    }
    */
    //multi[row][col] = 1;  multi[row][col] = 0 ;
}
