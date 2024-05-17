package Chapter17.streams;

import Chapter16.Transactions;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20,30,40,50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach((number) ->System.out.println(number));

        Stream<Integer> stream1 = Stream.of(20,30,40,50);

        Stream<Transactions> transactionStream = Stream.of(
                new Transactions("$1000", "1234"),
                new Transactions("$10000", "12345"));
        transactionStream.forEach((transaction) -> {
            System.out.println(transaction.getAmount());
            System.out.println(transaction.getAccountNumber());
        });
        Stream<Integer> integerStream = Stream.generate(() -> new SecureRandom().nextInt()).limit(4);
        integerStream.forEach(System.out::println);}

}
