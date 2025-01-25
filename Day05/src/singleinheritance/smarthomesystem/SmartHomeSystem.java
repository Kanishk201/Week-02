package singleinheritance.smarthomesystem;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating an object of Thermostat
        Thermostat thermostat = new Thermostat("TH123", "Active", 22.5);

        // Displaying details of the thermostat
        System.out.println("Smart Home Device Status:\n");
        thermostat.displayStatus();
    }
}
