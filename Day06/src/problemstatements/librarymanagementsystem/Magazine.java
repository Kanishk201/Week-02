package problemstatements.librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }

    @Override
    public void reserveItem(String borrower) {
        System.out.println("Magazines cannot be reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Always available as reservation is not allowed
    }
}
