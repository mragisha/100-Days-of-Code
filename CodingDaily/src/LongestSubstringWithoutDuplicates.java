//Day 8 -Question 1 - SLiding Window - Wednesday
//https://neetcode.io/problems/longest-substring-without-duplicates
/*Given a string s, find the length of the longest substring without duplicate characters.
A substring is a contiguous sequence of characters within a string.
Example 1:
Input: s = "zxyzxyz"
Output: 3*/
import java.util.*;
public class LongestSubstringWithoutDuplicates {
    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for(int i=0;i<256;i++){
            hash[i]=-1;
        }
        int n =s.length();
        int l=0,r=0,maxLength=0;
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            //char not in hash
            int length = r-l+1;
            maxLength = Math.max(maxLength,length);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
