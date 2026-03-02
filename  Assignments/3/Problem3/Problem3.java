package Problem3;

public class Problem3 {
    void main() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Palindrome");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.printf("Is %d palindrome number: %s", 121, isPalindrome(121));
        System.out.printf("\nIs %d palindrome number: %s", 102, isPalindrome(102));
        System.out.printf("\nIs %d palindrome number: %s", 55, isPalindrome(55));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        if (num >= 0 && num < 10) {
            return true;
        }

        int reversed = reverseRecursive(num, 0);
        return num == reversed;
    }

    private static int reverseRecursive(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        reversed = reversed * 10 + (num % 10);
        return reverseRecursive(num / 10, reversed);
    }
}
