package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegersTest {


    @Test
    void testUserNumber(){
        int number = 90;
        String result = "The 90 number is less than 100, but its square is greater than 100.";
        assertEquals(result, ComparingIntegers.checkNumber(number));
    }

}