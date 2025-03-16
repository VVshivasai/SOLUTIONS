

import java.util.Scanner;

/*
 * 4.Construct a Java program that checks if a given string is a palindrome (reads
    the same forwards and backwards). Prompt the user to input a string and display
    whether it's a palindrome or not.
 */
public class Que_4 {

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println (s+" is Palindrome");
        }else{
            System.out.println(s +" Not a palindrome");
        }
        sc.close();
    }
}
