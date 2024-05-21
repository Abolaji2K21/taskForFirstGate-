package Chapter17.streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> num   = List.of(1,2,3,4,5,6,7,8,9);

        double average = num.stream().flatMapToInt((element) -> IntStream.of(element * 2)).
                average().orElseThrow(() -> new RuntimeException("number not present "));
        System.out.println(average);
    }
}
