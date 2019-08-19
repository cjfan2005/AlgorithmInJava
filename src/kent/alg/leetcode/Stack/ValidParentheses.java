package kent.alg.leetcode.Stack;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

cases: (){}[] , ([)] , }
 */

// 'Stack' to solve ! push/pop
// time: O(n) , space: O(n)
public class ValidParentheses {

    public boolean isValid(String s) {
    	if(s == null || s.length() == 0) return true;
    	Stack<Character> stack = new Stack<>();
    	
    	for(Character ch : s.toCharArray()) {
    		if(ch == '(') {
    			stack.push(')');
    		} else if (ch == '[') {
    			stack.push(']');
    		} else if (ch == '{') {
    			stack.push('}');
    		} else {
    			if (stack.isEmpty() || stack.pop() != ch) {
        			return false;
    			}
    		}
    	}
    	return stack.isEmpty();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
