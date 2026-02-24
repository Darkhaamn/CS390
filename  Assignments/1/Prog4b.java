import java.util.Scanner;

public class Prog4b {
    void main() {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the N terms of the series: ");
        int limit = inp.nextInt();
        double sum = 0;

        for (int i = 1; i<=limit; i++) {
            double number = (double)i/Math.pow(2, (double)i);

            if (i%2 == 0) {
                sum -= number;
            } else {
                sum += number;
            }
        }

        System.out.printf("Output sum = %.3f", sum);
    }
}
