package LeetCodeWorkForce;

import java.util.Arrays;

public class Using_Streams {

    public static int lowest_common_divisor(int[] array){
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0 && num % 3 == 0 && num % 4 == 0 && num % 5 == 0 &&
                        num % 6 == 0 && num % 7 == 0 && num % 8 == 0 && num % 9 == 0)
                .findFirst()
                .orElse(-1);
    }


}
