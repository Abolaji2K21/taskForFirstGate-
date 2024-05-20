package Chapter14.example;

public class Example11 {
    public static void main(String[] args) {
        String s1 = new String("John");
        StringBuilder s2 = new StringBuilder("Doe");
        StringBuffer s3 = new StringBuffer("John");

        System.out.println(reverse(s2));
    }

    private static CharSequence reverse(CharSequence sequence){
        return new StringBuilder(sequence).reverse();
    }
}
