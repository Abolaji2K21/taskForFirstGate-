package LeetCodeWorkForce;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayPosition {
    public static int[] getPositionArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        Set<Integer> visited = new HashSet<>();

        int[] positions = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            if (visited.contains(element)) {
                throw new IllegalArgumentException("Duplicate element found: " + element);
            }

            visited.add(element);

            positions[i] = i + 1;
        }

        return positions;
    }
}

