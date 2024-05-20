package Chapter14.Regex;

public class Example3 {
    public static void main(String[] args) {
        /**
         * quantifiers
         * 1. + --> Matches One or more occurrences of a character
         * 2. * --> Matches Zero or more occurrences of a character
         * 3. ? --> Matches Zero or One occurrence of a character
         * 4. {n} --> Matches exactly n occurrences of a character
         * 5. {n, m} -->  Matches between n and m occurrences of a character
         * 6. {n, } --> Matches at least n occurrences of a given character
         */



        String regex = "\\d{3,}";

        String phoneNumber = "27";

        boolean result = phoneNumber.matches(regex);
        System.out.println(result);

    }
}
