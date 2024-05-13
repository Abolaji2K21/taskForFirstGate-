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
    public void calTransaction() throws IOException{
        String input = "C:\\Users\\DELL\\IdeaProjects\\taskforfirstgate\\src\\Chapter15Task\\TransactionOne.json";
        int transactionTotal = 10000;
        assertEquals(transactionTotal, TransJson.getTotalTransaction(input));
    }

    @Test
    public void countDigits() throws IOException{
        String input = "C:\\Users\\DELL\\Desktop\\CountText.txt";
        int result = 2;
        assertEquals(result, TransJson.countDigitInSentence(input));
    }

    @Test
    public void countSentence() throws IOException{
        String input = "C:\\Users\\DELL\\Desktop\\CountText.txt";
        int result = 3;
        assertEquals(result, TransJson.countSentenceWhenYouSeeDot(input));

    }
}