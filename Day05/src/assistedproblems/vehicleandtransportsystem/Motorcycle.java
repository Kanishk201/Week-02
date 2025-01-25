package assistedproblems.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
     boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.hasSidecar = hasSidecar;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
