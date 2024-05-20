package Chapter17.streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
//        String word = "HELLO";

//        IntStream intStream = word.chars();
//        intStream.forEach(System.out::println);

//        Boolean result = word.chars().filter((number) -> number > 100).mapToObj((number) -> Boolean.TRUE ).distinct()
//                .reduce(false,(a,b) -> a!=b );
//        System.out.println(result);

        List<Integer> num   = List.of(1,2,3,4,5,6,7,8,9);

        int  result =num.stream().reduce(0,(identity,element)-> identity + element);
        System.out.println(result);
    }
}
