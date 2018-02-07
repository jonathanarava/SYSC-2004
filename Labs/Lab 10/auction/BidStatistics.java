import java.util.HashMap;
/**
 * Write a description of class BidStatistics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BidStatistics
{
    // instance variables - replace the example below with your own
    
    private Lot lot;
    private Bid bid;
    private HashMap<Lot, Integer> hmap;
    /**
     * Constructor for objects of class BidStatistics
     */
    public BidStatistics()
    {
        // initialise instance variables
        HashMap<Lot, Integer > hmap = new HashMap<Lot, Integer>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void collectBidInfo(Lot lot, Bid bid)
    {   if (hmap.containsKey(lot)){     // if there is bids on the lot do this
           int i = hmap.get(lot);
           i++;
           hmap.put(lot,i);
        }
        else{                   // if there are no bids on the lot, put 1 bid on that lot
            hmap.put(lot,1);
        }
        
        
    }
    
    public void printReport()
    {
        System.out.println(highestBid);
        System.out.println("Number of bids: " + hmap.get(lot));
    }
}
