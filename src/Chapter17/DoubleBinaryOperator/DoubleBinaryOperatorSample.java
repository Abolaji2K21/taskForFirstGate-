package Chapter17.DoubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (firstVar, secondVar)-> {
                return firstVar * secondVar;
        };
        double result = doubleBinaryOperator.applyAsDouble(2.0, 3.0);
        System.out.println("Result of multiplication: " + result);

    }
}
