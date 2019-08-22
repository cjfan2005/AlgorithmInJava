package kent.alg.leetcode.String;
/**

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:
	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.



 */
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
	
    public int firstUniqChar(String s) {
    	Map<Character, Integer> count = new HashMap<Character, Integer>();
    	
    	int len = s.toCharArray().length;
    	for(char c : s.toCharArray()) {
    		count.put(c, count.getOrDefault(c, 0) + 1);
    	}
    	
    	// find the index
        for (int i = 0; i < len; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
    	
		
    	return -1;
    }
	public static void main(String[] args) {
		
		FirstUniqueCharacterInString f = new FirstUniqueCharacterInString();
		String s = "loveleetcode";
		
		
		
		System.out.println(f.firstUniqChar(s));

	}

}
