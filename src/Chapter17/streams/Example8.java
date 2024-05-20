package Chapter17.streams;

import java.util.List;

public class Example8 {
    public static void main(String[] args) {

        List<Integer> num   = List.of(1,2,3,4,5,6,7,8,9);

        int  result =num.stream().reduce(1,(identity,element)-> identity * element);
        System.out.println(result);

    }
}
