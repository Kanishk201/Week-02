public class Patient {
    // Instance variables
    private final int patientID; // Final variable for unique patient ID
    private String name;
    private int age;
    private String ailment;

    // Static variables
    public static String hospitalName = "City General Hospital"; // Shared by all patients
    private static int totalPatients = 0; // Keeps track of the total number of patients

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment) {
        this.patientID = ++totalPatients; // Assign a unique ID
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Instance method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Main method
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("John Doe", 35, "Fever");
        Patient patient2 = new Patient("Jane Smith", 28, "Flu");
        Patient patient3 = new Patient("Mike Johnson", 42, "Fracture");

        // Validate using instanceof before displaying details
        if (patient1 instanceof Patient) {
            System.out.println("Patient 1 Details:");
            patient1.displayPatientDetails();
        }

        if (patient2 instanceof Patient) {
            System.out.println("\nPatient 2 Details:");
            patient2.displayPatientDetails();
        }

        if (patient3 instanceof Patient) {
            System.out.println("\nPatient 3 Details:");
            patient3.displayPatientDetails();
        }

        // Display the total number of patients
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}
