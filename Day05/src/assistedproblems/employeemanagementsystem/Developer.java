package assistedproblems.employeemanagementsystem;

class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

