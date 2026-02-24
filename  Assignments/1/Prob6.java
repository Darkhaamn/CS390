import java.util.Objects;
import java.util.Scanner;

public class Prob6 {
    void main() {
        System.out.println("Welcome Electricity Bill Generator. ");
        Scanner inp = new Scanner(System.in);
        String again;

        do {
            String userType;
            int consumed;

            do {
                System.out.print("Please enter user type (R = Residential, C = Commercial, I = Industrial): ");
                userType = inp.nextLine().toUpperCase();

                if (!userType.equals("R") &&
                        !userType.equals("C") &&
                        !userType.equals("I")) {

                    System.out.println("YOU ENTERED WRONG VALUE. PLEASE ENTER AGAIN.");
                }

            } while (!userType.equals("R") &&
                    !userType.equals("C") &&
                    !userType.equals("I"));

            while (true) {

                System.out.print("Enter units consumed: ");

                if (inp.hasNextInt()) {
                    consumed = inp.nextInt();

                    if (consumed >= 0) {
                        break; // correct input
                    } else {
                        System.out.println("Units must be positive.");
                    }

                } else {
                    System.out.println("PLEASE ENTER A NUMBER.");
                    inp.next(); // clear wrong input
                }
            }
            switch (userType) {
                case "R" -> System.out.printf("Bill amount: $%.2f", consumed*0.12);
                case "C" -> System.out.printf("Bill amount: $%.2f", consumed*0.20);
                case "I" -> System.out.printf("Bill amount: $%.2f", consumed*0.35);
            }

            inp.nextLine(); // clear buffer

            // Ask again
            System.out.print("\nDo you want to calculate another bill? (y/n): ");
            again = inp.nextLine().toLowerCase();

        } while (again.equals("y"));

        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
        inp.close();
    }
}
