package Chapter17.streams;

import java.util.stream.IntStream;

public class Example2 {
        public static void main(String[] args) {
            IntStream.range(1, 10)
                    .filter((number) -> number % 2 == 0)
                    .forEach(System.out::println);
        }
    }
