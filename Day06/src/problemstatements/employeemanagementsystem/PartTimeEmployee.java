package problemstatements.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String departmentName;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // Base salary not applicable for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
