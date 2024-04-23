package LeetCodeWorkForce;

public class Palindromes {
    public static boolean Word_Check(String Word){
        String wordToLowerCase = Word.toLowerCase();
        StringBuilder result = new StringBuilder(wordToLowerCase).reverse();
        return result.toString().equals(wordToLowerCase);
    }
}
