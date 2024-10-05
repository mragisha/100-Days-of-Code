// Day 1 of 100 - question 2
//https://neetcode.io/problems/is-anagram
// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

import java.util.*;
public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        char toChars[] = s.toCharArray();
        char toChart[] = t.toCharArray();
        Arrays.sort(toChars);
        Arrays.sort(toChart);
        System.out.println(toChars);
        System.out.println(toChart);

        boolean areEqual = Arrays.equals(toChars, toChart);
        return areEqual;
    }
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        System.out.println(isAnagram(s, t));
    }
}
