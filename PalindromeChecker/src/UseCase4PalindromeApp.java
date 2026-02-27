import java.util.*;
public class UseCase4PalindromeApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0 , end = chars.length - 1;
        Boolean isPalindrome = true;
        while(start < end){
            if(chars[start++]!=chars[end--]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: "+input);
        System.out.println("Is it a palindrome? : "+isPalindrome);
    }
}
