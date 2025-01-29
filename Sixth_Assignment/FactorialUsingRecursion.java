import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = getInput(scanner);
        
        long result = calculateFactorial(number);
        
        displayResult(number, result);
        
        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    public static void displayResult(int number, long result) {
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
