package Chapter17.streams;

import java.util.List;

public class Example11 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,4,5,7,8,9,7,8,9,1,34,5,45);
                numbers.stream()
                .map((number)-> String.format("number = %d", number))
                .forEach((System.out::println));

    }

}
