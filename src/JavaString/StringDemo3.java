package JavaString;

public class StringDemo3 {
/*
 * =========Equality Test========
 * 		two methods
 * 		1)equals()
 * 		2)equalsIgnoreCase()
 */
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "nepal";
		
		String s3 = "java";
		String s4 = new String("java");
		
//		System.out.println(s1==s3);//(object location is same so  same value assigned in  obj s1 && s3)
//		System.out.println(s1==s4);//(object location is different )
//		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase("Java"));
		System.out.println(s1.equals("Java"));
	}
}
