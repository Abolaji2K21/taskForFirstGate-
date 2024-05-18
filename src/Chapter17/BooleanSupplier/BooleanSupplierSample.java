package Chapter17.BooleanSupplier;

import java.util.function.BooleanSupplier;

public class BooleanSupplierSample {
    public static void main(String[] args) {
        int check = 5;
        String word = "checkWording";
        BooleanSupplier wordLength = () -> {
            return word.length() < check;
        };
        boolean result = wordLength.getAsBoolean();
        System.out.println("Result: " + result);

    }
}
