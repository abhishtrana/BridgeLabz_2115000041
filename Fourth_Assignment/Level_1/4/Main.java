import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }

            numbers[index] = input;
            index++;

            if (index == 10) {
                break;
            }
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);
    }
}
