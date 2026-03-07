class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Application Entry & Welcome Message
        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER       ");
        System.out.println("=================================");
        System.out.println("Application Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker App!");
        System.out.println();

        // UC2: Hardcoded Palindrome Check
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

        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);

    }
}