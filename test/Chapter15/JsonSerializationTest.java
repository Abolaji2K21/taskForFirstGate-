package Chapter15;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonSerializationTest {


    @Test
    public void testSerialization() throws JsonProcessingException {
        Person person = new Person();
        person.setName("BEEJAY");
        String dateOfBir = "71-02-1876";
        person.setDateOfBirth(dateOfBir);
        person.setGender(Gender.FEMALE);
        person.setPhoneNumber("08165269244");


        String json = JsonSerialization.serilization(person);
        String expected ="{\"name\":\"BEEJAY\",\"dateOfBirth\":\"71-02-1876\",\"phoneNumber\":\"08165269244\",\"gender\":\"FEMALE\"}";
        assertEquals(expected,json);
    }

}