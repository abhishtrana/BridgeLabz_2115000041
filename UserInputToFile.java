import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("User input saved to output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
