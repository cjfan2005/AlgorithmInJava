package kent.alg.leetcode;

public class correctness {
	
	String correctString(String s, String t) {
		
		char ch = '\0';
		
		int s_length = s.length();
		int t_length = t.length();
		char[] s_char = s.toCharArray();
		char[] t_char = t.toCharArray();
		
		if(Math.abs(s_length-t_length) > 1)
			return "IMPOSSIBLE";
			
		// SWAP
		if(s_length == t_length)
		{
			char[] chArr = new char[2];
			int k = 0;
			for(int i=0; i<s_length; i++) {
				if(s_char[i] != t_char[i]) {
					chArr[k] = s_char[i];
					k++;
				}
			}
			if(k>2)
				return "IMPOSSIBLE";
			else
				return "SWAP " + chArr[0] + " " + chArr[1];
		}
		// INSERT
		else if(s_length < t_length) 
		{
			for(int i=0; i<s_length; i++) {
				
				if(s_char[i] != t_char[i]) {
					ch = t_char[i];
					t_length = 0;
					break;
				}
				
				t_length--;
			}
			if(t_length > 0)
				ch = t_char[t.length()-1];
			
			return "INSERT " + ch;
		} 
		// REMOVE
		else if(s_length > t_length)
		{
			for(int i=0; i<t_length; i++) {
				
				if(s_char[i] != t_char[i]) {
					ch = s_char[i];
					s_length = 0;
					break;
				}
				
				s_length--;
			}
			if(s_length > 0)
				ch = t_char[t.length()-1];
			
			return "REMOVE " + ch;
		}
		
		return "IMPOSSIBLE";
		
		
	}

	public static void main(String[] args) {
		correctness c = new correctness();
		String s = "late";
		String t = "ltae";
		System.out.println(c.correctString(s, t));
	}

}
