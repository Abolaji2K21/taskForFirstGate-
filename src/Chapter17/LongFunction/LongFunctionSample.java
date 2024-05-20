package Chapter17.LongFunction;

import java.util.function.LongFunction;

public class LongFunctionSample {
    public static void main(String[] args) {
        LongFunction<String> longToBinary = (num) -> {
            return Long.toBinaryString(num);
        };

        long number = 10L;
        String binaryRepresentation = longToBinary.apply(number);
        System.out.println(binaryRepresentation);

    }
}
