package Chapter16;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);

        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }
}