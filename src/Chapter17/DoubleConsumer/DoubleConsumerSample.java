package Chapter17.DoubleConsumer;

import java.util.function.DoubleConsumer;


public class DoubleConsumerSample {

    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = (word) -> {

            System.out.println("You have entered: "+ word);
            System.out.println("Received word: " + word);

        };
        doubleConsumer.accept(2.0);

    }}
