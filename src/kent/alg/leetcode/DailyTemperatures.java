package kent.alg.leetcode;

import java.util.Stack;

import org.junit.Test;

public class DailyTemperatures {
	
	public int[] dailyTemperatures(int[] T) {
		int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        
        for (int i = T.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) 
            	stack.pop();
            
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
	}
	
	@Test
	public void test() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(dailyTemperatures(T));;
	}

}
