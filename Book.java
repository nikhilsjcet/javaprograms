package nikhil;

public class Book {
    String title;
    String author;
    final int bookID;
    static int bookCounter = 1000;
    static final String LIBRARY_NAME = "Central Library";
    
    public Book() {
        this.title = "Kalikudukka";
        this.author = "Albin PES Master";
        this.bookID = bookCounter++;
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookID = bookCounter++;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ID: " + bookID);
    }
    
    public void displayInfo(boolean showLibrary) {
        System.out.println("Title: " + title + ", Author: " + author + ", ID: " + bookID);
        if (showLibrary) {
            System.out.println("Library: " + LIBRARY_NAME);
        }
    }
    
    public static void displayTotalBooks() {
        System.out.println("Total books: " + (bookCounter - 1000));
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "Sarju S");
        Book book3 = new Book("Data Structures", "Chintu Maria");
        
        book1.displayInfo();
        book2.displayInfo(true);
        book3.displayInfo(false);
        
        Book.displayTotalBooks();
    }
}
