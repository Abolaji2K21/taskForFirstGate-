package LeetCodeWorkForce;

import org.junit.jupiter.api.Test;

import static LeetCodeWorkForce.ArrayPosition.getPositionArray;
import static org.junit.jupiter.api.Assertions.*;

class ArrayPositionTest {

    @Test
    void testThatICanGetIndexPosition(){
        int[] inputArray = {10, 30, 77, 12};
        int[] outputArray ={1, 2, 3, 4};


        assertArrayEquals(outputArray, getPositionArray(inputArray));
    }

}