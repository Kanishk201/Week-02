package singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        // Creating an object of Author
        Author author = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "Harper Lee was an American novelist best known for her 1960 novel.");

        // Displaying details of the book and its author
        System.out.println("Library Details:\n");
        author.displayInfo();
    }
}
