package Chapter14.Regex;

public class Example1  {
    public static void main(String[] args) {
        //Character Class
        //1. [0-9] - will match a single digit character
        //2. \d - will match a single digit character
        //3. \w - will match a word character
        //4. \D - will match a non-digit character
        //5. \W - will match a non-word character
        //6. [a-z] - matches any lower-case alphabet character
        //7. [A-Z] - matches any upper-case alphabet character
        //8. [A-z] - matches any alphabet character
        //9. . --> matches any character

        String regex = ".{3}";
        String phoneNumber = "8a_";

        boolean result = phoneNumber.matches(regex);
        System.out.println(result);

    }
}
