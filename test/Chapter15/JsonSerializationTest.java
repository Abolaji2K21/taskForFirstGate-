
package Chapter15;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;

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
        System.out.println(json);
        String expected ="{\"name\":\"BEEJAY\",\"dateOfBirth\":\"71-02-1876\",\"phoneNumber\":\"08165269244\",\"gender\":\"FEMALE\"}";
        assertEquals(expected,json);
    }

    @Test
    void testDeSerialization() throws JsonProcessingException {
        Person person = new Person();
        person.setName("BEEJAY");
        String dateOfBir = "71-02-1876";
        person.setDateOfBirth(dateOfBir);
        person.setGender(Gender.FEMALE);
        person.setPhoneNumber("08165269244");

        String json = "{\"name\":\"BEEJAY\",\"dateOfBirth\":\"71-02-1876\",\"phoneNumber\":\"08165269244\",\"gender\":\"FEMALE\"}";
//        System.out.println("json" + json);
        Person personFromJson = JsonSerialization.deserialize(json);
        System.out.println("person from json:" + personFromJson);

        assert personFromJson != null;
        assertEquals(person.getGender(),personFromJson.getGender());
        assertEquals(person.getDateOfBirth(),personFromJson.getDateOfBirth());
        assertEquals(person.getName(),personFromJson.getName());
        assertEquals(person.getPhoneNumber(),personFromJson.getPhoneNumber());


    }

}