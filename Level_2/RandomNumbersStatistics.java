import java.util.Arrays;
import java.util.Random;

public class RandomNumbersStatistics {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates 4-digit numbers
        }
        return numbers;
    }

    // Method to calculate average, minimum, and maximum values
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] stats = findAverageMinMax(randomNumbers);

        // Display results
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.println("Minimum Value: " + (int) stats[1]);
        System.out.println("Maximum Value: " + (int) stats[2]);
    }
}
