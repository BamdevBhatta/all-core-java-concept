package JavaString;

public class MailValidation {
/*
 * 		regex : regular Expression
 */
	public static void main(String[] args) {
		/*
		 * 		digit : [0-9]
		 * 		small char : [a-z]
		 * 		upper case char : [A-Z]
		 * 		digit + char : [0-9a-zA-Z]
		 * 		Symbols : \\@, \\., \\., \\_
		 */
		
		//input with digits only having unlimited value.
		String regex1 = "^[0-9]$";
		//String regex1 = "^[0-9]*$";(this store unlimited digit)
		String input = "3333";
	//	System.out.println(input.matches(regex1));
		//Digits with only having min and max value
		String regex2 = "[0-9]{2,6}";
		String input1 = "234564";
	//  System.out.println(input1.matches(regex2));
		
		
		//phone validation
		
		
		//this one is for normal condition.
//		String phoneRegex = "[0-9]{10}";
//		String phone = "9402367450";
//		System.out.println(phone.matches(phoneRegex));
//		
		//if we need exactly real phone number which is start from 98 (for ntc)
		String phoneRegex1 = "[9]{1}[8]{1}[0-9]{8}";
		String phone1 = "9802367450";
			System.out.println(phone1.matches(phoneRegex1));
//		
//		//if we need exactly real phone number which is start from 98 (for ncell)
//				String phoneRegex2 = "[9]{1}[8]{1}[0|1][0-9]{8}";
//				String phone2 = "9402367450";
//				System.out.println(phone2.matches(phoneRegex2));
		
	}
}
