import java.util.Random;

public class QuickEmiQuote {
    void main() {
        System.out.println("------------------------------------------");
        System.out.println("Problem 1");
        System.out.println("------------------------------------------");

        Random r = new Random();
        int P = r.nextInt(5_000, 25_000);
        int n = r.nextInt(6, 36);
        double apr = r.nextDouble(3.5, 11.5);

        double monthRate = apr / 12 / 100;

        double pow = Math.pow(1 + monthRate, n);
        double emi = (P * monthRate * pow) / (pow - 1);

        int intEMI = (int) emi;
        int roundedEmi = (int)Math.round(emi);

        System.out.printf("Principal: %d", P);
        System.out.printf("\nTenure: %d", n);
        System.out.printf("\nAnnual interest rate: %.2f", apr);

        System.out.printf("\nMonthly Rate: %.2f", monthRate);
        System.out.printf("\nEMI: %.2f", emi);
        System.out.printf("\nInt EMI: %d", intEMI);
        System.out.printf("\nInt Rounded EMI: %d", roundedEmi);
    }
}
