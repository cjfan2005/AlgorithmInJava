package kent.alg.dynamicProgramming;

public class Fibonacci {
	
	// this has exponential running time.
	public static int naiveFiboncci(int n) {
		if(n == 0) return 0;
		else if (n == 1) return 1;
		
		else return naiveFiboncci(n-1) + naiveFiboncci(n-2);
	}
	
	

	public static void main(String[] args) {
		System.out.println(naiveFiboncci(4));

	}

}
