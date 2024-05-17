package Chapter17.BiConsumer;

import java.util.NavigableMap;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (Name, Age)->{printNameAndAge(Name,Age);};
        biConsumer.accept("BeeJay",30);
    }
    private static void printNameAndAge(String Name, int Age){
        System.out.println("You have entered: "+ Name);
        System.out.println("And your Age Is: "+ Age);
    }
}
