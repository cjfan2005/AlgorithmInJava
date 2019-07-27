package kent.alg.recursive;

/**
 * time complexity : O(log(n))
 * 
 * @author kentfan
 *
 */
public class BinarySearch {
	
	int[] array;
	
	public BinarySearch(int[] array) {
		this.array = array;
	}
	
	public int binarySearch(int item) {
		return binarySearch(0, array.length, item);
	}
	
	public int binarySearch(int startIndex, int endIndex, int item) {
		 
		if(endIndex < startIndex) {
			System.out.println("The item is not present in the array.");
			return -1;
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		if(item == array[middleIndex])
			return middleIndex;
		
		else if(item < array[middleIndex])
			return binarySearch(startIndex, middleIndex-1, item);
		
		else
			return binarySearch(middleIndex+1, endIndex, item);
		
		
	}

}
