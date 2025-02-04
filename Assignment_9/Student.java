public class Student {
    // Static variable for university name, shared across all students
    private static String universityName = "XYZ University";

    // Static variable to keep track of total number of students
    private static int totalStudents = 0;

    // Final variable for rollNumber, which cannot be changed after initialization
    private final int rollNumber;

    // Instance variables for student details
    private String name;
    private String grade;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;  // rollNumber is final, so it can only be assigned once
        this.name = name;
        this.grade = grade;
        totalStudents++;  // Increment total students count when a new student is created
    }

    // Static method to display the total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to update grade if the object is an instance of Student
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade; // Update grade only if the object is an instance of Student
            System.out.println("Grade updated to: " + this.grade);
        } else {
            System.out.println("The provided object is not an instance of Student.");
        }
    }

    // Method to print student details if the object is an instance of Student
    public void printStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Name: " + student.name);
            System.out.println("Grade: " + student.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("The provided object is not an instance of Student.");
        }
    }

    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");

        // Display total students
        Student.displayTotalStudents();

        // Print student details
        student1.printStudentDetails(student1);  // Should print student1 details
        student2.printStudentDetails(student2);  // Should print student2 details

        // Try updating grades
        student1.updateGrade(student1, "A+");  // Should update the grade
        student2.updateGrade(student2, "B+");  // Should update the grade

        // Display total students after new enrollments
        Student.displayTotalStudents();
    }
}
