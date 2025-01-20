// Base class: Employee
class Employee {
    public int employeeID; // Public member
    protected String department; // Protected member
    private double salary; // Private member

    // Constructor for Employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
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

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize; // Number of employees managed

    // Constructor for Manager
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "HR", 50000.0);
        System.out.println("Employee Details:");
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
        System.out.println("Manager's Salary: $" + manager.getSalary());
    }
}