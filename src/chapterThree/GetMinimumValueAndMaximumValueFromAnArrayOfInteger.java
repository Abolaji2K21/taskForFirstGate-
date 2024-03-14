package chapterThree;

public class GetMinimumValueAndMaximumValueFromAnArrayOfInteger {

    private static int maximum;
    private static int minimum;

    public static int getMaximum() {
        return maximum;
    }
    public static int getMinimum() {
        return minimum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }



}