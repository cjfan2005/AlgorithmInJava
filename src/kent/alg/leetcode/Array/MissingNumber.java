package kent.alg.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public int missingNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
