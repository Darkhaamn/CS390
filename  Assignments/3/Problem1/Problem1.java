package Problem1;

import java.util.Scanner;

public class Problem1 {
    void main() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Using recursion to find the minimum character in the given string input");
        System.out.println("---------------------------------------------------------------------------------");

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your word: ");
        System.out.println("The minimum character is: "+ findMinChar(inp.nextLine()));
    }

    public char findMinChar(String str) {
        if (str.length() == 1) {
            return str.charAt(0);
        }

        char minOfRest = findMinChar(str.substring(1));
        return (str.charAt(0) < minOfRest)
                ? str.charAt(0)
                : minOfRest;
    }
}