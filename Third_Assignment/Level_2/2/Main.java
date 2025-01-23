import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y >= 1582) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                System.out.println("The year " + y + " is a Leap Year.");
            } else {
                System.out.println("The year " + y + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year must be greater than or equal to 1582.");
        }
    }
}