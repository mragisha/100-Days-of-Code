//Day 8 - Question 2 - Wednesday
//https://leetcode.com/problems/max-consecutive-ones-iii/description/
/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Sliding Window + two pointer */

import java.util.*;
public class maxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k){
        int l=0,r=0,zeroes=0,maxlength=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            int len = r-l+1;
            maxlength=Math.max(maxlength,len);
            r++;
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k =3;
        System.out.println(longestOnes(nums,k));
    }
}
