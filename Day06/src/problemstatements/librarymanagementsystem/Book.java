package problemstatements.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for books
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.borrower = borrower;
            this.isReserved = true;
            System.out.println("Book reserved for " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

