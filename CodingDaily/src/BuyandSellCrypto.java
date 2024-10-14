//Day 7 - question 2
//https://neetcode.io/problems/buy-and-sell-crypto
/*You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.
You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.
Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.*/

import java.util.*;
public class BuyandSellCrypto {
    public static int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;

        int profit = 0;

        while(sellIndex<prices.length){
            if(prices[buyIndex]<prices[sellIndex]){
                profit = Math.max(profit, prices[sellIndex]-prices[buyIndex]);
            }
            else{
                buyIndex=sellIndex;
            }
            sellIndex++;
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices1 = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {10,8,7,5,2};
        System.out.println(maxProfit(prices2));
    }
}
