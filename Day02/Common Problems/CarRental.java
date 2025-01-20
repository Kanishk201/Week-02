public class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    public static final double DAILY_RENTAL_COST = 50.0; // Cost per day of rental

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_COST;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Creating a rental using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental Details:");
        defaultRental.displayRentalDetails();

        System.out.println();

        // Creating a rental using the parameterized constructor
        CarRental customRental = new CarRental("John Doe", "Toyota Camry", 5);
        System.out.println("Custom Rental Details:");
        customRental.displayRentalDetails();
    }
}
