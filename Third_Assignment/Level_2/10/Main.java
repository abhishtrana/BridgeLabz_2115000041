import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();
        int res = 1;

        for (int i = 1; i <= p; i++) {
            res *= n;
        }

        System.out.println(n+ " raised to the power of " + p + " is " + res);
    }
}