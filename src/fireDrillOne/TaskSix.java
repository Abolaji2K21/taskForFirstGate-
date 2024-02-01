package fireDrillOne;

public class TaskSix {
    private static double check;
    private static double count;

    public static void main(String... args){
        for( check = 1; check < 11; check++)
            if (check % 4 == 0)
                for (count = 1; count <= 5; count++) {
                    double result = Math.pow(check, count);
                    System.out.println("Number # " + (int) result );

                }

    }
}
