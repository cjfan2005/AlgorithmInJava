package kent.alg.recursive;

import kent.alg.search.LinearSearch;

public class App {

	public static void main(String[] args) {
		
//		IterativeAndRecursive a = new IterativeAndRecursive();
//		System.out.println("Iterative result = " + a.sumIterative(3));
//		System.out.println("Recursive result = " + a.sumRecursive(5));
		
		
//		Euclidean e = new Euclidean();
//		System.out.println(e.gcdIteractive(12, 4));
//		System.out.println(e.gcdRecursive(12, 4));
		
		int[] array = {15,2,3,7,10,5,9,8,14,22};
		LinearSearch ls = new LinearSearch(array);
		System.out.println(ls.linearSerch(22));
		
	}
}
