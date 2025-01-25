package singleinheritance.librarymanagement;

class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
