package chapterThree;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.NoSuchElementException;

public class ArrayMinMaxSumTest {

    @Test
    public void testGetMinMaxSum_NoDuplicates() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {15, 10, 14};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }

    @Test
    public void testGetMinMaxSum_WithDuplicates() {
        int[] array = {2, 2, 3, 4, 4};
        int[] expected = {15, 11, 13};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }

    @Test
    public void testGetMinMaxSum_NegativeNumbers() {
        int[] array = {-5, 0, 5, 10};
        int[] expected = {10, 0, 15};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }

    @Test
    public void testGetMinMaxSum_EmptyArray() {
        int[] array = {};
        assertThrows(NoSuchElementException.class, ()->ArrayMinMaxSum.getMinMaxSum(array));
    }
    @Test
    public void testGetMinMaxSum_AllSamePositiveValues() {
        int[] array = {5, 5, 5, 5, 5};
        int[] expected = {25, 20, 20};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }

    @Test
    public void testGetMinMaxSum_AllSameNegativeValues() {
        int[] array = {-5, -5, -5, -5, -5};
        int[] expected = {-25, -20, -20};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }

    @Test
    public void testGetMinMaxSum_OneElementArray() {
        int[] array = {100};
        int[] expected = {100, 0, 0};
        assertArrayEquals(expected, ArrayMinMaxSum.getMinMaxSum(array));
    }



}
