import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, index = 0;
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        while (number != 0) {
            if (index == maxDigits) {
                maxDigits += 10;
                int[] tempArray = new int[maxDigits];
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                digits = tempArray;
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        if (largest != -1 && secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Not enough digits to find the second largest.");
        }
    }
}
