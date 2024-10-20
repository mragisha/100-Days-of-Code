//Day 9 - Question 1 - Thursday
// https://neetcode.io/problems/longest-repeating-substring-with-replacement
/*You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.
After performing at most k replacements, return the length of the longest substring which contains only one distinct character.
Example 1:
Input: s = "XYYX", k = 2
Output: 4
Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.
Example 2:
Input: s = "AAABABB", k = 1
Output: 5*/

import java.util.*;
public class LongestRepeatingSubstringwithReplacement {
    public static int characterReplacement(String s, int k) {
        int l=0,r=0,maxLen=0,maxFreq=0;
        int[] hash = new int[26];
        Arrays.fill(hash,0);
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxFreq>k){
                hash[s.charAt(l)-'A']--;
                maxFreq=0;
                for(int i=0;i<25;i++){
                    maxFreq = Math.max(maxFreq,hash[i]);
                }
                l++;
            }
            if((r-l+1)-maxFreq<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;

        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "AAABABB";
        int k =1;
        System.out.println(characterReplacement(s, k));
    }
}
