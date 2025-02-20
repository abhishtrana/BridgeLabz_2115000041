import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        long startTime, endTime;

        // StringBuilder Performance
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1e6 + " ms");

        // StringBuffer Performance
        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1e6 + " ms");

        // File Reading Performance
        try (BufferedReader br = new BufferedReader(new FileReader("largefile.txt"))) {
            startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("Total words in file: " + wordCount);
            System.out.println("FileReader Time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // InputStreamReader Performance
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("largefile.txt"), "UTF-8"))) {
            startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("Total words in file: " + wordCount);
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
