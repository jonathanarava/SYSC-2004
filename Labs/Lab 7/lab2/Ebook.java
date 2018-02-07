
/**
 * Write a description of class Ebooks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ebook
{
    // instance variables - replace the example below with your own
    private int x;
    private String format;

    /**
     * Constructor for objects of class Ebooks
     */
    public Ebook(){
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String file_format (String format)
    {
        return format;
    }
    
    
     /**
     * Accessor method for the writer name.
     *
     * @return the writer's name.
     */
    public String getFormat()
    {
        return format;
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
    
    /** returns person details in string format:
     * Lists the name, years of birth and death, nationality in a user-friendly format.
     */
    public String toString(){
       return "Book: Title: "+Book.getTitle() +", Author: "+author.getName()+", Pages: "+pages;
    }
}
