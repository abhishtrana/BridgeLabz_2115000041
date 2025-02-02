public class Employee {
    public int employeeID; // Public: Accessible everywhere
    protected String department; // Protected: Accessible in the same package and subclasses
    private double salary; // Private: Accessible only within this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to $" + newSalary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
