package kent.alg.leetcode.dp;
/**
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum and return its sum.

Example:
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:
  If you have figured out the O(n) solution, 
  try coding another solution using the divide and conquer approach, which is more subtle.

 
 */

// Dynamic Programming
public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		if(nums.length == 0) return 0;
		
		int[] dp = new int[nums.length];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			dp[i] = nums[i];
			
			if(i>0 && dp[i-1]>0)
				dp[i] = dp[i] + dp[i-1];
						
			max = Math.max(max, dp[i]);
		
		}
		return max;
	}
	

}
