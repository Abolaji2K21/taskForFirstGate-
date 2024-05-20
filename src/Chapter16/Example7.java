package Chapter16;

import java.util.LinkedList;
import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();
        for (int count = 0; count < 20000000; count++) {
            numbers.add(random.nextInt());
        }

        //23219000
        //20500
        var start = System.nanoTime();
        numbers.add(0, 50);
        var end = System.nanoTime();
        System.out.println(end - start);
    }
}
