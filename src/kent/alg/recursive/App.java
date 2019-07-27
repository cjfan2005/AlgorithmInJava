package kent.alg.recursive;

public class App {

	public static void main(String[] args) {
		
		IterativeAndRecursive a = new IterativeAndRecursive();
		System.out.println("Iterative result = " + a.sumIterative(3));
		
		System.out.println("Recursive result = " + a.sumRecursive(5));
		
	}
}
