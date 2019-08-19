package kent.alg.leetcode.Array;
/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

#Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

#Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class PlusOne {
	
	public int[] plusOne(int[] digits) {
    	int one = 1;
    	int sum = 0;
    	
    	
    	for(int i=digits.length - 1 ; i >= 0; i--) {
    		sum = digits[i] + one;
    		one = sum / 10;
    		digits[i] = sum % 10;
    	}
    	
    	if(one ==  0)
    		return  digits;
    	else {
    		int[] result = new int[digits.length + 1];
    		result[0] = 1;
    		return result;
    	}
    	
    }

	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int[] d2 = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		//int[] digits = {9,9,9};
		
		System.out.println(po.plusOne(d2));

	}

}
