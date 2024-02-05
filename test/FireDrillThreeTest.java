import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class FireDrillThreeTest {
    private FireDrillThree myFireDrillThree;

    @BeforeEach
    public void InitializingFireDrill() {
        myFireDrillThree = new FireDrillThree();

    }

    @Test
    void taskOne() {
        int[] array = new int[10];
        myFireDrillThree.setScoreBoard(array);
        assertArrayEquals(array, myFireDrillThree.getScoreBoard());

    }

    @Test
    public void testEvenIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedOutput = {1, 3, 5, 7, 9};
        int[] actualOutput = myFireDrillThree.evenIndex(protoType);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOddIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {2, 4, 6, 8, 10};

        assertArrayEquals(result, myFireDrillThree.oddIndex(protoType));
    }

    @Test
    public void testOfEvenIndex() {

        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {25};
        int[] actual = myFireDrillThree.sumOfEvenIndex(protoType);
        assertArrayEquals(result, actual);
    }

    @Test
    public void testOfOddIndex() {

        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {30};
        int[] actual = myFireDrillThree.sumOfOddEvenIndex(protoType);
        assertArrayEquals(result, actual);
    }

    @Test
    public void testForMaximumNumber() {

        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {10};

        int[] actual = myFireDrillThree.getMaximumNumber(protoType);
        assertArrayEquals(result, actual);
    }

    @Test
    public void testForMinimum() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {1};

        int[] actual = myFireDrillThree.getMinimumNumber(protoType);
        assertArrayEquals(result, actual);

    }

    @Test
    public void testForMaximuminEvenIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {1, 3, 5, 7, 9};
        int[] expected = {9};
        int[] actual = myFireDrillThree.getMaximumNumber(result);
        assertArrayEquals(expected, actual);


    }

    @Test
    public void testForMinimumEvenIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {1, 3, 5, 7, 9};
        int[] expected = {1};
        int[] actual = myFireDrillThree.getMinimumNumber(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForMaximuminOddIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {2, 4, 6, 8, 10};
        int[] expected = {10};
        int[] actual = myFireDrillThree.getMaximumNumber(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForMinimumOddIndex() {
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = {2, 4, 6, 8, 10};
        int[] expected = {2};
        int[] actual = myFireDrillThree.getMinimumNumber(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatOutputComesOutVertically(){
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        String result = " 1 2 3 4 5 6 7 8 9 10 ";
        assertEquals(result, myFireDrillThree.printOnAStraightLine(protoType));
    }

    @Test
    public void testThatOutputComeOutZigZag(){
        int[] protoType = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        String result = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        assertEquals(result, myFireDrillThree.printOnZigZagLine(protoType));

    }

}