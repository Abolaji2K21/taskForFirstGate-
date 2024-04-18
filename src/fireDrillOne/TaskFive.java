package fireDrillOne;

public class TaskFive {
    public static void main(String... args){
        for(int check = 1; check < 11; check++){
                if (check % 4 == 0)
                    for(int count = 0 ; count < 5; count++) {
                        System.out.println("Number # " + (check));
                    }
        }

    }

}
