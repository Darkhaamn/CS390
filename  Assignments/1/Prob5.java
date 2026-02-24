import java.util.Arrays;

public class Prob5 {
    void main() {
        // Problem-5 – Finding Second Minimum
        int[] numbers = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(numbers);
    }

    public static void secondMin(int[] arrayOfInts) {
        int minNumber = Integer.MAX_VALUE;
        for (int arrayOfInt : arrayOfInts) {
            if (arrayOfInt < minNumber) {
                minNumber = arrayOfInt;
            }
        }

        int secondMin = Integer.MAX_VALUE;
        for (int arrayOfInt : arrayOfInts) {
            if (arrayOfInt < secondMin && arrayOfInt > minNumber) {
                secondMin = arrayOfInt;
            }
        }

        System.out.println(secondMin);
    }
}
