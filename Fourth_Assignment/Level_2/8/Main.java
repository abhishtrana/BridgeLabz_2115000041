import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0);
            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0);
            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();
            } while (maths[i] < 0);
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Marks (P=" + physics[i] + ", C=" + chemistry[i] + ", M=" + maths[i] + "), Percentage=" + percentages[i] + ", Grade=" + grades[i]);
        }
    }
}
