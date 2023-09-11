package MethodOverriding;

public class PrabhuBank extends CentralBank {
@Override
protected String getBankName() {
	// TODO Auto-generated method stub
	return "Prabhu Bank";
}
@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 15;
	}
}
