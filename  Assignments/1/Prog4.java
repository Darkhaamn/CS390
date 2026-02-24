import java.util.Scanner;

public class Prog4 {
    void main() {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the N terms of the series: ");
        int limit = inp.nextInt();
        double sum = 1;
        for (int i = 1; i<limit; i++) {
            int number = i*2 +1;

            if (i%2 == 0) {
                sum = sum + (double)1/number;
            } else {
                sum = sum-((double) 1 /number);
            }
        }

        System.out.println(sum);
        System.out.printf("Output sum = %.3f", sum);
    }
}
