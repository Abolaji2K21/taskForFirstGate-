package fireDrillTwo;

import java.util.Scanner;

    public class TaskTwo {
        private static Scanner input = new Scanner(System.in);
        private static int userInput;
        private static int result;

        private static double average;


        public static void main(String[] args) {
            System.out.println("Kindly Enter Any Number Of Your Choice : ");

            for(int index =1 ; index < 11; index++){
                System.out.print("Kindly Enter Number # " + index + " : ");
                userInput = input.nextInt();
                result += userInput;
                average = result / 10.0;
            }

            System.out.print("the Average of all user input = " + average );

        }

    }

