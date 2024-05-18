package Chapter17.DoubleToLongFunction;

import com.sun.jdi.DoubleValue;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (decimalNumber)->  {
            return Double.valueOf(decimalNumber).longValue();
        };
        Long number = doubleToLongFunction.applyAsLong(20.00);
        System.out.println(number);

    }
}
