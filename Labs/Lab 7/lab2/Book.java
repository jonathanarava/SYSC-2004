/**
 * A class that maintains information on a book.
 * 
 *
 * @author Alan
 * @version 20.01.2013
 */
public class  Book
{
    /**
    * The author of the book
    */
    private Writer author;
    /**
    * The title of the book
    */
    private String title;
    /**
    * Number of pages in the book
    */
    private int pages;

    /**
    * constant value representing a maximum acceptable value for the number of pages.
    */
    private static final int MAX_LENGTH=10000;

    /**
     * Set the author, title, and number of pages when this object
     * is constructed.
     * empty strings for the author name and title are replaced by "Unknown"
     */
    public Book(Writer bookAuthor, String bookTitle, int bookPages)
    {
        author=bookAuthor;

        if (bookTitle.length()>0)
            title = bookTitle;
        else
            title = "Unknown";

        if (bookPages>0)
        {
            pages = bookPages;
            if (pages>MAX_LENGTH)
                //Note: this would normally be output to a log file and not to the screen
                System.out.println("WARNING: Input number of pages excessive. Check value: "+bookPages);
        }
        else
        {
            pages=0;
            System.out.println("ERROR: Number of pages must be positive. Set to zero. (Value received: "+bookPages+")");
        }

    }

    /**
    * Accessor method for the author name
    * @return a String containing the name of the author of this book.
    */
    public String getAuthor()
    {
        return author.getName();
    }

    /**
    * Accessor method for the Book Title
    * @return a String containing the title of this book.
    */
    public String getTitle()
    {
        return title;
    }

    /**
    * Accessor method for the number of pages of this book
    * @return the number of pages of this book.
    */
    public int getPages()
    {
        return pages;
    }

    /**
    * Outputs the name of the author to the terminal.
    */
    public void printAuthor()
    {
        System.out.println(author.getName());
    }

    /**
    * Outputs the title of the book to the terminal.
    */
    public void printTitle()
    {
        System.out.println(title);
    }

    /**
    * Outputs the author name, title, and number of pages of this book to the terminal, in a user-friendly format.
    */
    public void printDetails()
    {
        System.out.println(toString());
    }
    
    /**
     * returns a string representation of this book
     */
    public String toString(){
    return "Book: Title: "+title+", Author: "+author.getName()+", Pages: "+pages;
    }

    /**
    * Outputs details about the author of this book to the terminal, in a user-friendly format.
    * Details include dates of birth and death, if available, and nationality.
    */
    public void printAuthorDetails()
    {
        System.out.println("Author of '"+title+"':");
        author.printDetails();
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
