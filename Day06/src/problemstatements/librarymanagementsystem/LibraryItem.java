package problemstatements.librarymanagementsystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public String getTitle() {
        return title;
    }
}
