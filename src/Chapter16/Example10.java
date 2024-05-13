package Chapter16;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        number.add(4);
        number.add(1);
        number.add(3);
        number.add(5);

        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println(number.peek());

    }
}
