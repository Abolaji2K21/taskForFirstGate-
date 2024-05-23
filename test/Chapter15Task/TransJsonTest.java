package Chapter15Task;


import Chapter15.Gender;
import Chapter15.JsonSerialization;
import Chapter15.Person;
import Chapter15Task.Transaction;
import Chapter15Task.Type;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static Chapter15Task.TransJson.*;
import static org.junit.jupiter.api.Assertions.*;

class TransJsonTest {
//    @Test
//    void testDeSerialization() throws JsonProcessingException {
//        Transaction person = new Transaction();
//        person.setId(1);
//        person.setName("PenIsUp");
//        LocalDate date = LocalDate.of(2024,5,6);
//        person.setDate(date);
//        person.setType(Type.CREDIT);
//        person.setAmount(3000);
//
//
//
//        Transaction personFromJson = JsonSerialization.deserialize(TransactionOne);
//        System.out.println("person from json:" + personFromJson);
//
//        assert personFromJson != null;
//        assertEquals(person.getType(),personFromJson.getType());
//        assertEquals(person.getDate(),personFromJson.getDate());
//        assertEquals(person.getName(),personFromJson.getName());
//        assertEquals(person.getId(),personFromJson.getId());
//        assertEquals(person.getAmount(), personFromJson.getAmount());
//
//
//    }

    @Test
    public void calTransaction() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        int transactionTotal = 10000;
        assertEquals(transactionTotal, TransJson.getTotalTransaction(input));
    }

//    @Test
//    public void countDigits() throws IOException {
//        String input = "C:\\Users\\DELL\\Desktop\\CountText.txt";
//        int result = 2;
//        assertEquals(result, TransJson.countDigitInSentence(input));
//    }
//
//    @Test
//    public void countSentence() throws IOException {
//        String input = "C:\\Users\\DELL\\Desktop\\CountText.txt";
//        int result = 3;
//        assertEquals(result, TransJson.countSentenceWhenYouSeeDot(input));
//
//    }

    @Test
    public void getAllTransactions() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        LocalDate date = LocalDate.of(2024, 05, 13);
        List<Transaction> transactions = returnAll(date,input);
        assertEquals(1, transactions.size());
        assertEquals("Penis", transactions.get(0).getName());
//        assertEquals("PenIsUp", transactions.get(1).getName());
//        assertEquals("PenIsUp", transactions.get(2).getName());

    }



    @Test
    public void getAllTransactionsWithInRange() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        LocalDate startDate = LocalDate.of(2024, 05, 12);
        LocalDate endDate = LocalDate.of(2024, 05, 19);

        List<Transaction> transactions = returnAllWithInRange(startDate,endDate,input);
        assertEquals(3, transactions.size());
        assertEquals("Penis", transactions.get(0).getName());
        assertEquals("PenisDown", transactions.get(1).getName());

    }


    @Test
    public void getAverageOfAllTransactionWithInRange() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        LocalDate startDate = LocalDate.of(2024, 05, 12);
        LocalDate endDate = LocalDate.of(2024, 05, 19);

        double result = returnTheAverageOfAllTransaction(startDate,endDate,input);
        double expect =  Math.round(result * 100.0) / 100.0;
        assertEquals(3333.33,expect);

    }

    @Test
    public void getAllTransaction() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        List<Transaction> transactions = returnAllTransaction(input);
        assertEquals(3, transactions.size());
    }

    @Test
    public void getTransactionSummaryTest() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        int transactionId = 2;
        int result = 10000;
        assertEquals(result,getTransactionSummary(input,transactionId).getBalance());

    }

    @Test
    public void getTransactionSummaryTestOne() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        int transactionId = 2;
        int result = 10000;
        assertEquals(result,getTransactionSummaryOne(input,transactionId));

    }
}