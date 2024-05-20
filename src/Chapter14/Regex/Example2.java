package Chapter14.Regex;

public class Example2  {
    public static void main(String[] args) {
        //Capture Group --> ()
        //meta characters (,),[,],^,~,{,}

        String regex = "^[0-3]234";

        String phoneNumber = "a234";

        boolean result = phoneNumber.matches(regex);
        System.out.println(result);

    }
}