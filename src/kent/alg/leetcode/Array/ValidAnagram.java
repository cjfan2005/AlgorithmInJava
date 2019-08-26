package kent.alg.leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
    Given two strings s and t , write a function to determine if t is an anagram of s.

	Example 1:z
	
	Input: s = "anagram", t = "nagaram"
	Output: true

	Example 2:
	
	Input: s = "rat", t = "car"
	Output: false

 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    
	    return Arrays.equals(str1, str2);
        
    }
	
	public static void main(String[] args) {
		ValidAnagram va = new ValidAnagram();
		
		String s = "helloworld";
		String t = "worldhello";
		System.out.println(va.isAnagram(s, t));

	}

}
