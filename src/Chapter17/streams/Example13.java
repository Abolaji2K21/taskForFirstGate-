package Chapter17.streams;

import java.util.List;
import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        List<String> list  = List.of(

                "ABCD","OKAY","HEY"
        );


        System.out.println(list.stream()
                .flatMap((element) -> Stream.of(new StringBuilder(element).reverse())).toList());
    }
}
