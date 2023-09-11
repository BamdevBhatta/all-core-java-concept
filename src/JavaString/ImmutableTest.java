package JavaString;

public class ImmutableTest {
/*
 * ========Immutable Class========
 * 		# if we  can not change state or value of original state or value of object at run time
 * 			are called immutable objects and respective class is called immutable class.
 *     #  
 *     String, Float, Double, Integer etc.
 *     
 *      ==========mutable Class======
 *      # if we  can  change state or value of original state or value of object at run time
 * 			are called mutable objects and respective class is called mutable class.
 * 			eg.
 * 				StringBuffer, StringBuilder. etc.
 *      
 * 		 
 */
	public static void main(String[] args) {
//		//Immutable
//		String s = "Java";
//		s.concat("Student");
//		System.out.println(s);
//		//output is not "java student" because String is immutable Class.
		/*
		 * ======Immutable====
		 */
		StringBuffer sb = new StringBuffer("java");
		sb.append(" Student");
		System.out.println(sb);
	}
	
}
