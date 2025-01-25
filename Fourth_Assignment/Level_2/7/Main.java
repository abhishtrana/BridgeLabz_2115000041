import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (weight <= 0);
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (height <= 0);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI and Weight Status for the persons:");
        System.out.printf("%-10s %-10s %-10s %-10s %-20s%n", "Person", "Height", "Weight", "BMI", "Weight Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-20s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
