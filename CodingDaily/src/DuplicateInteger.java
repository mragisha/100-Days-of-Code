// Day 1 of 100 - question 1
// https://neetcode.io/problems/duplicate-integer
//Given an integer array nums, return true if any value
// appears more than once in the array, otherwise return false.

import java.util.*;

public class DuplicateInteger {
    public boolean isDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        boolean ans = true;
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], hashmap.get(nums[i])+1);
                return true;

            }
            else{
                hashmap.put(nums[i],1);

            }
        }
        System.out.println(hashmap);
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2, 3,3};
        System.out.println(new DuplicateInteger().isDuplicate(nums));
        int[] nums2 = new int[] {1,2,3,4,5};
        System.out.println(new DuplicateInteger().isDuplicate(nums2));
    }
}
