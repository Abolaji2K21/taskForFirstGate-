package Chapter17.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {

    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length() == number;

        boolean result =biFunction.apply("JAGAGBAN", 7);
        System.out.println(result);
    }
}
