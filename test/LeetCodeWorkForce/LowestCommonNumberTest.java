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
}
