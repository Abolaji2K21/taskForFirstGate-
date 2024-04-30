package fireDrillOne;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class ExampleOne {
    public static void main(String[] args)  {

        String FileLocation = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\fireDrillOne";
       try( PrintStream  printStream =
                    new PrintStream("Sample.txt");){
                printStream.println("There is a tide");
       } catch (IOException exception){
           System.out.println("Error" + exception.getMessage());

       }
    }
}
