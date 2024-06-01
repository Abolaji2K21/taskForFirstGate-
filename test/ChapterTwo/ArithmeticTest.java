package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {


    @Test
    public void testArithmetic() {
        int firstInput = 2;
        int secondInput = 3;
        int result = 13;

        assertEquals(result, Arithmetic.sumOfSquares(firstInput,secondInput));
    }

    @Test
    public void testTheAddMethod(){
        int firstInput = -2;
        int secondInput = 0;
        int result = 4;

        assertEquals(result, Arithmetic.sumOfSquares(firstInput,secondInput));
    }

    @Test
    public void testTheSubtractMethod(){
        int firstInput = -2;
        int secondInput = 2;
        int result = 0;

        assertEquals(result, Arithmetic.differenceOfSquares(firstInput,secondInput));
    }

}