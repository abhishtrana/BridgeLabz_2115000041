import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please think of a number between 1 and 100, and I will try to guess it.");
        
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        boolean isCorrect = false;
        
        while (!isCorrect) {
            guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "?");
            
            String feedback = getUserFeedback(scanner);
            
            isCorrect = processFeedback(feedback, guess);
            if (!isCorrect) {
                if (feedback.equalsIgnoreCase("high")) {
                    upperBound = guess - 1;
                } else if (feedback.equalsIgnoreCase("low")) {
                    lowerBound = guess + 1;
                }
            }
        }
        
        System.out.println("Yay! I guessed your number.");
        scanner.close();
    }

    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Is the guess (high/low/correct): ");
        return scanner.nextLine();
    }

    public static boolean processFeedback(String feedback, int guess) {
        if (feedback.equalsIgnoreCase("correct")) {
            return true;
        } else if (feedback.equalsIgnoreCase("high") || feedback.equalsIgnoreCase("low")) {
            return false;
        } else {
            System.out.println("Invalid feedback. Please respond with 'high', 'low', or 'correct'.");
            return false;
        }
    }
}
