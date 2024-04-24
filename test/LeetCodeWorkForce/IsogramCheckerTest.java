package LeetCodeWorkForce;

import LeetCodeWorkForce.IsogramChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsogramCheckerTest {
    @Test
    void testIsIsogram() {
        assertFalse(IsogramChecker.isIsogram("hello"));
        assertFalse(IsogramChecker.isIsogram("helloo"));
        assertTrue(IsogramChecker.isIsogram("world"));
        assertFalse(IsogramChecker.isIsogram("worldd"));
        assertTrue(IsogramChecker.isIsogram("isogram"));
        assertFalse(IsogramChecker.isIsogram("not an isogram"));
        assertTrue(IsogramChecker.isIsogram(""));
    }

    @Test
    void testContainsAlphabet() {
        assertTrue(IsogramChecker.containsAlphabet("the quick brown fox jumps over the lazy dog"));
        assertFalse(IsogramChecker.containsAlphabet("the quick brown fox jumps over the lazy"));
        assertTrue(IsogramChecker.containsAlphabet("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(IsogramChecker.containsAlphabet("abcde ghijklmnopqrstuvwxyz"));
        assertFalse(IsogramChecker.containsAlphabet(""));
    }
}
