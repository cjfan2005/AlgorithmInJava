package kent.alg.leetcode.Array;

/**
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 */

public class RotateArray {
		
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        int[] newArr = new int[len];
        
        for(int i=0; i<len; i++) {
            int newPosition = (i+k)%len;
            
            newArr[newPosition] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr[i];
        }
        
        //proof it
        for(int i=0; i<newArr.length; i++) {
        	
        	System.out.println("i=" + i + " val=" + newArr[i]);
        	
        }
    }
	
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		
		int k = 3;
		int[] nums = {1,2,3,4,5,6,7};
		ra.rotate(nums, k);
	}

}
