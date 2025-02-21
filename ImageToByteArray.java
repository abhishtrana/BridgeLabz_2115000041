import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) throws IOException {
        File source = new File("image.jpg");
        File destination = new File("copied_image.jpg");

        try (FileInputStream fis = new FileInputStream(source);
                ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream(destination)) {
                fos.write(imageBytes);
            }
        }
        System.out.println("Image copied successfully.");
    }
}
