package Abstraction;

public class UserServiceImpl implements UserService,CommonService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("Added successfull");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("Deleter successfully");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}

}
