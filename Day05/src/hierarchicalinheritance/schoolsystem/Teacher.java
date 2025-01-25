package hierarchicalinheritance.schoolsystem;

class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call superclass constructor
        this.subject = subject;
    }

    // Method to display role and details
    public void displayRole() {
        System.out.println("Role: Teacher");
        displayDetails();
        System.out.println("Subject: " + subject);
    }
}

