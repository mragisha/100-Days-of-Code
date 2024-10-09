//Day 5 - Question 1 - Longest Consecutive Sequence
//https://neetcode.io/problems/longest-consecutive-sequence
/*Given an array of integers nums, return the length of the longest consecutive sequence of elements.
A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
You must write an algorithm that runs in O(n) time.*/

import java.util.*;
public class LongestConsecutiveSequence {
    private static int longestSequence(int[] nums){

        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num); // 2,20,4,10,3,5
        }
        int longest = 0;
        for(int num:numSet){
            int length = 1;
            while(numSet.contains(num+length)){
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
    public static  void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        System.out.println(longestSequence(nums));

        int[] nums2 = {0,3,2,5,4,6,1,1};
        System.out.println(longestSequence(nums2));


    }
}
