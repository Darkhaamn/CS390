package Problem4;

import java.util.Arrays;

public class Problem4 {
    void main() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Write a recursive solution to return max value from the given array.");
        System.out.println("---------------------------------------------------------------------------------");

        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println("Given Array: "+ Arrays.toString(arr));
        int max = findMax(arr, 0);
        System.out.println("Max = " + max);
    }

    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        int maxOfRest = findMax(arr, index + 1);

        // Return larger value
        return Math.max(arr[index], maxOfRest);
    }
}
