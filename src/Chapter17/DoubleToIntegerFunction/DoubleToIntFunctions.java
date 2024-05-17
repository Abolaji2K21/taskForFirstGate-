package Chapter17.DoubleToIntegerFunction;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctions {

    public static void main(String[] args) {
         DoubleToIntFunction doubleToIntFunction = (decimalNumber) -> Double.valueOf(decimalNumber).intValue();
            int number = doubleToIntFunction.applyAsInt(20.00);
            System.out.println(number);

        }

}