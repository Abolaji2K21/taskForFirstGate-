package Chapter16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example5 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(12);
        numbers.add(13);
        numbers.add(11);
        numbers.add(14);


        for (int number:numbers) {
            System.out.println(number);
        }
    }
}