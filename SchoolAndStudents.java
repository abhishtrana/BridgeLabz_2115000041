import java.util.ArrayList;

class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            student.displayCourses();
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getName());
        }
    }

    // Added getter to access the student's name from other classes
    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Course: " + name);
        for (Student student : students) {
            // Use the getter method instead of accessing the private field directly
            System.out.println("Enrolled Student: " + student.getName());
        }
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        
        school.addStudent(student1);
        school.addStudent(student2);
        
        school.displayStudents();
        course1.displayStudents();
        course2.displayStudents();
    }
}
