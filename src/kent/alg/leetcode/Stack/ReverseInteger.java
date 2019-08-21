package kent.alg.leetcode.Stack;

import java.util.Stack;

public class ReverseInteger {
	
    public long reverse(int x) {
    	
    	
    	int one = 1;
    	
    	String str = String.valueOf(x);
    	if(str.charAt(0) == '-')
    		one = -1;
    	
    	Stack stack = new Stack();
    	
    	// Step1. Read the string as chars one by one
        char[] chars = str.toCharArray();
    	
    	for(char c : chars) {
    		if(c != '-')
    			stack.push(c);
    	}
    		
    		
    	StringBuffer sb = new StringBuffer();
    	while(!stack.isEmpty())
    		sb.append(stack.pop());
    	
    	long reversedInt = Long.valueOf(sb.toString());
    	
    	if(reversedInt > Integer.MAX_VALUE || reversedInt < Integer.MIN_VALUE) return 0;
    	
    	return (int)reversedInt*one;
    }

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(1534236469));
	}

}
