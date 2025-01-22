public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Unique identifier for each vehicle

    // Class variable (shared among all vehicles)
    public static double registrationFee = 100.0; // Fixed registration fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; // Using 'this' to distinguish instance variables
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Check if the object belongs to the Vehicle class
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
            System.out.println("--------------------------");
        } else {
            System.out.println("Object is not an instance of Vehicle.");
        }
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee; // Modify the shared class variable
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car", "CAR123");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle", "MOTO456");
        Vehicle vehicle3 = new Vehicle("Charlie Brown", "Truck", "TRUCK789");

        // Display vehicle details before updating registration fee
        System.out.println("Before Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Update the registration fee
        System.out.println("\nUpdating Registration Fee...\n");
        Vehicle.updateRegistrationFee(150.0);

        // Display vehicle details after updating registration fee
        System.out.println("After Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
