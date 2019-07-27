package kent.alg.recursive;

public class Factorial {
	
	public int factorial(int accumulator, int n) {
		
		// 4! = 4*3*2*1
		// n! = n *(n-1)*(n-2)...
		
		if(n==1) return accumulator;
		
		return factorial( accumulator*n , n-1);
		
	}
	
	public int calculateFactorial(int n) {
		return factorial(1, n);
	}
}
