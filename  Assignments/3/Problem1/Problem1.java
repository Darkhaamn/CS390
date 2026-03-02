package Problem1;

import java.util.Scanner;

public class Problem1 {
    void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Using recursion to find the minimum character in the given string input");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your word: ");

        String input = inp.nextLine();

        Problem1 p = new Problem1();

        try {
            char result = p.findMinChar(input);
            System.out.println("The minimum character is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public char findMinChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        if (str.length() == 1) {
            return str.charAt(0);
        }

        char minOfRest = findMinChar(str.substring(1));

        return (str.charAt(0) < minOfRest)
                ? str.charAt(0)
                : minOfRest;
    }
}