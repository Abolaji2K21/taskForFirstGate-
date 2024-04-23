package Chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\DELL\\Desktop\\SEMICOLON");

        try(DirectoryStream<Path> directoryStream =
                    Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);

        }catch (IOException exception){
            System.err.println(exception .getMessage());
            exception.printStackTrace();
        }
    }
}
