package assistedproblems.employeemanagementsystem;

class Intern extends Employee {
    int duration; // Duration in months

    // Constructor
    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary); // Call superclass constructor
        this.duration = duration;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Internship Duration: " + duration + " months");
    }
}

