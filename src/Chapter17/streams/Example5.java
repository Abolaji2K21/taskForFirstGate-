package Chapter17.streams;

import Chapter16.Transactions;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDEG", "ABCDEFFF", "ABC");

        numbers.stream().map((word) -> word.length()).forEach(System.out::println);
    }

}
