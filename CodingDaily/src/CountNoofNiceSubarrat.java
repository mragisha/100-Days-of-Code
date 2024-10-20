//Day 9 - Question 1
import java.util.*;
class CountNoofNiceSubarrat {

    public static int numberOfSubarrays(int[] nums, int k) {
        int res = 0,odd=0,l=0,m=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0)odd++;
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                }
                l+=1;
                m=l;
            }
            if(odd==k){
                while(nums[m]%2==0){
                    m++;
                }
                res+=m-l+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k=2;
        System.out.println(numberOfSubarrays(arr, k));
    }
}