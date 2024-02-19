package chapterThree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FireDrillFiveTest {

    @Test
    void checkLengthOfArray() {
        FireDrillFive myFireDrillFive = new FireDrillFive();
        int[] inputArray = new int[5];
        assertEquals(5, myFireDrillFive.getArrayLength(inputArray).length);



    }

    @Test
    void Check(){
        FireDrillFive myFireDrillFive = new FireDrillFive();
        int[] inputArray = {4,5,8,8,7};
        boolean[] outputArray = {false, true, false, false, true};
        assertArrayEquals(outputArray, myFireDrillFive.check(inputArray));


    }

    @Test
    void Check2(){
        FireDrillFive myFireDrillFive = new FireDrillFive();
        int[] inputArray = {4,5,8,8,7};
        boolean[] outputArray = {false,true,false,false,true };
        assertArrayEquals(outputArray, myFireDrillFive.check2(inputArray));


    }

    @Test
    void karray(){
        FireDrillFive myFireDrillFive = new FireDrillFive();
        int[] outputArray = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(outputArray, myFireDrillFive.newArrayLen(outputArray));

    }
}