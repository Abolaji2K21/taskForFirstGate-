package Chapter17.streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,33,40,50);

        numbers.
                stream().
                filter((number)
                        -> number % 2 != 0 )
                .forEach(System.out::println);
    }
}
