package Chapter17.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (a,b) -> a.length() > b ;{
            boolean result =biPredicate.test("word", 9);
            System.out.println(result);

        };
    }
}
