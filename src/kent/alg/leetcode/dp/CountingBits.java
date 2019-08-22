package kent.alg.leetcode.dp;
/*
10進位          2進位
--------------
1	       0
2	      10
3	      11
4        100
5        101
 ...
50    110010
 ...
100  1100100
101  1100101

so, 
  dp[5] = dp[5/2] + 5%2 = dp[2] + 1 = 2
  dp[100] = dp[50] + 0 = dp[50] = 3
 

 */
public class CountingBits {
    public int[] countBits(int num) {
    	
        int[] dp = new int[num + 1];
        for (int i = 1; i < num + 1; i++) {
            dp[i] = dp[i / 2] + (i % 2);
        }
        
        return dp;
             
    }
    
    public int[] countBits2(int num) {
    	
    	int[] bits = new int[num+1];
    	for(int i=0; i<num + 1; i++) {
    		bits[i] = Integer.bitCount(i);
    	}
    	return bits;
    }
    
	public static void main(String[] args) {
		CountingBits cb = new CountingBits();
		System.out.println(cb.countBits(50));
		System.out.println(cb.countBits2(50));
	}

}
