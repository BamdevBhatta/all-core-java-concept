package constructor;

public class User {
	String username;
	String password;
	
//	 void pr intuser() {
//		System.out.println("username: "+username);
//		System.out.println("Password: "+password);
//	}
	//======parameterised constructor.======
//	User(String un, String psw){
//		username =un;
//		password = psw;
//	}
	//'Object' class is root/parent class of java and
	//implicitly inherited.
	//this is used when instance and local variables are same.
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
	void printUser() {
		System.out.println("username: "+username);
		System.out.println("password: "+password);
	}
public static void main(String[] args) {
	User sc = new User("ram", "7777");
	sc.printUser();
	}

}
