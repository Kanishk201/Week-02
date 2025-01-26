package problemstatements.vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        Vehicle[] vehicles = new Vehicle[] {
                new Car("C001", "Sedan", 1500, "CAR12345"),
                new Bike("B001", "Sports Bike", 500, "BIKE67890"),
                new Truck("T001", "Cargo Truck", 3000, "TRUCK54321")
        };

        // Calculate and display rental and insurance costs
        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("-----------------------");
        }
    }
}
