package Chapter17.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word)->//s represent the parameter of the lambda

         {
             System.out.println("You have entered"+ word);
             System.out.println("I am printing"+ word);
        };
//        consumer.accept("DjFemz");
        List<String> names = List.of("Joe", "John","judas");
        names.forEach(consumer);
    }
}
