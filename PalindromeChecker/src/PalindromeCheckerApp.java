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

        // UC6: Queue + Stack Based Palindrome Check
        String input4 = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input4.toCharArray()) {
            queue.add(c);     // enqueue
            stack2.push(c);   // push
        }

        boolean isPalindromeQueueStack = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack2.pop())) {
                isPalindromeQueueStack = false;
                break;
            }
        }

        System.out.println("UC6 Result:");
        System.out.println("Input text: " + input4);
        System.out.println("Is it a palindrome? : " + isPalindromeQueueStack);

        // UC7: Deque Based Optimized Palindrome Check
        String input5 = "racecar";

        Deque<Character> deque = new LinkedList<>();

        for (char c : input5.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindromeDeque = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindromeDeque = false;
                break;
            }
        }

        System.out.println("UC7 Result:");
        System.out.println("Input text: " + input5);
        System.out.println("Is it a palindrome? : " + isPalindromeDeque);


        // UC8: Linked List Based Palindrome Check
        String input6 = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input6.toCharArray()) {
            list.add(c);
        }

        boolean isPalindromeLinkedList = true;

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                isPalindromeLinkedList = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("UC8 Result:");
        System.out.println("Input text: " + input6);
        System.out.println("Is it a palindrome? : " + isPalindromeLinkedList);

        
    }
}