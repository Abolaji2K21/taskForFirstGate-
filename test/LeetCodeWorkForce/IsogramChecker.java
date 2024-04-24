package LeetCodeWorkForce;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker  {

    public static boolean isIsogram(String word){
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toLowerCase().toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsAlphabet(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (char c : lowerCaseSentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        return true;
    }


}

