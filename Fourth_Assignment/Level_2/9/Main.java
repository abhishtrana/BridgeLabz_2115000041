import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) System.out.print("Physics: ");
                    if (j == 1) System.out.print("Chemistry: ");
                    if (j == 2) System.out.print("Maths: ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Marks (P=" + marks[i][0] + ", C=" + marks[i][1] + ", M=" + marks[i][2] + "), Percentage=" + percentages[i] + ", Grade=" + grades[i]);
        }
    }
}
