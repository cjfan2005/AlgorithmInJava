package kent.alg.recursive;

/**
 * time complexity : O(log(n))
 * 
 * @author kentfan
 *
 */
public class BinarySearch {
	
	public int binarySearch(int[] array, int startIndex, int endIndex, int item) {
		 
		if(endIndex < startIndex) {
			System.out.println("The item is not present in the array.");
			return -1;
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		if(item == array[middleIndex])
			return middleIndex;
		
		else if(item < array[middleIndex])
			return binarySearch(array, startIndex, middleIndex-1, item);
		
		else
			return binarySearch(array, middleIndex+1, endIndex, item);
		
		
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        
        System.out.println(bs.binarySearch(arr, 0, n-1, x));
		
	}

}
