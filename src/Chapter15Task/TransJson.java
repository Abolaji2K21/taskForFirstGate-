package Chapter15Task;

import Chapter15.Gender;
import Chapter15.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransJson {
    public static int getTotalTransaction(String jsonFilePath) throws IOException {

        Path path = Paths.get(jsonFilePath);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);
        int sum = 0;

        for(Transaction transaction: transactions){
            sum += transaction.getAmount();
        }
        return sum;
    }

    public static int countDigitInSentence(String jsonFilePath) throws IOException{
        Path path = Paths.get(jsonFilePath);
        String fileContent = Files.readString(path);
        int sum = 0;
        for(int count = 0; count < fileContent.length(); count++ ){
            if(String.valueOf(fileContent.charAt(count)).matches("\\d")){
                sum++;
            }
        }
        return sum;
    }


    public static int countSentenceWhenYouSeeDot(String jsonFile) throws IOException {
            BufferedReader content = new BufferedReader(new FileReader(jsonFile));
            String Content = content.readLine();
            int sum = 0;
            for (int count = 0; count < Content.length(); count++) {
                if (Content.indexOf('.', count) == count) {
                    sum++;
                }
            }
            return sum;
        }



    public static Transaction[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);
    }


}