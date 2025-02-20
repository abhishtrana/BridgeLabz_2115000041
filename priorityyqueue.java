import java.util.*;
class Patient {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
public class priorityyqueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
