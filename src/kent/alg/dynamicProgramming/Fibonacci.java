package kent.alg.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	private Map<Integer, Integer> memorizetTable;
	 
	public Fibonacci() {
		this.memorizetTable = new HashMap<>();
		memorizetTable.put(0, 0);
		memorizetTable.put(1, 1);
		
	}
	
	// O(n)
	public int fibonacciDP(int n) {
		
		// O(1)
		if(memorizetTable.containsKey(n))
			return memorizetTable.get(n);
		
		memorizetTable.put(n-1, fibonacciDP(n-1));
		memorizetTable.put(n-2, fibonacciDP(n-2));
		
		int resultNumner = memorizetTable.get(n-1) + memorizetTable.get(n-2);
		memorizetTable.put(n, resultNumner);
		
		return resultNumner;
	}
	
	// this has exponential running time.
	public int naiveFiboncci(int n) {
		if(n == 0) return 0;
		else if (n == 1) return 1;
		
		else return naiveFiboncci(n-1) + naiveFiboncci(n-2);
	}
	
	

	public static void main(String[] args) {
		int parameter = 8;
		
		Fibonacci f = new Fibonacci();
		System.out.println("naiveFiboncci: " + f.naiveFiboncci(parameter));
		System.out.println("FiboncciDP: " + f.fibonacciDP(parameter));

	}

}
