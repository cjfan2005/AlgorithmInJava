package kent.alg.leetcode.dp;
/**
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum
amount of money you can rob tonight without alerting the police.
 * @author kentfan
DP:
  dp[i]: Max money after visiting house[i]
  
  dp[i] = max(dp[i-2] + money[i] , dp[i-1])
  
  Time: O(n)
  Space: O(n)

 */
public class HoseRobber {
	public int rob(int[] nums) {
		int n = nums.length;
		if(n == 0) return 0;
		
		// 放置目前房子最大利益(dp)
		int[] dp = new int[n];
		
		for(int i=0; i<n; i++) {
			dp[i] = Math.max(
					           nums[i] + (i>1 ? dp[i-2]:0), 
					           i>0 ? dp[i-1]:0
					         );
		}
		return dp[n-1];
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
