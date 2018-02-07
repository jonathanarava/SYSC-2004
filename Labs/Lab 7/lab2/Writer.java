/**
 * Class Writer. 
 * Describes a Writer, listing the person's years of birth and death, and his/her nationality.
 *
 * @author Alan
 * @version 04.03.2013
 */
public class Writer
{
    /**
    * The name of the writer
    */
    private String name;

    /**
    * The nationality of the writer
    */
    private String nationality;

    /**
    * The year of birth of this writer (may be unknown, indicated by the value YEAR_UNKNOWN). The acceptable range is defined by MIN_YEAR and MAX_YEAR.
    */
    private int yearBorn;

    /**
    * The year of death of this writer (may be unknown, indicated by the value YEAR_UNKNOWN, or the writer may be alive, indicated by value STILL_ALIVE). The acceptable range is defined by MIN_YEAR and MAX_YEAR.
    */
    private int yearDied;
    

    /**
    * Special constant value indicating that a date (birth or death) is unknown.
    */
    private static final int YEAR_UNKNOWN=-10000;

    /**
    * Special constant value for year of death, meaning the person is still alive.
    */
    private static final int STILL_ALIVE=-20000;


    /**
     * Constructor for objects of class Writer
     * @param writerName the name of the writer (if empty, will be replaced by "Unknown")
     * @param writerNationality the nationality of the writer (if empty, will be replaced by "Unknown")
     */
    public Writer(String writerName, String writerNationality)
    {
        // check if the writer name is given
        if (writerName.length()>0)
            name = writerName;
        else
            name = "Unknown";

        // check if the writer nationality is given
        if (writerNationality.length()>0)
            nationality=writerNationality;
        else
            nationality = "Unknown";    
        
       yearBorn = YEAR_UNKNOWN;
       yearDied = YEAR_UNKNOWN;
       
    }

    /**
     * Accessor method for the writer name.
     *
     * @return the writer's name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Accessor method for the writer's nationality.
     *
     * @return the writer's nationality.
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
    * Method to set the year of birth of this writer
    *
    * @param the new year of birth
    */

    public void setYearBorn(int year)
    {
        yearBorn = year;
    }

    /**
    * Method to set the year of death of this writer
    *
    * @param the new year of death
    */

    public void setYearDied(int year)
    {
        yearDied = year;

    }

    /**
    * Method which can be called to set information that this writer is still alive. 
    */
    public void setIsAlive()
    {
       yearDied=STILL_ALIVE;
    }


    /**
    * Helper method to output the year of birth / death as a string.
    */
    private String getYearAsString(int year){

        if (year==YEAR_UNKNOWN)
            return "?";                 // shows the date is unknown
        else if (year == STILL_ALIVE)
            return " ";                 // blank means the person is still alive
        else
            if (year<0)
                return (-1*year) +"b.c."; // the + operator is "overloaded" to automatically convert an int to a String in this case
            else
                return Integer.toString(year); //static method to convert an integer to a string. (we'll leave out the "a.d.")

    }


    /** returns person details in string format:
     * Lists the name, years of birth and death, nationality in a user-friendly format.
     */
    public String toString(){
        return         getName()+
                    getYearAsString(yearBorn) +" - "+
                    getYearAsString(yearDied) +"), "+
                    nationality +".";
      }
                
    /**
    * Method to output details about the writer to the terminal.
    */
    public void printDetails()
    {
        
        System.out.println(toString());
    }
    
     public boolean equals(Object obj)
    {   
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof Book)){
            return false; 
        }
        
        Book b = (Book)obj;
        
        return (toString().equals(b));
    }

}