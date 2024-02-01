package fireDrillTwo;

import java.util.Scanner;

public class TaskTen {
    private static Scanner input = new Scanner(System.in);
    private static int userInput;
    private static int result;

    private static int count = 0;

    private static double average;

    public static void main(String[] args) {
        System.out.println("Kindly Enter Any Number Of Your Choice : ");
        for(int index = 0 ; index < 10; index++){
            System.out.print("Kindly Enter Number # " + index + " : ");
            userInput = input.nextInt();
            if (userInput >= 0 && userInput <= 100) {
                result += userInput;
                count = count + 1;
            }
               average = (double) result / count ;


        }
        System.out.print("the Average of all Valid user input = " + average );

    }



}

