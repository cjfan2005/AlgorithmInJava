package kent.alg.leetcode;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey( nums[i] )) {
            	int counter = map.get(nums[i]) + 1;
            	map.put(nums[i], counter);
            }
            else {
            	map.put(nums[i], 1);
            }
        }
        
        
        for(Object key : map.keySet()) {
        	int result = map.get(key);
        	if(result == 1)
        		return (int) key;
        }
        return -1;
        
    }
	
	@Test
	public void Test() {
		int[] nums = {4,1,1,0,0,2,1,2};
		System.out.println(singleNumber(nums));
	}

}
