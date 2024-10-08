/*Day 4 - question 1*/
/*https://neetcode.io/problems/products-of-array-discluding-self*/
/*Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
Each product is guaranteed to fit in a 32-bit integer.
Follow-up: Could you solve it in O(n) time without using the division operation?*/
/*Take-away - make prefix product and suffix product arrays. This code is the optimised version of that */

import java.util.*;
public class ProductsofArrayDiscludingSelf {
    public static int[] products(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];

        }
        int post = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * post;
            post *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        System.out.println(Arrays.toString(products(arr)));
        int[] arr2 = {-1,0,1,2,3};
        System.out.println(Arrays.toString(products(arr2)));
    }
}
