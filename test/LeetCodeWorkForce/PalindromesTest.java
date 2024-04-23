package LeetCodeWorkForce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class PalindromesTest {
    @Test
    public void testWord_Check() {
        Assertions.assertTrue(Palindromes.Word_Check("racecar"));

        Assertions.assertFalse(Palindromes.Word_Check("hello"));

//        Assertions.assertTrue(Palindromes.Word_Check(""));
//
//        Assertions.assertTrue(Palindromes.Word_Check("A man a plan a canal Panama"));
//
//        Assertions.assertTrue(Palindromes.Word_Check("Able was I, ere I saw Elba!"));
    }



}