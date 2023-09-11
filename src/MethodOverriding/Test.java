package MethodOverriding;

public class Test {
	public static void main(String[] args) {
		// static or early binding of object
		PrabhuBank pb = new PrabhuBank();
		System.out.println("Name: " + pb.getBankName());
		System.out.println("Interest rate: " + pb.getInterestRate());
		// up-casting
		CentralBank b = new NabilBank();
		Test t = new Test();
		t.printBankInfo(b);
		//late or dynamic binding
			}
	void printBankInfo(CentralBank b) {
		System.out.println("Name: "+b.getBankName());
		System.out.println("Rate: "+b.getInterestRate());
	}

}
