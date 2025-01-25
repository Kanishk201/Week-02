package assistedproblems.vehicleandtransportsystem;

class Truck extends Vehicle {
    double loadCapacity; // in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}