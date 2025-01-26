package problemstatements.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    private static final double BONUS_RATE = 0.2; // 20%
    private String departmentName;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getBaseSalary() * BONUS_RATE);
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
