import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for friend " + (i + 1) + ":");
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        String[] friends = {"Amar", "Akbar", "Anthony"};
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
