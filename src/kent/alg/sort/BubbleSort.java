package kent.alg.sort;

public class BubbleSort {
	
	void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			
			for(int j = 0; j < n-i-1; j++) {
				System.out.println("j = " + j + ", arr[j] = " + arr[j]);
				if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort(); 
        int arr[] = {46, 43, 52, 21, 33, 02, 9}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 

	}
	
	/* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
