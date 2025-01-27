package problemstatements.ridehailingapplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("C001", "John Doe", 15);
        Vehicle bike = new Bike("B001", "Jane Smith", 10);
        Vehicle auto = new Auto("A001", "Mike Johnson", 12);

        // Update and display locations
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("Suburb");
        ((GPS) auto).updateLocation("City Center");

        System.out.println(car.getVehicleDetails() + ", Current Location: " + ((GPS) car).getCurrentLocation());
        System.out.println(bike.getVehicleDetails() + ", Current Location: " + ((GPS) bike).getCurrentLocation());
        System.out.println(auto.getVehicleDetails() + ", Current Location: " + ((GPS) auto).getCurrentLocation());

        // Calculate and display fares
        double distance = 10; // Example distance
        System.out.println("Fare for car: " + car.calculateFare(distance));
        System.out.println("Fare for bike: " + bike.calculateFare(distance));
        System.out.println("Fare for auto: " + auto.calculateFare(distance));

        // Process rides dynamically
        processRide(car, distance);
        processRide(bike, distance);
        processRide(auto, distance);
    }

    // Polymorphic method to process rides
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println("Processing ride for: " + vehicle.getDriverName());
        System.out.println("Fare for ride: " + vehicle.calculateFare(distance));
    }
}

