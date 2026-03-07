import java.util.*;

class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER       ");
        System.out.println("=================================");
        System.out.println("Application Version: 1.0");
        System.out.println();

        // UC2: Hardcoded palindrome (two-pointer)
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

        // UC3: Reverse string method
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
        System.out.println();

        // UC4: Character Array Based Palindrome Check
        String input2 = "radar";
        char[] chars = input2.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindromeArray = true;

        while (start < end) {
            if (chars[start++] != chars[end--]) {
                isPalindromeArray = false;
                break;
            }
        }

        System.out.println("UC4 Result:");
        System.out.println("Input text: " + input2);
        System.out.println("Is it a palindrome? : " + isPalindromeArray);
        System.out.println();

        // UC5: Stack Based Palindrome Check
        String input3 = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input3.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindromeStack = true;

        for (char c : input3.toCharArray()) {
            if (c != stack.pop()) {
                isPalindromeStack = false;
                break;
            }
        }

        System.out.println("UC5 Result:");
        System.out.println("Input text: " + input3);
        System.out.println("Is it a palindrome? : " + isPalindromeStack);
    }
}