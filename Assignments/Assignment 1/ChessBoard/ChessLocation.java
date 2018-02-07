
/**
 * Write a description of class ChessLocation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessLocation
{
    // instance variables - replace the example below with your own
    public int row;
    public int col;

    /**
     * Constructor for objects of class ChessLocation
     */
    public void ChessLocation()
    {   
        
        for (int i=0; i<8; i++){
             for (int j=0; j<8; j++){
                 if(ChessBoard.multi[i][j] == 1){
                     row = i;
                     col = j; 
                   
                }
            }
        }
        
    }
}
