import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y < 1582) {
            System.out.println("Year must be greater than or equal to 1582");
        } else {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0) {
                        System.out.println(y + " is a Leap Year");
                    } else {
                        System.out.println(y + " is not a Leap Year");
                    }
                } else {
                    System.out.println(y + " is a Leap Year");
                }
            } else {
                System.out.println(y + " is not a Leap Year");
            }
        }
    }
}
