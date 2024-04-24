
/**
 * basic library system in Java. The program should allow users to add books to the library, 
 * borrow books, and return books. The system maintains a record of the available quantity 
 * of each book.
 */

 import textio.TextIO;

public class Library {
    public static void main(String[] args) {
        Book[] books;
        int selection = 0;
        while (selection!=4) {
            System.out.println("Welcome to basic library");
            System.out.println("1. Add book");
            System.out.println("2. Borrow book");
            System.out.println("3. Return book");
            System.out.println("4. Exit");
            selection = TextIO.getlnInt();    
        }
        
    }    
} 
