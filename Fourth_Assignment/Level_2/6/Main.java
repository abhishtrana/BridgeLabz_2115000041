import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25.0) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] < 30.0) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        System.out.println("\nBMI and Weight Status for the persons:");
        System.out.printf("%-10s %-10s %-10s %-10s %-20s%n", "Person", "Height", "Weight", "BMI", "Weight Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-20s%n",
                    i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}
