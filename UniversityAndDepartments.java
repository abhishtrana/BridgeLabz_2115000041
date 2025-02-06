import java.util.ArrayList;

class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public Department addDepartment(String departmentName) {
        Department dept = new Department(departmentName);
        departments.add(dept);
        return dept;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversityInfo() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            System.out.println(" - " + dept.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println(" - " + faculty.getName());
        }
        System.out.println();
    }

    public void closeUniversity() {
        departments.clear();
        System.out.println("University " + name + " is now closed. All departments have been deleted.\n");
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityAndDepartments {
    public static void main(String[] args) {
        University uni = new University("Global University");
        uni.addDepartment("Engineering");
        uni.addDepartment("Humanities");
        Faculty faculty1 = new Faculty("Dr. John Doe");
        Faculty faculty2 = new Faculty("Dr. Jane Smith");
        uni.addFaculty(faculty1);
        uni.addFaculty(faculty2);
        System.out.println("Before closing the university:");
        uni.displayUniversityInfo();
        uni.closeUniversity();
        System.out.println("After closing the university:");
        uni.displayUniversityInfo();
        System.out.println("Faculty member " + faculty1.getName() + " still exists independently.");
    }
}
