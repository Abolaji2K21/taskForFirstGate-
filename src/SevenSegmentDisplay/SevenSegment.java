package SevenSegmentDisplay;

import Exceptions.InvalidInputException;
import Exceptions.InvalidLengthException;

public class SevenSegment {

    private boolean isOn = false;
    private boolean[] segments;

    public SevenSegment() {
        segments = new boolean[8];
    }

    public void toggleDisplay() {
        isOn = !isOn;
    }

    public String drawHorizontalLine() {
        return "# # # #";
    }

    public String drawVerticalLineOnTheLeft() {
        return """
               #
               #
               #
               """;
    }

    public String drawVerticalLineOnTheRight() {
        return """
                       #
                       #
                       #
               """;
    }

    public String drawVerticalLineOnBothSides() {
        return """
               #        #
               #        #
               #        #
               """;
    }

    public String returnVerticalSegments(boolean leftSwitch, boolean rightSwitch) {
        if (leftSwitch && rightSwitch) {
            return drawVerticalLineOnBothSides();
        } else if (!leftSwitch && rightSwitch) {
            return drawVerticalLineOnTheRight();
        } else {
            return drawVerticalLineOnTheLeft();
        }
    }

    public String returnHorizontalSegments(boolean topSwitch) {
        if (topSwitch) {
            return drawHorizontalLine();
        } else {
            return "";
        }
    }

    private void validateInput(String input) {
        for (int check = 0; check < input.length(); check++) {
            if (input.charAt(check) != '0' && input.charAt(check) != '1') {
                throw new InvalidInputException("Invalid Input: Only 0s and 1s are allowed.");
            }
        }
    }

    private void validateLength(String input) {
        if (input.length() != 8) {
            throw new InvalidLengthException("The length of your input should be exactly eight");
        }
    }

    private boolean[] convertStringInput(String input) {
        validateInput(input);
        validateLength(input);

        for (int count = 0; count < input.length(); count++) {
            segments[count] = input.charAt(count) == '1';
        }

        return segments;
    }

    public String displaySevenSegment(String input) {
        boolean[] array = convertStringInput(input);

        StringBuilder display = new StringBuilder();

        if (array[7]) {
            display.append(returnHorizontalSegments(array[0]))
                    .append("\n")
                    .append(returnVerticalSegments(array[5], array[1]))
                    .append("\n")
                    .append(returnHorizontalSegments(array[6]))
                    .append("\n")
                    .append(returnVerticalSegments(array[4], array[2]))
                    .append("\n")
                    .append(array[3]);
        }

        return display.toString();
    }

    public static void main(String[] args) {
        SevenSegment segment = new SevenSegment();

        String mySegment = "11111111";

        System.out.println(segment.displaySevenSegment(mySegment));
    }
}