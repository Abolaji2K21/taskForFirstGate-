package Chapter17.PredicateFunction;

import java.util.function.Predicate;

public class PredicateFunctionSample {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = (word) -> {
            return word;
        };
        boolean result = predicate.test(Boolean.valueOf("word"));
        System.out.println(result);
    }

}
