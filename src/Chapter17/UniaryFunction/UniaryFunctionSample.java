package Chapter17.UniaryFunction;

import java.util.function.UnaryOperator;

public class UniaryFunctionSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (x) -> {
            return x * 3;
        };
        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}
