package singleinheritance.smarthomesystem;

class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus to include thermostat details
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

