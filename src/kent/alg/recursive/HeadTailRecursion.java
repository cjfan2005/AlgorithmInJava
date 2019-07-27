package kent.alg.recursive;

public class HeadTailRecursion {

	
	public static void HeadRecursion(int n) {
		if(n == 0) return;
		
		HeadRecursion(n - 1);
		System.out.println("Head : " + n);
	}
	
	
	public static void TailRecursion(int n) {
		if(n == 0) return;
		
		System.out.println("Tail : " + n);
		TailRecursion(n - 1);
	}
	
	public static void main(String[] args) {
		HeadRecursion(5);
		
	    TailRecursion(5);

	}

}
