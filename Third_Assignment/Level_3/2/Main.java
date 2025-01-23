import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        while (n != 0) {
            n /= 10;
            c++;
        }
        System.out.println("Number of digits: " + c);
    }
}