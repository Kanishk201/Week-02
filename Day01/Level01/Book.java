public class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Alchemist", "Paulo Coelho", 15.99);

        // Display the details of the book
        book.displayDetails();
    }
}
