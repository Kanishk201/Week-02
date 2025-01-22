// Base class: Student
class Student {
    // Static variables shared across all students
    private static String universityName = "Global University";
    private static int totalStudents = 0; // To keep track of total students

    // Final variable for roll number
    public final int rollNumber; // Public member
    protected String name; // Protected member
    private double CGPA;   // Private member

    // Constructor for Student using 'this' keyword
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.setCGPA(CGPA); // Use setter to validate CGPA
        totalStudents++; // Increment the total student count
    }

    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
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

    // Method to display Student details with instanceof check
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor for PostgraduateStudent using 'this' and 'super' keywords
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call the superclass constructor
        this.researchTopic = researchTopic;
    }

    // Method to display PostgraduateStudent details
    public void displayPostgraduateDetails() {
        if (this instanceof PostgraduateStudent) {
            System.out.println("Postgraduate Student Details:");
            System.out.println("Roll Number: " + rollNumber); // Accessing public member
            System.out.println("Name: " + name);             // Accessing protected member
            System.out.println("Research Topic: " + researchTopic);
        } else {
            System.out.println("The object is not an instance of the PostgraduateStudent class.");
        }
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Display the university name
        Student.displayUniversityName();

        // Create a Student object
        Student student = new Student(101, "Alice", 3.8);
        System.out.println("\nStudent Details:");
        student.displayDetails();

        // Modify CGPA using public method
        student.setCGPA(3.9);
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.7, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();

        // Display total students enrolled
        System.out.println();
        Student.displayTotalStudents();
    }
}
