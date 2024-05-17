package Chapter17.BinaryFunction;

public class BinaryOperator {
     public static void main(String[] args) {
            java.util.function.BinaryOperator<Integer> binaryOperator = (x, y) ->{
                return x*y ;
            };
            int result = binaryOperator.apply(8,5);
            System.out.println(result);
        }
    }

