package kent.alg.javaBasic;

/**
 * Compare the equals and ==
 * @author kentfan
 *
 */
public class Equals {
	
	

	
	public static void main(String[] args) {
		
		String str1 = new String("this is Kent");
		String str2 = new String("this is Kent");
		String str3 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
	}

}
