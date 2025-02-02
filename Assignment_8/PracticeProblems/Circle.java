public class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}
