package LeetCodeWorkForce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyWithMultiplicationSignTest {

    @Test
    void testMyMethod(){
        int a = -3;
        int b = 0;
        int result = -0;

        Assertions.assertEquals(result, MultiplyWithMultiplicationSign.myMethod(a,b));
    }
    @Test
    void testMyMethodAgain(){
        int a = -3;
        int b = -0;
        int result = 0;

        Assertions.assertEquals(result, MultiplyWithMultiplicationSign.myMethodAgain(a,b));
    }
}
