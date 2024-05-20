package Chapter17.streams;

import java.util.stream.IntStream;

public class Example7 {
    public static void main(String[] args) {
                String word = "HELLO";


        Boolean result = word.chars().filter((number) -> number > 100).mapToObj((number) -> Boolean.TRUE ).distinct()
                .reduce(false,(a,b) -> a!=b );
        System.out.println(result);
    }
}
