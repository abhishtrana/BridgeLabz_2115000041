import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1) {
            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The number " + n + " is a prime number.");
            } else {
                System.out.println("The number " + n+ " is not a prime number.");
            }
        } else {
            System.out.println("Prime numbers are greater than 1.");
        }
    }
}