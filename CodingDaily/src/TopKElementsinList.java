// Day 3 of 100 - question 1
//https://neetcode.io/problems/top-k-elements-in-list
//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//The test cases are generated such that the answer is always unique.
//You may return the output in any order.
import java.util.*;
public class TopKElementsinList {

    public static int[] topkFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{7,1,7};
        int k = 2;
        int[] res = topkFrequent(nums, k);
        System.out.println(Arrays.toString(res));

    }
}
