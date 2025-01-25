package assistedproblems.employeemanagementsystem;

class Manager extends Employee {
    int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call superclass constructor
        this.teamSize = teamSize;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Team Size: " + teamSize);
    }
}