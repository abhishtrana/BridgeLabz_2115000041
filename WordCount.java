import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String wordToFind = "Java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + wordToFind + "' appears " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
