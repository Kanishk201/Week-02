package assistedproblems.vehicleandtransportsystem;

public class VehicleTransport {
    public static void main(String[] args) {
        // Creating objects for each type of vehicle
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10.5);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", false);

        // Storing objects in an array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Demonstrating polymorphism by calling displayInfo on each
        System.out.println("Vehicle Details:\n");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("------------------------");
        }
    }
}
