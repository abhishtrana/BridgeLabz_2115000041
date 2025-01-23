import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiples of " + n + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}