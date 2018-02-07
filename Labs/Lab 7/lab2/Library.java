
/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//import java.awt.print.Book;
import java.util.ArrayList;

public class Library
{

    // instance variables - replace the example below with your own
    private int MAX;
    private int i;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public Library(){  
   }
   
   public void addBook(Book b)
   {
      if (!bookList.contains(b)) 
         bookList.add(b);
         
    }
  
   public void print()
   {
        for (int i = 0; i < bookList.size() ; i++){
            System.out.println(bookList.get(i).getTitle());
        }
   }
}
