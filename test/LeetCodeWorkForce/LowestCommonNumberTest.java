package LeetCodeWorkForce;

import LeetCodeWorkForce.LowestCommonNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class LowestCommonNumberTest {

    @Test
    public void testLcmWithCommonFactor() {
        int[] array = {4, 6, 8, 10};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(2, result);
    }

    @Test
    public void testLcmWithNoCommonFactor() {
        int[] array = {3, 9, 6, 12};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(3, result);
    }

    @Test
    public void testLcmWithNoInput() {
        int[] array = {};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(-1, result);
    }

    @Test
    public void testLcmWithSingleNumber() {
        int[] array = {7};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(7, result);
    }

    @Test
    public void testLcmWithZero() {
        int[] array = {0, 12, 18, 24};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(2, result);
    }

    @Test
    public void testLcmWithNegativeNumbers() {
        int[] array = {-4, -6, -8, -10};
        int result = LowestCommonNumber.Lcm(array);
        assertEquals(2, result);
    }

    @Test
    public void testGetMaximumProduct(){
        int[] array = {-2,-7,-9,-10};
        int result = LowestCommonNumber.maximumProduct(array);
        assertEquals(90, result);
    }

    @Test
    public void testGetMaximumProductWithAnother(){
        int[] array = {-9, 9, 6, 4, -20, 11};
        int result = LowestCommonNumber.maximumProductUsingForLoop(array);
        assertEquals(180, result);
    }

    @Test
    public void testThatZeroIsMyLastIndex(){
        int[] prototype = {0,0,0,1,2,4,4,2};
        int[] result = {1,2,4,4,2,0,0,0};
        assertArrayEquals(result, LowestCommonNumber.returnAllZeroToTheLast(prototype));
    }

    @Test
    public void testThatZeroIsMyLastIndexEmpty(){
        int[] prototype = {};
        int[] result = {};
        assertArrayEquals(result, LowestCommonNumber.returnAllZeroToTheLast(prototype));
    }

    @Test
    public void testThatZeroIsMyLastIndexZeroAllThrough(){
        int[] prototype = {0,0,0,0,0,0,0};
        int[] result = {0,0,0,0,0,0,0};
        assertArrayEquals(result, LowestCommonNumber.returnAllZeroToTheLast(prototype));
    }

    @Test
    public void testThatZeroIsMyLastIndexZeroWithNegative(){
        int[] prototype = {-1,-2,-3,-4,-5,-5,-6};
        int[] result = null;
        assertArrayEquals(null, LowestCommonNumber.returnAllZeroToTheLast(prototype));
    }

}

