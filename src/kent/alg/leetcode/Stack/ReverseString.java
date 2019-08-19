package kent.alg.leetcode.Stack;

import java.util.Stack;

public class ReverseString {
	
	public String doRevert(String input) {
		
		if(input == null || input.isEmpty()) return null;
		
		StringBuffer result = new StringBuffer();
		Stack stack = new Stack();
		
		// Step1. Read the string as chars one by one
        char[] chars = input.toCharArray();
        
        
        // Step2. Push those chars into stack sequentially.
        for(char c : chars)
        	stack.push(c);
        
        //Step3. Pop all chars to a new string
        while(!stack.isEmpty())
        	result.append((char)stack.pop());
        
		return result.toString();
	}

	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String s = ".tneK si siht ,ih";
		String s1 = " ";
		String s2 = null;
		String reversedString = rs.doRevert(s1);
		System.out.println("Reversed String : " + reversedString);
	}
}
