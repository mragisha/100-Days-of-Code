//Day 8 - Question 3 - Wednesday
//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1
/*You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array of arr[], where arr[i]  is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow :

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of the baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array of fruits, return the maximum number of fruits you can pick.*/
/*Input: arr[] = [3, 1, 2, 2, 2, 2]
Output: 5
Explanation: It's optimal to pick from the last 5 trees. Please note that we do not pick the first basket as we would have to stop at thrid tree which would result in only 2 fruits collected.
*/
import java.util.*;
public class FruitBaskets {

    public static int totalFruits(int[] arr) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0,r=0,ans=0;
        while(r<arr.length){
            mp.put(arr[r], mp.getOrDefault(arr[r], 0) + 1);
            if(mp.size()>2){
                while(mp.size()>2){
                    mp.put(arr[l],mp.get(arr[l])-1);
                    if(mp.get(arr[l])==0){mp.remove(arr[l]);}
                    l++;

                }
            }
            if(mp.size()<=2){
                ans=Math.max(ans,r-l+1);
            }r++;
        }return ans;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,2};
        System.out.println(totalFruits(arr));


    }
}
