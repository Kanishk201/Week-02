public class HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter methods
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Creating a booking using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking Details:");
        defaultBooking.displayBookingDetails();

        System.out.println();

        // Creating a booking using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Alice Smith", "Deluxe", 5);
        System.out.println("Custom Booking Details:");
        customBooking.displayBookingDetails();

        System.out.println();

        // Creating a booking using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking Details:");
        copiedBooking.displayBookingDetails();
    }
}
