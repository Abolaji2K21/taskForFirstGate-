package LeetCodeWorkForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Palindromes {
    public static boolean Word_Check(String Word) {
        String wordToLowerCase = Word.toLowerCase();
        StringBuilder result = new StringBuilder(wordToLowerCase).reverse();
        return result.toString().equals(wordToLowerCase);
    }


    public static String SentenceCheck(String sentence) {
        String reverseSentence = "";
        String currentWord = "";

        for (int check = 0; check < sentence.length(); check++) {
            char character = sentence.charAt(check);

            if (character != ' ') {
                currentWord = currentWord + character;
                System.out.println(currentWord);

            } else {
                reverseSentence = currentWord + " " + reverseSentence;
                System.out.println(reverseSentence);
                currentWord = "";
            }

        }

        reverseSentence = currentWord + " " + reverseSentence;

        return reverseSentence.strip();
    }

}