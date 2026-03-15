package prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();
                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50.");
                }
                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number only.");
                sc.nextLine(); // clear wrong input
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid quantity: " + e.getMessage());
            }
        }

        System.out.println("Successfully added " + quantity + " items to your cart!");
        sc.close();
    }
}