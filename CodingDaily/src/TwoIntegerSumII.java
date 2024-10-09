//Day 6 - Question 1
//https://neetcode.io/problems/two-integer-sum-ii
/*Given an array of integers numbers that is sorted in non-decreasing order.
Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
There will always be exactly one valid solution.
Your solution must use - O(1) additional space.*/

import java.util.*;
public class TwoIntegerSumII {
    public static int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length-1;
        int[] arr = new int[2];
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                arr[0] = l+1;
                arr[1] = r+1;
                return arr;
            }
            else if (numbers[l]+numbers[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int target = 3;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));


    }
}
