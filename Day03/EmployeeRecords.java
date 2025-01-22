// Base class: Employee
class Employee {
    // Static variable shared across all employees
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0; // To track the total number of employees

    // Final variable for employee ID
    public final int employeeID; // Public member
    protected String department; // Protected member
    private double salary; // Private member

    // Constructor for Employee using 'this' keyword
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increment the total employee count
    }

    // Static method to display the company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary must be greater than 0.");
        }
    }

    // Public method to get the current salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details with instanceof check
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize; // Number of employees managed

    // Constructor for Manager using 'this' and 'super' keywords
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        if (this instanceof Manager) {
            System.out.println("Manager Details:");
            System.out.println("Employee ID: " + employeeID); // Accessing public member
            System.out.println("Department: " + department); // Accessing protected member
            System.out.println("Team Size: " + teamSize);
        } else {
            System.out.println("The object is not an instance of the Manager class.");
        }
    }
}

// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Display the company name
        Employee.displayCompanyName();

        // Create an Employee object
        Employee employee = new Employee(101, "HR", 50000.0);
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        // Modify salary using a public method
        employee.setSalary(55000.0);
        System.out.println("\nUpdated Employee Details:");
        employee.displayDetails();

        // Create a Manager object
        Manager manager = new Manager(201, "IT", 80000.0, 10);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();

        // Access Manager's salary through the Employee class method
        System.out.println("\nManager's Salary: $" + manager.getSalary());

        // Display the total number of employees
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
