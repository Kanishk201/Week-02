package problemstatements.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of different library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "Time Magazine", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Display details and loan duration
        System.out.println(book.getItemDetails() + ", Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration: " + dvd.getLoanDuration() + " days");

        // Reserving items
        ((Reservable) book).reserveItem("John Doe");
        System.out.println("Book availability: " + ((Reservable) book).checkAvailability());

        ((Reservable) magazine).reserveItem("Jane Doe"); // Should display that magazines cannot be reserved

        ((Reservable) dvd).reserveItem("Alice");
        System.out.println("DVD availability: " + ((Reservable) dvd).checkAvailability());
    }
}

