package chapterThree;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMinMaxSum {
    public static int[] getMinMaxSum(int[] array) {
        return new int[]{
                Arrays.stream(array).sum(),
                Arrays.stream(array).sum() - Arrays.stream(array).max().getAsInt(),
                Arrays.stream(array).sum() - Arrays.stream(array).min().getAsInt()
        };
    }
}
