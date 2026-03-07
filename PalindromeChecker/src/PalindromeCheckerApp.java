import java.util.*;

class PalindromeCheckerApp {

    static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // UC11
        PalindromeService service = new PalindromeService();
        String input9 = "radar";

        System.out.println("UC11 Result:");
        System.out.println("Input text: " + input9);
        System.out.println("Is it a palindrome? : " + service.checkPalindrome(input9));

        // UC12: Strategy Pattern
        PalindromeStrategy strategy = new StackStrategy();

        System.out.println("UC12 Result:");
        System.out.println("Is 'level' palindrome? : " + strategy.check("level"));

        
    }
}

class PalindromeService {

    boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start++) != input.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }
}