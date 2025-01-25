package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourse {
    public static void main(String[] args) {
        // Create objects for each class level
        Course course = new Course("Java Programming Basics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Python for Data Science", 8, "Coursera", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Machine Learning with Python", 10, "edX", true, 300, 20);

        // Display details for each course type
        System.out.println("Base Course Details:");
        course.displayDetails();

        System.out.println("\nOnline Course Details:");
        onlineCourse.displayDetails();

        System.out.println("\nPaid Online Course Details:");
        paidOnlineCourse.displayDetails();
    }
}