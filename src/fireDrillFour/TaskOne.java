package fireDrillFour;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static int userInput;

    public static void main(String[] args) {
        collectingAndValidateInput();
        printAsterisks();

    }













    public static void collectingAndValidateInput() {
        while (true) {
            System.out.println("Kindly Enter Any Number Ranging From 1 - 15");
            userInput = input.nextInt();
            if (userInput == 22) {
                System.out.println("Thanks For Playing !!!");
                break;
            } else if (userInput >= 1 && userInput <= 15) {
                numbers.add(userInput);
            } else {
                System.out.println("Number Out Of Range ");
            }


        }


    }

    public static void printAsterisks() {
        for (int num2 : numbers) {
            for (int num = 0; num < num2; num++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}