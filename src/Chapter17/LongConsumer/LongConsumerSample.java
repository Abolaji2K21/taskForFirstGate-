package Chapter17.LongConsumer;

import java.util.function.LongConsumer;

public class LongConsumerSample {
    public static void main(String[] args) {

        LongConsumer printLong = (num) -> {
            System.out.println(num);

        };
        long number = 42L;
        printLong.accept(number);
    }
}
