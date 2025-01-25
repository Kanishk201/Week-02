package assistedproblems.employeemanagementsystem;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Manager manager = new Manager("Alice", 101, 90000, 5);
        Developer developer = new Developer("Bob", 102, 75000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        // Displaying details of each employee type
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}
