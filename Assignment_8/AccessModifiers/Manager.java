public class Manager extends Employee {
    private String teamName; // Additional attribute for managers

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Display Manager Details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Public attribute from Employee class
        System.out.println("Department: " + department); // Protected attribute from Employee class
        // Can't access `salary` directly since it's private in Employee
        System.out.println("Salary: $" + getSalary()); // Using getter method
        System.out.println("Team Name: " + teamName);
    }
}
