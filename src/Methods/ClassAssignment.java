package Methods;

public class ClassAssignment {
public static void main(String[] args) {
	/* 1) SI=?
	 * 2) A=?
	 * 
	 */
	int p=100000;
	 double totalInt = getSi(p, 1, 12);
	 System.out.println("Total Interest :"+totalInt);
	   double z = amount(totalInt,p);
	    System.out.println("Total Amount with Interest is:"+z);
}
	  static double getSi(double p, double t, double r) {
		double interest = (p*t*r)/100;
		return interest;
	}
	  static double amount(double interest, double p) {
		  double amount = p + interest;
		return amount; 
	  }
	
}
