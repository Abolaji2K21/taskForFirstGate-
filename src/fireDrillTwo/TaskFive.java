package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    private static Scanner input = new Scanner(System.in);
    private static int userInput;
    private static int result;


    public static void main(String[] args) {
        System.out.println("Kindly Enter Any Number Of Your Choice : ");
        for(int index =0 ; index < 10; index++){
            System.out.print("Kindly Enter Number # " + index + " : ");
            userInput = input.nextInt();
            if (userInput % 2 == 0)
                result += index;
        }

        System.out.print("the sum of all user input = " + result );

    }


}
