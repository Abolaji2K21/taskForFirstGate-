package LeetCodeWorkForce;

import java.util.Arrays;

public class codeWarQuestion {

    public static int returnMinimumAbsValue(int[] array, int x, int y) {
        int minAbsDiff = Integer.MAX_VALUE;
        int minAbsValue = 0;

        for (int num : array) {
            int absDiffX = Math.abs(num - x);
            int absDiffY = Math.abs(num - y);
            int sumAbsDiff = absDiffX + absDiffY;

            if (sumAbsDiff < minAbsDiff) {
                minAbsDiff = sumAbsDiff;
                minAbsValue = num;
            } else if (sumAbsDiff == minAbsDiff && num < minAbsValue) {
                minAbsValue = num;
            }
        }

        return minAbsValue;
    }
}
