package Abstraction;

public class EverestBank  extends CentralBank{

	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "Everest Bank";
	}

	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	public void printMoneyExchangeRate() {
		// TODO Auto-generated method stub
		super.printMoneyExchangeRate();
	}

}
