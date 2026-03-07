import java.util.*;

class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Application Entry & Welcome Message
        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER       ");
        System.out.println("=================================");
        System.out.println("Application Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker App!");
        System.out.println();

        // UC2: Hardcoded Palindrome Check (two pointer method)
        String input = "madam";
        int n = input.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2 Result:");
        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);
        System.out.println();

        // UC3: Palindrome check using reverse string
        String rev = "";

        for (int i = n - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }

        System.out.println("UC3 Result:");

        if (rev.equals(input)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

    }
}