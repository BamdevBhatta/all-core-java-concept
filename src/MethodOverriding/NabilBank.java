package MethodOverriding;

public class NabilBank extends CentralBank{
	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "Nabil Bank";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 10;
	}

}
