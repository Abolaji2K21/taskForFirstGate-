package fireDrillOne;

public class TaskSeven {
    private static double check;
    private static double count;
    private static double result;


    public static void main(String... args) {
        for (check = 1; check < 11; check++) {
            int counter = 0 ;
            if (check % 4 == 0) {
                for (count = 1; count <= 5; count++) {
                    counter += (int)Math.pow(check, count);
                }
                System.out.println("Number # " +  counter);

            }


        }
    }
}