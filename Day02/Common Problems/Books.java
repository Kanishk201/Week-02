public class Books {
    // Attributes
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Default constructor
    public Books() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Books(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;  // Mark the book as unavailable after borrowing
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;  // Mark the book as available when returned
        System.out.println("Thank you for returning the book: " + title);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book object using the parameterized constructor
        Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);

        // Display book details
        System.out.println("Book Details:");
        book1.displayBookDetails();

        System.out.println();

        // Borrow the book
        book1.borrowBook();

        // Attempt to borrow the book again (which is now unavailable)
        book1.borrowBook();

        System.out.println();

        // Return the book
        book1.returnBook();

        // Display the updated availability
        System.out.println();
        book1.displayBookDetails();
    }
}
