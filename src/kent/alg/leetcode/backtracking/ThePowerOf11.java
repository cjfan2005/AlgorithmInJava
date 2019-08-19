package kent.alg.leetcode.backtracking;

public class ThePowerOf11 {
	
	
   public int countOne2(int n) {
		
		long num = (long) Math.pow(11, n);
		String numStr = String.valueOf(num);
		
		int counter = 0;
		for(int i=0; i<numStr.length(); i++) {
			if(numStr.charAt(i) == '1')
				counter++;
		}
		return counter;
	}
	

	public int countOne(int n) {
		
		long num = 0;
		try {
			num = (long) Math.pow(11, n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String numStr = String.valueOf(num);
		
		int counter = 0;
		for(int i=0; i<numStr.length(); i++) {
			if(numStr.charAt(i) == '1')
				counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		ThePowerOf11 p = new ThePowerOf11();
		System.out.println("Result = " + p.countOne(1000));
	}

}
