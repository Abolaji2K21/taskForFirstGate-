package Chapter17.streams;

import java.util.stream.IntStream;

public class Example9 {
    public static void main(String[] args) {
        String word = "HELLO";

        IntStream intStream = word.chars();
        intStream.forEach(System.out::println);
    }
}
