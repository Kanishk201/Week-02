package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Clerk");

        // Display details for each role
        System.out.println("Teacher Details:");
        teacher.displayRole();

        System.out.println("\nStudent Details:");
        student.displayRole();

        System.out.println("\nStaff Details:");
        staff.displayRole();
    }
}