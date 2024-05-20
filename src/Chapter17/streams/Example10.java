package Chapter17.streams;

import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,4,5,7,8,9,7,8,9,1,34,5,45);

        var result = numbers.stream()
                            .sorted()
                            .toList();

        System.out.println(result);

        var resultOne = numbers.stream()

                .distinct()

                .sorted()
                                .toList();

        System.out.println(resultOne);

    }
}
