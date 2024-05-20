package Chapter17.LongBinaryOperator;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorSample {
    public static void main(String[] args) {
        LongBinaryOperator longBinaryOperator = (firstValue, SecondValue)->{
            return (firstValue * SecondValue);
        };
        long result = longBinaryOperator.applyAsLong(10L, 20L);
        System.out.println(result);
    }
}
