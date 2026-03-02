package Problem2;

import java.util.Arrays;

public class ProblemReverse {
    void main() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Reverse ");
        System.out.println("---------------------------------------------------------------------------------");

        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + Arrays.toString(arr));

        try {
            reverse(arr, 0, arr.length - 1);
            System.out.println("After Reverse: " + Arrays.toString(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        if (left < 0 || right >= arr.length) {
            throw new IllegalArgumentException("Invalid index range.");
        }

        if (left >= right)
            return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }
}
