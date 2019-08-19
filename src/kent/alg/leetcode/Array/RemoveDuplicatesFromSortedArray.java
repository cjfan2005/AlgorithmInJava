package kent.alg.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/*
 Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 
Ex1:
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
  
Ex2:
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.
  
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates_2(int[] nums) {
		
		int i=0;
		for(int j=1; j<nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		System.out.println(nums);
		return i + 1;
	}
	
	
	public int removeDuplicates(int[] nums) {
		Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            s.add(nums[i]);
            
        }
        return s.size();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArray da = new RemoveDuplicatesFromSortedArray();
		int[] nums = {0,0,1,1,1,2,2,3,3,4,5,5,6,7,8,8,8,8,9,9,10,10,10,10,10,99};
		System.out.println(da.removeDuplicates(nums));
		System.out.println(da.removeDuplicates_2(nums));
	}

}
