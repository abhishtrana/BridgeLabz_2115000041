import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.println("\nEnter data for employee " + (i + 1) + ":");
                    System.out.print("Enter the salary of the employee: ");
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] < 0) {
                        System.out.println("Salary cannot be negative. Please enter again.");
                        continue;
                    }
                    System.out.print("Enter the years of service of the employee: ");
                    yearsOfService[i] = scanner.nextInt();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Years of service cannot be negative. Please enter again.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter valid numbers for salary and years of service.");
                    scanner.nextLine();
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d - Salary: $%.2f, Bonus: $%.2f, New Salary: $%.2f%n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.printf("\nTotal Bonus Payout: $%.2f%n", totalBonus);
        System.out.printf("Total Old Salary: $%.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: $%.2f%n", totalNewSalary);
    }
}
