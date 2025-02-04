public class Employee {
    // Static variable
    private static String companyName = "ABC Corp";

    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Final variable for ID that cannot be modified after initialization
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor
    public Employee(int id, String name, String designation) {
        this.id = id; // id is final, so it can only be assigned once
        this.name = name;
        this.designation = designation;
        totalEmployees++; // Increment total employees count when a new employee is created
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    // Method to print employee details if the object is an instance of Employee
    public void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            System.out.println("Employee ID: " + employee.id);
            System.out.println("Employee Name: " + employee.name);
            System.out.println("Employee Designation: " + employee.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("The provided object is not an instance of Employee.");
        }
    }

    public static void main(String[] args) {
        // Create some employees
        Employee emp1 = new Employee(1, "Nikhil Kumar", "Software Engineer");
        Employee emp2 = new Employee(2, "Mudit Jadon", "Product Manager");

        // Display total employees
        Employee.displayTotalEmployees();

        // Print employee details using instanceOf
        emp1.printEmployeeDetails(emp1); // Should print details
        emp1.printEmployeeDetails("Not an Employee"); // Should not print details
    }
}
