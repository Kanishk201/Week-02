class MovieTicket {
	// Attributes
    String movieName;
    int seatNumber;
    double price;
    
	// Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    
	// Method to book ticket
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
	
    // Method to display ticket details 
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
	 
	 // Main method
	 public static void main(String[] args) {
       
        MovieTicket ticket = new MovieTicket("Inception", 12, 10.0);
        ticket.bookTicket(15, 12.5);
        ticket.displayTicketDetails();
    }
}