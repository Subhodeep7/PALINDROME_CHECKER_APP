import java.util.*;
public class UseCase3PalindromeApp {
    public static void main(String[] args) {
        String input = "madam";
        int n = input.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=input.charAt(i);
        }
        if(rev.equals(input)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
