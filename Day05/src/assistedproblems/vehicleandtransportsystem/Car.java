package assistedproblems.vehicleandtransportsystem;

class Car extends Vehicle {
     int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
