package ChapterTwo;

public class ComparingIntegers {


    public static String checkNumber(int number){
        int finalNumber = 100;
        int squareOfNumber = number * number;

            if(number > finalNumber && squareOfNumber > finalNumber){
                return "The number is greater than 100 and its square is also greater than 100.";
        }   else if(number < finalNumber && squareOfNumber > finalNumber){
                return "The " + number + " number is less than 100, but its square is greater than 100.";
        }   else if(number == finalNumber && squareOfNumber > finalNumber) {
                return "The number is 100 and its square is greater than 100.";
            } else {
                return "None of the conditions are met.";

            }

    }
}
