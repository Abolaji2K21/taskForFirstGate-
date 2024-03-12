package SevenSegmentDisplay;

import Exceptions.InvalidInputException;
import Exceptions.InvalidLengthException;

import java.util.Scanner;

public class SevenSegmentApp {

    private static boolean isValidInput = false;
    private static final Scanner input = new Scanner(System.in);
    private static final SevenSegment sevenSegment = new SevenSegment();



    public static void main(String[] args) {

        while (!isValidInput) {
            System.out.print("ENTER BINARY NUMBERS ZEROS AND ONES WITH A VALID LENGTH OF 8:");
            String userInput = input.nextLine();

            try {
                String display = sevenSegment.displaySevenSegment(userInput);
                if (!display.isEmpty()) {
                    System.out.println(display);
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. The last input must be 1 for a valid display.");
                }
            } catch (InvalidInputException e) {
                System.out.println("Invalid input. Please enter only binary numbers (0 and 1).");
            } catch (InvalidLengthException e) {
                System.out.println("Invalid length. Please enter a binary number of length 8.");
            }
        }
    }
}
