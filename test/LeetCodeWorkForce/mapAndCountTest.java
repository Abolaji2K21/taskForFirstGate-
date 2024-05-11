package LeetCodeWorkForce;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class mapAndCountTest {

    @Test
    void testThatMyFunctionCanCount(){
        int[] prototype = {1,2,2,2,3,3};
        int num = 2;
        assertEquals(3, mapAndCount.OyaHelpMeCount(num, prototype));
    }

    @Test
    void testThatMyFunctionCanNotCountEmptyArray(){
        int[] prototype = {};
        int num = 2;
        assertEquals(0, mapAndCount.OyaHelpMeCount(num, prototype));
    }

    @Test
    void testThatMyFunctionCanCountAndTellTheNumberOfElement(){
        int[] prototype = {1,2,2,2,3,3};
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        result.put(1,1);
        result.put(2,3);
        result.put(3,2);
        assertEquals(result,mapAndCount.countNumbers(prototype));

    }
}