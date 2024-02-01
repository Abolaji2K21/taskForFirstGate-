package fireDrillOne;

public class TaskEight {



    public static void main(String... args) {
        int counter = 0 ;
        for (int check = 1; check < 11; check++) {
            if (check % 4 == 0) {
                for (int count = 1;count <= 5; count++) {
                    counter += (int)Math.pow(check, count);
                }

            }

        }
        System.out.println("Number # " +  counter);


    }

}