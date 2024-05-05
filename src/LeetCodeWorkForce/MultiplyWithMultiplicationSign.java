package LeetCodeWorkForce;

public class MultiplyWithMultiplicationSign {

    public static int myMethod(int a, int b){
        int result = 0;
        for(int count = 0 ; count < b; count++  ){
            result += a;
        }
        return result;
    }

    public static int myMethodAgain(int a, int b){
        return Math.multiplyExact(a,b);
    }

}
