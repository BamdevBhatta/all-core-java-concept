package Abstraction;

public class Test {
public static void main(String[] args) {
	CentralBank b =  new EverestBank();
	System.out.println(b.getInterestRate());
	System.out.println(b.getBankName());
	//System.out.print(b.printMoneyExchangeRate());
	
	UserService us = new UserServiceImpl();
	us.addUser();
	us.deleteUser();
	us.print();
}
}
