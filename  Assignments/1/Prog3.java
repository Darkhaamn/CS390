import java.util.Arrays;

public class Prog3 {
    void main() {
        String[] duplicatedArray = {"horse", "dog", "cat", "horse", "dog"};
//        String[] emptyArray = new String[0];

        int index = 0;

        for (int i = 0; i < duplicatedArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (duplicatedArray[i].equals(duplicatedArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                duplicatedArray[index++] = duplicatedArray[i];
            }
        }

        String[] emptyArray = Arrays.copyOf(duplicatedArray, index);

        System.out.println(Arrays.toString(emptyArray));
    }


}
