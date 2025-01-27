package problemstatements.hospitalpatientmanagement;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create instances of patients
        Patient inPatient = new InPatient("P001", "John Doe", 45, 2000, 5);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 500);

        // Add medical records
        ((MedicalRecord) inPatient).addRecord("Diagnosed with pneumonia.");
        ((MedicalRecord) inPatient).addRecord("Prescribed antibiotics.");
        ((MedicalRecord) outPatient).addRecord("Routine check-up.");

        // Display patient details and bills
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Medical History:\n" + ((MedicalRecord) inPatient).viewRecords());
        System.out.println("Total Bill: " + inPatient.calculateBill());

        System.out.println();

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Medical History:\n" + ((MedicalRecord) outPatient).viewRecords());
        System.out.println("Total Bill: " + outPatient.calculateBill());

        // Process patients dynamically
        processPatient(inPatient);
        processPatient(outPatient);
    }

    // Polymorphic method to process patients
    public static void processPatient(Patient patient) {
        System.out.println("Processing patient: " + patient.getName());
        System.out.println("Bill amount: " + patient.calculateBill());
    }
}