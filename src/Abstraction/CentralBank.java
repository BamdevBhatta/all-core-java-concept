package Abstraction;

public abstract class CentralBank {
	protected  abstract String getBankName();

	protected  abstract int getInterestRate(); 
	public void printMoneyExchangeRate() {
		System.out.println("$1 = 118");
		System.out.println("Yen 10 = 10");
		System.out.println("KDD 1 = 15");

	}
}
