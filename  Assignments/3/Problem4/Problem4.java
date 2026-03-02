package Problem4;

import java.util.Arrays;

public class Problem4 {
    void main() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Write a recursive solution to return max value from the given array.");
        System.out.println("---------------------------------------------------------------------------------");

        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println("Given Array: " + Arrays.toString(arr));

        try {
            int max = findMax(arr, 0);
            System.out.println("Max = " + max);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMax(int[] arr, int index) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid index.");
        }

        if (index == arr.length - 1)
            return arr[index];

        int maxOfRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }
}
