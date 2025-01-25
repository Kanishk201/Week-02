package hierarchicalinheritance.schoolsystem;

class Student extends Person {
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age); // Call superclass constructor
        this.grade = grade;
    }

    // Method to display role and details
    public void displayRole() {
        System.out.println("Role: Student");
        displayDetails();
        System.out.println("Grade: " + grade);
    }
}
