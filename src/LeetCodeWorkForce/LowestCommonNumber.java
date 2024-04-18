package LeetCodeWorkForce;

public class LowestCommonNumber {

    public static int Lcm(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int count = 2; count <= 9; count++) {
            boolean isDivisor = true;
            for (int check : array) {
                if (check % count != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                return count;
            }
        }
        return -1;
    }

}






