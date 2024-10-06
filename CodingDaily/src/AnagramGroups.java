// Day 2 of 100 - question 2
//https://neetcode.io/problems/anagram-groups
//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
import  java.util.*;
public class AnagramGroups {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> ans = groupAnagrams(strs);
        for(List<String> a: ans){
            System.out.println(a);
        }

    }
}
