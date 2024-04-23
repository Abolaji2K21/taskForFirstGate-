package LeetCodeWorkForce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void testToValidatePassKeyWithWrongMatch(){
        String password = "Okay";
        assertFalse(PasswordValidation.validation(password));
    }

    @Test
    void testToValidatePassKeyWithRightMatch(){
        String password = "Password01";
        assertTrue(PasswordValidation.validation(password));
    }

    @Test
    void  testHighestPrd(){
        int [] values = {1,2};
      assertEquals(Using_Streams.maxPdtWithLambdas(values),2);
    }

}