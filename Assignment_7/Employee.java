// Employee Class
public class Employee {
    // Private attributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main Method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        Employee emp2 = new Employee("Bob", 102, 60000);

        System.out.println("=== Employee 1 ===");
        emp1.displayDetails();
        System.out.println("\n=== Employee 2 ===");
        emp2.displayDetails();
    }
}
