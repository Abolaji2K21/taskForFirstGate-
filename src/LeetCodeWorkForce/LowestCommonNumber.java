package LeetCodeWorkForce;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LowestCommonNumber {

    public static int Lcm(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int count = 2; count <= 9; count++) {
            boolean isDivisor = true;
            for (int check : array) {
                if (check % count != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                return count;
            }
        }
        return -1;
    }

   public  static int maximumProduct(int[] array){
        if (array == null || array.length == 0 ){
            return -1;
        } else  {
            Arrays.sort(array) ;
            return array[array.length -1] * array[array.length -2] ;
        }
   }

   public static int maximumProductUsingForLoop(int[] array) {
       int maximumPdt = array[0];

       if (array.length == 1 || array.length == 0) {
           return 0;
       } else if (array.length > 2){
           for (int count = 0; count < array.length - 1; count++) {
               for (int check = count + 1; check < array.length; check++) {
                   if (array[count] * array[check] >= maximumPdt) {
                       maximumPdt = array[count] * array[check];
                   }
               }
           }
       } else if (array.length == 2){
           return  array[0] * array[1];

       }
       return maximumPdt;

   }
}






