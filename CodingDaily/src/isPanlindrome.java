//Day 5 - Question 2 - isPalindrome
//https://neetcode.io/problems/is-palindrome
/*Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward.
It is also case-insensitive and ignores all non-alphanumeric characters.*/

import java.util.*;
public class isPanlindrome {
    private static boolean isPanlindrome(String str) {
        String s = "";
        String rs="";
        int l = str.length();
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                s+=str.charAt(i);
            }
            if(Character.isLetterOrDigit((str.charAt(l-i-1)))){
                rs+=str.charAt(l-i-1);
            }
        }
        return s.equalsIgnoreCase(rs);

    }
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPanlindrome(s));

    }
}
