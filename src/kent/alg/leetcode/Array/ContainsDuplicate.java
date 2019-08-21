package kent.alg.leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1])
				return true;
		}
		
		return false;
	}
	
	public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet();
        
        for(int i=0; i<len; i++) {
            set.add(nums[i]);
        }
        
        if(set.size() != len)
            return true;
        else 
            return false;
    }

	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.containsDuplicate2(nums));

	}

}
