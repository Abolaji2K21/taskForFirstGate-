package Chapter17.LongPredicate;

import java.util.function.LongPredicate;

public class LongPredicateSample {
    public static void main(String[] args) {
        LongPredicate isEven = (num) -> {
            return num % 2 == 0;
        };

        long number = 10L;
        if (isEven.test(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is not even.");
        }
    }
}

