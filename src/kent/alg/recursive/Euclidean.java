package kent.alg.recursive;

public class Euclidean {
	
	public int gcdIteractive(int num1, int num2) {
		
		while(num2 != 0) {
			int tmp = num2;
			num2 = num1 % num2;
			num1 = tmp;
		}
		return num1;
	}
	
	public int gcdRecursive(int num1, int num2) {
		if(num2 == 0) return num1;
		
		return gcdRecursive(num2, num1 % num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
