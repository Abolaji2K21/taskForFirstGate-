package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    private static Scanner input = new Scanner(System.in);
    private static int userInput;
    private static int result;


    public static void main(String[] args) {
        System.out.println("Kindly Enter Any Number Of Your Choice : ");

        for(int index =1 ; index < 11; index++){
            System.out.print("Kindly Enter Number # " + index + " : ");
            userInput = input.nextInt();
            if (userInput % 2 == 0)
                result += userInput;
        }

        System.out.print("the sum of all user input = " + result );

    }

}
