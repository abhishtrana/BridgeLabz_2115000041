import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();       
        printFibonacciSequence(terms);       
        scanner.close();
    }

    public static void printFibonacciSequence(int terms) {
        int first = 0, second = 1;        
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
