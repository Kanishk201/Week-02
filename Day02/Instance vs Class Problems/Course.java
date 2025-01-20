public class Course {
    // Instance variables
    String courseName;
    int duration;  // Duration in months
    double fee;

    // Class variable (shared among all courses)
    public static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;  // Modify the shared class variable
    }

    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 3, 500.0);
        Course course2 = new Course("Data Science", 6, 1200.0);
        Course course3 = new Course("Web Development", 4, 800.0);

        // Display course details before updating institute name
        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Update the institute name
        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Advanced Learning Institute");

        // Display course details after updating institute name
        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
