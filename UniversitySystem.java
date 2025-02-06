import java.util.ArrayList;
import java.util.List;

// Student Class
class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Ensure the course also adds the student
            System.out.println(name + " enrolled in " + course.getCourseName());
        } else {
            System.out.println(name + " is already enrolled in " + course.getCourseName());
        }
    }

    public void showEnrolledCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private int professorId;
    private List<Course> assignedCourses;

    public Professor(String name, int professorId) {
        this.name = name;
        this.professorId = professorId;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.setProfessor(this); // Ensure course also links to professor
            System.out.println(name + " assigned to teach " + course.getCourseName());
        } else {
            System.out.println(name + " is already assigned to " + course.getCourseName());
        }
    }

    public void showAssignedCourses() {
        System.out.println(name + "'s Assigned Courses:");
        if (assignedCourses.isEmpty()) {
            System.out.println("No courses assigned.");
            return;
        }
        for (Course c : assignedCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// Course Class
class Course {
    private String courseName;
    private int courseCode;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessorName() {
        return (professor != null) ? professor.getName() : "Not Assigned";
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName + " (Code: " + courseCode + ")");
        System.out.println("Professor: " + getProfessorName());
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

// Main Class to Test the System
public class UniversitySystem {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Charlie", 103);

        // Create Professors
        Professor p1 = new Professor("Dr. Smith", 201);
        Professor p2 = new Professor("Dr. Johnson", 202);

        // Create Courses
        Course c1 = new Course("Data Structures", 301);
        Course c2 = new Course("Database Systems", 302);

        // Students enrolling in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s3.enrollCourse(c2);
        s1.enrollCourse(c2);

        // Professors assigned to courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Display details
        c1.showCourseDetails();
        c2.showCourseDetails();

        s1.showEnrolledCourses();
        p1.showAssignedCourses();
    }
}
