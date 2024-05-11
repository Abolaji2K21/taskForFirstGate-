package LeetCodeWorkForce;

import java.util.HashMap;

public class mapAndCount {

    public static int OyaHelpMeCount(int number, int[] array){
        int counter = 0;
        for (int count : array) {
            if (count == number) {
                counter++;
            }

        }
        return counter;
    }

    public static HashMap<Integer, Integer> countNumbers(int[] array){

        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i : array) {
            result.put(i, OyaHelpMeCount(i, array));

        }
            return result;
    }
}
