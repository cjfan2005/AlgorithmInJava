package kent.alg.recursive;

import java.util.Random;

public class QuickSelect {
	
	private int[] nums;
	
	public QuickSelect(int[] nums) {
		this.nums = nums;
	}

	public int select(int k) {
		return select(0, nums.length - 1, k-1);
	}
	
	
	private int select(int firstIndex, int lastIndex, int k) {
		int pivot = partition(firstIndex, lastIndex);
		
		if(pivot > k) 
		{
			select(firstIndex, pivot - 1, k);
		}
		else if(pivot < k)
		{
			select(pivot + 1, lastIndex, k);
		}
		
		return nums[k];
	}

	private int partition(int firstIndex, int lastIndex) {
		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
		
		swap(firstIndex, pivot);
		
		for(int i=firstIndex; i<lastIndex; i++) {
			if(nums[i] > nums[lastIndex]) {
				swap(i, firstIndex);
				firstIndex ++;
			}
			
		}
		
		swap(firstIndex, lastIndex);
		
		
		return firstIndex;
	}

	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	/**
	 * find the 2 largest number in array. O(n log n)
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {1,5,4,8,-2};
		QuickSelect q = new QuickSelect(nums);
		
		System.out.println( q.select(2));
	}
}
