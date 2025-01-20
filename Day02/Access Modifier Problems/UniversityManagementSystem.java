// Base class: Student
class Student {
    public int rollNumber; // Public member
    protected String name; // Protected member
    private double CGPA;   // Private member

    // Constructor for Student
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It must be between 0.0 and 4.0.");
        }
    }

    // Method to display Student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call the superclass constructor
        this.researchTopic = researchTopic;
    }

    // Method to display PostgraduateStudent details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Accessing public member
        System.out.println("Name: " + name);             // Accessing protected member
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 3.8);
        System.out.println("Student Details:");
        student.displayDetails();

        // Modify CGPA using public method
        student.setCGPA(3.9);
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.7, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}