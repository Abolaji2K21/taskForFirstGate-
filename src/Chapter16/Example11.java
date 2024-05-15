package Chapter16;

import java.util.HashMap;
import java.util.Map;

public class Example11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(4, "fourrr");
        System.out.println(map);

        Map<Integer, String> map1 = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(map1);
    }



}
