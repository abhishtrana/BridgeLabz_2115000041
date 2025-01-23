import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the intermediate city (viaCity): ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the destination city (toCity): ");
        String toCity = sc.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " miles and "+"the Total Time taken is " + totalTime + " minutes.");
        System.out.print("Enter a fee value: ");
        int fee = sc.nextInt();
        System.out.print("Enter a discount percentage: ");
        int discountPercent = sc.nextInt();
        int discountedFee = fee - (fee * discountPercent / 100);
        int sum = fee + discountPercent * 2;
        int moduloResult = fee % discountPercent;
        System.out.println("The results of Int Operations are: " + discountedFee + ", " + sum + ", and " + moduloResult);
    }
}
