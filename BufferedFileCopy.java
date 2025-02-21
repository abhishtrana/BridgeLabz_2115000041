import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        File source = new File("largefile.txt");
        File destination = new File("copy_largefile.txt");

        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
