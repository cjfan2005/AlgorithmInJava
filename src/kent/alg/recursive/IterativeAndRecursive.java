package kent.alg.recursive;

public class IterativeAndRecursive {
	
	// Iterative
	public int sumIterative(int n) {
		int result = 0;
		
		for(int i=1; i<=n; i++) 
			result += i;
		
		return result;
	}
	
	// Recursive
	public int sumRecursive(int n) {
		
		if(n == 1) return 1;
		return n + sumRecursive(n - 1);
	}

}
