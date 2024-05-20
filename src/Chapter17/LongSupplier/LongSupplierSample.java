package Chapter17.LongSupplier;

import java.util.Random;
import java.util.function.LongSupplier;

public class LongSupplierSample {
    public static void main(String[] args) {
        LongSupplier randomLongSupplier = () -> {
            Random random = new Random();
            return random.nextLong();

        };
        long randomValue = randomLongSupplier.getAsLong();
        System.out.println(randomValue);
    }
}
