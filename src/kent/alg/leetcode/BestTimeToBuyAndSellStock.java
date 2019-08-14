package kent.alg.leetcode;
/*
Say you have an array for which the i-th element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

 */

// Dynamic Programming
public class BestTimeToBuyAndSellStock {
	// Approach 1: Brute Force
	// time: O(n^2), space:O(1)
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for(int i=0; i<prices.length-1; i++) {
        	for(int j=i+1; j< prices.length; j++) {
        		int profit = prices[j] - prices[i];
        		if(profit > maxProfit)
        			maxProfit = profit;
        	}
        }
        return maxProfit;
    }
	
	// Time complexity : O(n)O(n)O(n). Only a single pass is needed.
	public int naxProfit_2(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i<prices.length; i++) {
			if(prices[i] < minPrice)
				minPrice = prices[i];
			else if(prices[i] - minPrice > maxProfit)
				maxProfit = prices[i] - minPrice;
		}
		return maxProfit;
	}
}
