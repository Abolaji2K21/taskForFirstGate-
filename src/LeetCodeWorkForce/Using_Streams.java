package LeetCodeWorkForce;
import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Integer.*;

public class Using_Streams {

    public static int lowest_common_divisor(int[] array){
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0 && num % 3 == 0 && num % 4 == 0 && num % 5 == 0 &&
                        num % 6 == 0 && num % 7 == 0 && num % 8 == 0 && num % 9 == 0)
                .findFirst()
                .orElse(-1);
    }

    public static int maxPdt(int[] array){
       int maxProduct = MIN_VALUE;
           for(int index = 0; index < array.length; index++){
                        for(int index1=index+1; index1 < array.length; index1++){
                            maxProduct=Math.max(array[index]*array[index1],maxProduct);
                        }
           }
                    return  maxProduct;

    }

    public static int maxPdtWithLambdas(int[] array) {
         if(array.length>1)return IntStream.range(0, array.length).flatMap(index -> IntStream.range(index+1,array.length).map(index1 -> array[index] * array[index1])).max().orElse(MIN_VALUE);
         return 0;
    }



}
