import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String dateInput1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(dateInput1, formatter);
        
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String dateInput2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(dateInput2, formatter);
        
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
        
        scanner.close();
    }
}
