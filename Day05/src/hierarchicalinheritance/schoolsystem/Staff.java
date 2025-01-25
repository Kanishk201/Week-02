package hierarchicalinheritance.schoolsystem;

class Staff extends Person {
    String position;

    // Constructor
    public Staff(String name, int age, String position) {
        super(name, age); // Call superclass constructor
        this.position = position;
    }

    // Method to display role and details
    public void displayRole() {
        System.out.println("Role: Staff");
        displayDetails();
        System.out.println("Position: " + position);
    }
}