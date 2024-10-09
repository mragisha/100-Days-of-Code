//Day 6 - Question 3 - ThreeIntegerSum
//https://neetcode.io/problems/three-integer-sum
/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.
The output should not contain any duplicate triplets. You may return the output and the triplets in any order.*/

import java.util.*;
public class ThreeIntegerSum {
    private static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0)break;
            if(i>0 && nums[i]==nums[i-1])continue;

            int l=i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum>0){
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);

    }
}
