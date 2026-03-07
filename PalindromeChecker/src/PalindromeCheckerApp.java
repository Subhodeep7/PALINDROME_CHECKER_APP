import java.util.*;
import java.lang.String;
class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        int n = input.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: "+input);
        System.out.println("Is it a palindrome? : "+isPalindrome);
    }
}