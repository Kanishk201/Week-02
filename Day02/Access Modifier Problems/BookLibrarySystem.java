// Base class: Book
class Book {
    public String ISBN; // Public member
    protected String title; // Protected member
    private String author;  // Private member

    // Constructor for Book
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display Book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test the functionality
public class BookLibrarySystem {
    public static void main(String[] args) {
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