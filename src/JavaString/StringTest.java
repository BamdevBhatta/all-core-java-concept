package JavaString;

public class StringTest {
/*
 * ===========String============
 * 		#array or sequence or collection or character is known as String.
 * 		# 'String' is class in java.
 * 		#String class/data-types is used to create and producing string value.
 */
	public static void main(String[] args) {
		String s = "java developers in nepal";
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.length());
//		System.out.println(s.charAt(9));
//		//sub String
//		System.out.println(s.substring(5,15));
//		System.out.println(s.substring(5));
//		System.out.println(s.subSequence(5, 24));
		String s1 = s.substring(5,15);
		System.out.println(s1); 
	}
}
