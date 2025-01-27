package problemstatements.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan duration for DVDs
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.borrower = borrower;
            this.isReserved = true;
            System.out.println("DVD reserved for " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
