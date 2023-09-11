package MethodOverriding;

public class NmbBank  extends CentralBank{
	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "NMB Bank";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 13;
	}

}
