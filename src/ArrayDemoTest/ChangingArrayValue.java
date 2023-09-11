package ArrayDemoTest;

public class ChangingArrayValue {
public static void main(String[] args) {
	String cars[] = { "Volvo", "BMW", "Ford", "Mazda"};
	cars[0] ="audi";
	System.out.println("First car is:"+cars[0]);
	System.out.println("Second car is:"+cars[1]);
	System.out.println("Third car is:"+cars[2]);
	System.out.println("Fourth car is:"+cars[3]);
	System.out.println("Total number of Cars : "+cars.length);
}
}
