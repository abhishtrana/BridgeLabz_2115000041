import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[digitCount - 1 - i]);
        }
        System.out.println();
    }
}
