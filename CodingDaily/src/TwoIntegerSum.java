// Day 2 of 100 - question 1
import java.util.*;
public class TwoIntegerSum {

    public static int[] targetSumFunction(int[] nums, int target){
        HashMap<Integer,Integer> prevMap = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int dif = target-num;
            if(prevMap.containsKey(dif)){
                ans[0] = prevMap.get(dif);
                ans[1] = i;
                return ans;
            }
            prevMap.put(num,i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums= {3,6,3};
        int target = 6;
        int[] ans = targetSumFunction(nums,target);
        if (ans.length == 2) {
            System.out.println("Indices: [" + ans[0] + ", " + ans[1] + "]");
        } else {
            System.out.println("No solution found.");
        }

    }
}