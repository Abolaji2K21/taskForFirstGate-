package LeetCodeWorkForce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class PalindromesTest {
    @Test
    public void testWord_Check() {
        Assertions.assertTrue(Palindromes.Word_Check("racecar so ok"));

        Assertions.assertFalse(Palindromes.Word_Check("hello"));

    }

    @Test
    public void testSentence_Check(){
        String protoType = "Hello sir this one ";
        String result = "one this sir Hello";
        Assertions.assertEquals(result, Palindromes.SentenceCheck(protoType));
    }



}