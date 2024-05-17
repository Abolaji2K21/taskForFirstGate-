package Chapter17.BiConsumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (Name, Age)->{printNameAndAge(Name,Age);};
        biConsumer.accept("BeeJay",30);

        Map<String, Integer> map = Map.of(
                "John", 10,
                "Joe", 20,
                "Josh", 32
        );
        map.forEach(biConsumer);
    }
    private static void printNameAndAge(String Name, int Age){
        System.out.println("You have entered: "+ Name);
        System.out.println("And your Age Is: "+ Age);
    }
}
