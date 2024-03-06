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
        if (leftSwitch  && rightSwitch) {
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

    private void isValidInput(String input) {
        for (int check = 0; check < input.length(); check++) {
            if (input.charAt(check) != '0' && input.charAt(check) != '1') {
                throw new InvalidInputException("Invalid Input, Enter The Right Binary ");
            }
        }
    }

    private void  isValidLength(String input) {
        if (input.length() != 8) {
            throw new InvalidLengthException("The length of your input should be exactly eight");
        }
    }

//    private boolean validLastCharacter(char lastCharacter) {
//        return lastCharacter== '1';
////    }

    private  boolean[] convertStringInput(String input){
        isValidInput(input);
        isValidLength(input);
            for(int count = 0; count<input.length();count++) if(input.charAt(count) == 1) this.segments[count] = true;
        return segments;

    }
    public String displaySevenSegment(boolean[] array){
        String sevenSegment = "";
        if(array[7] ) {
            sevenSegment = returnHorizontalSegments(array[0]);
            sevenSegment += "\n" + returnVerticalSegments(array[5], array[1]);
            sevenSegment += "\n" + returnHorizontalSegments(array[6]);
            sevenSegment += "\n" + returnVerticalSegments(array[4], array[2]);
            sevenSegment += "\n" + (array[3]);
        }
        return sevenSegment;
    }

    public static void main(String[] args) {
        SevenSegment segment = new SevenSegment();
        String mySegment = "11111111";
        boolean[] array = segment.convertStringInput(mySegment);
        System.out.println(segment.displaySevenSegment(array));
    }

}
