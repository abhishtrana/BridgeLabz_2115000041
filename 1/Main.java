abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int workHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double calculateSalary() {
        return getBaseSalary() * workHours;
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

class ITDepartment implements Department {
    private String departmentName;

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class Main{
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(1, "John", 50000);
        Employee partTimeEmployee = new PartTimeEmployee(2, "Jane", 200, 20);

        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();

        ITDepartment itDepartment = new ITDepartment();
        itDepartment.assignDepartment("IT");
        System.out.println(itDepartment.getDepartmentDetails());
    }
}

