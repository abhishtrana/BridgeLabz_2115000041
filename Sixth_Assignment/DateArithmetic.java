import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateInput, formatter);
        
        LocalDate updatedDate = date
            .plusDays(7)
            .plusMonths(1)
            .plusYears(2)
            .minusWeeks(3);
        
        System.out.println("Original Date: " + date);
        System.out.println("Updated Date: " + updatedDate);
        
        scanner.close();
    }
}
