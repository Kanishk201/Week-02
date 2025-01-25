package hybridinheritance.vehiclemanagement;

public class VehicleManagement {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Toyota Corolla");

        // Display information and demonstrate behaviors
        electricVehicle.displayInfo();
        electricVehicle.charge();

        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
    }
}
