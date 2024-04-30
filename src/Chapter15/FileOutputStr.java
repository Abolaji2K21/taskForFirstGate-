package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStr {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\untitled\\src\\main\\java\\chapter15\\files\\newFile.txt";
        try (FileOutputStream sos =
                     new FileOutputStream(fileLocation)) {
            String data = "This is a test";
            sos.write(data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}