package problemstatements.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        Employee[] employees = new Employee[] {
                new FullTimeEmployee("FT001", "Alice", 50000),
                new PartTimeEmployee("PT001", "Bob", 200, 120)
        };

        // Assign departments
        ((FullTimeEmployee) employees[0]).assignDepartment("Engineering");
        ((PartTimeEmployee) employees[1]).assignDepartment("Support");

        // Process and display employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());

            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }

            System.out.println("-----------------------");
        }
    }
}
