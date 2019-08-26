package kent.alg.search;


/*
 * Time Complexity: 
 * 
 * (1+2+3+...+n)/n = (n+1)/2  ->  Ο(n)
 */
public class LinearSearch {

	int[] array;
	
	public LinearSearch(int[] array) {
		this.array = array;
	}
	
	public int linearSerch(int item) {
		for(int i=0; i<array.length; i++) 
			if(array[i] == item)
				return i;
		
		return -1;
	}
}
