package Chapter17.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations {
    public static List<Integer> getEvenNumbersOf(List<Integer> list) {
        return list.stream()
                .filter((number) -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoint) {
        return codePoint.stream()
                .collect(Collectors.toMap((number) ->number, Character:: toString, (a,b)->a));
    }
}


