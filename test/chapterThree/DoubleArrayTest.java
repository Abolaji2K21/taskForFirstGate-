package chapterThree;

import fireDrillFour.DoubleArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DoubleArrayTest {

    @Test
    public void testThatOutputArrayIsTwiceTheInputArray(){
        DoubleArray myDoubleArray = new DoubleArray();
        int[] inputArray = new int[2];

        assertEquals(4, myDoubleArray.getDoubleArray(inputArray).length);


    }

    @Test
    public void testThatOutputElementIsCollectedAndDoubled(){
        DoubleArray myDoubleArray = new DoubleArray();

        int[] inputArray = {2, 4 ,6};
        int[] outputArray = {2, 4, 6, 4, 8, 12};
        assertArrayEquals(outputArray, myDoubleArray.calculateDoubleArray(inputArray));

    }

}
