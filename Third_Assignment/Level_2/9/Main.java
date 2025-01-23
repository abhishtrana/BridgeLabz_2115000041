import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n% i == 0) {
                g = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + n + " beside itself is " + g);
    }
}