package kent.alg.leetcode;

import java.util.HashMap;

/**
   Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   EX: 
    Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
	Time: O(n)
	Space: O(n)
 * @author kentfan
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		
		// error handling
		if(nums == null || nums.length < 2)
			return new int[] {-1,-1};
		
		int[] result = new int[] {-1, -1};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i< nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
			}
			map.put(nums[i], i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
