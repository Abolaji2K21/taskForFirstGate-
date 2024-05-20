package Chapter14.Regex;

public class Example4  {
    public static void main(String[] args) {
        String regex = "^\\d+";

        String number = "273536736";

        if (!number.matches(regex)){
            System.err.println("invalid number");
            System.exit(1);
        }
        System.out.println(number);
    }
}