package Chapter17.DoublePredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (FirstValue)-> {
            return true;
        };
        double sampleValue = 3.0;
        boolean result = doublePredicate.test(sampleValue);
        System.out.println(result);
    }
}
