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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

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

    public static List<Transaction> returnAll(LocalDate date, String json) throws IOException {
        Path path = Paths.get(json);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);

        return Arrays.stream(transactions).
                filter(transaction -> transaction.getDate().equals(date)).toList();

    }

    public static List<Transaction> returnAllTransaction(String json) throws IOException {
        Path path = Paths.get(json);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);
        return Arrays.stream(transactions).toList();
    }
    public static List<Transaction>
    returnAllWithInRange(LocalDate startDate, LocalDate endDate, String json) throws IOException {
        Path path = Paths.get(json);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);

        return Arrays.stream(transactions)
                .filter(transaction -> transaction.getDate().compareTo(startDate) >= 0
                        && transaction.getDate().compareTo(endDate) <= 0)
                .toList();


//        return Arrays.stream(transactions)
//                .filter(transaction -> transaction.getDate().equals(startDate)
//                        && transaction.getDate().equals(endDate))
//                .toList();


    }

    public static double returnTheAverageOfAllTransaction(LocalDate startDate, LocalDate endDate, String json) throws IOException {
        Path path = Paths.get(json);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);

        return Arrays.stream(transactions)
                .filter(transaction -> transaction.getDate().compareTo(startDate) >= 0
                        && transaction.getDate().compareTo(endDate) <= 0)
                .mapToDouble(Transaction::getAmount).average().orElse(0.0);

    }



    public static Transaction[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);
    }

   public static Account_Summary getTransactionSummary(String path, int transactionId) throws IOException {
                  Account_Summary summary = new Account_Summary();
                  var transactions = returnAllTransaction(path);
                  summary.setBalance(transactions.stream().filter(transaction -> transaction.getId()==transactionId).mapToDouble(Transaction::getAmount).sum());
                  summary.setNo_Of_Transaction((int) transactions.stream().filter(transaction -> transaction.getId()==transactionId).count());
                  summary.setId(transactionId);
                  return summary;
   }

    public static int getTransactionSummaryOne(String path,int transactionId ) throws IOException {
        var transactions = returnAllTransaction(path);
        return transactions.stream()
                           .filter(transaction -> transaction.getId()==transactionId)
                           .mapToInt(Transaction::getAmount).sum();

    }
}
