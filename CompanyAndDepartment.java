import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public Department addDepartment(String departmentName) {
        Department dept = new Department(departmentName);
        departments.add(dept);
        return dept;
    }

    public void displayCompanyInfo() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            System.out.println(" Department: " + dept.getName());
            dept.displayEmployees();
        }
    }

    public void closeCompany() {
        for (Department dept : departments) {
            dept.removeAllEmployees();
        }
        departments.clear();
        System.out.println("Company " + name + " has been closed. All departments and employees removed.");
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Employee addEmployee(String employeeName, String position) {
        Employee emp = new Employee(employeeName, position);
        employees.add(emp);
        return emp;
    }

    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println("  " + emp);
        }
    }

    public void removeAllEmployees() {
        employees.clear();
    }

    public class Employee {
        private String name;
        private String position;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        @Override
        public String toString() {
            return name + " (" + position + ")";
        }
    }
}

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators");

        Department hr = company.addDepartment("Human Resources");
        Department it = company.addDepartment("IT Department");

        hr.addEmployee("Alice", "HR Manager");
        hr.addEmployee("Bob", "Recruiter");

        it.addEmployee("Charlie", "Software Engineer");
        it.addEmployee("Dave", "System Administrator");

        company.displayCompanyInfo();

        company.closeCompany();

        company.displayCompanyInfo();
    }
}
