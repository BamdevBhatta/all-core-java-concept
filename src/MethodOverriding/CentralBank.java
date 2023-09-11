package MethodOverriding;

public class CentralBank {
	protected String getBankName() {
		return "Central Bank";
	}

	protected int getInterestRate() {
		return 0;
	}

	public void printMoneyExchangeRate() {
		System.out.println("$1 = 118");
		System.out.println("Yen 10 = 10");
		System.out.println("KDD 1 = 15");

	}
}
