package Chapter16;

import java.util.LinkedList;
import java.util.List;

import static java.time.Instant.now;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(30);
        numbers.add(2);
        numbers.add(21);
        numbers.add(35);
        numbers.add(90);
        numbers.add(12);
        numbers.add(19);

        System.out.println(numbers);
        System.out.println(numbers.size());


        numbers.addFirst(15);
        numbers.addLast(20);

        numbers.add(5,73);
        System.out.println(numbers);

        var Start = now();
        numbers.add(5,73);
        var end = now();

        System.out.println(numbers);
    }
}
