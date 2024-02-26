package fireDrillTwo;

import java.util.Arrays;
import java.util.Scanner;

public class FireDrillThree {
    private int[] scoreBoard = new int[10];

    public int[] getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(int[] scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public int[] evenIndex(int[] number) {
        int[] result = new int[number.length / 2];
        for (int check  = 0; check < result.length; check++) {
            result[check] = number[2 * check];
        }

        return result;
    }


    public int[] oddIndex(int[] number){
        int[] result = new int[5];
        for(int check = 0 ; check < result.length;check++){
            result[check] = number[2 * check + 1];

        }
        return result;

    }

    public int[] sumOfEvenIndex(int[] number){
        int[] result = new int[1];

        for(int check = 0; check < number.length / 2; check++){
            result[0] += number[2 * check];
        }

        return result;
    }

    public int[] sumOfOddEvenIndex(int[] number){
        int[] result = new int[1];

        for (int check = 0; check < number.length / 2; check++ ){
            result[0] += number[2 * check + 1];

        }
        return result;
    }

    public int[] getMaximumNumber(int[] number){
        int[] result = new int[1];
        result[0] = number[0];
        for (int check : number) {
            if (check > result[0]) {
                result[0] = check ;
            }

        }
        return result;

    }

    public int[] getMinimumNumber(int[] number){
        int[] result = new int[1];
            result[0] = number[0];
        for (int check : number) {
            if (check < result[0])
                result[0] = check;

        }
         return result;
    }

    public String printOnAStraightLine(int[] number){
        StringBuilder result = new StringBuilder(" ");

        for (int i : number) {
            result.append(i).append(" ");

        }

        return result.toString();

    }

    public String printOnZigZagLine(int[] number){
        StringBuilder result = new StringBuilder();

        for (int i : number) {
            result.append(i).append("\n");

        }
        return result.toString();
    }





}
