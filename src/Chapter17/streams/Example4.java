package Chapter17.streams;

import Chapter16.Transactions;

import java.math.BigDecimal;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transactions> numbers = List.of(new Transactions("$2000", "12345"),
                new Transactions("$2309", "24211"),
                new Transactions("$1000", "244452"));

        numbers.stream().filter((transaction) ->  new BigDecimal(transaction.getAmount()
                        .substring(1))
                        .compareTo(new BigDecimal(100)) >= 0)
                .forEach(System.out::println);
    }
}
