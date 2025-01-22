// Base class: Book
class Book {
    // Static variable shared across all books
    private static String libraryName = "Global Library";

    // Final variable to ensure ISBN cannot be changed
    public final String ISBN; // Public member
    protected String title; // Protected member
    private String author;  // Private member

    // Constructor for Book using 'this' keyword
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display Book details with instanceof check
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor for EBook using 'this' and 'super' keywords
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        if (this instanceof EBook) {
            System.out.println("EBook Details:");
            System.out.println("ISBN: " + ISBN); // Accessing public member
            System.out.println("Title: " + title); // Accessing protected member
            System.out.println("File Size: " + fileSize + " MB");
        } else {
            System.out.println("The object is not an instance of the EBook class.");
        }
    }
}

// Main class to test the functionality
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Display the library name
        Book.displayLibraryName();
        System.out.println();

        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "Introduction to Java", "James Gosling");
        System.out.println("Book Details:");
        book.displayDetails();

        // Modify the author's name using public method
        book.setAuthor("John Doe");
        System.out.println("\nUpdated Book Details:");
        book.displayDetails();

        // Create an EBook object
        EBook eBook = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch", 5.2);
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
