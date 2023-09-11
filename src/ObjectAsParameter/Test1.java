package ObjectAsParameter;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Scanner sc = new Scanner(System.in);
		Test1 t1 = new Test1();
		
		System.out.println("Enter number of Student ");
		int x =sc.nextInt();
		System.out.println("Enter Id, name ,college");
		for(int i=0;i<x;i++) {
			int a = sc.nextInt();
			s1.setId(a);
			String b = sc.next();
			s1.setName(b);
			String c = sc.next();
			s1.setCollege(c);

		}
		t1.print(s1);
		
	}
	void print(Student1 st1) {
		System.out.println("Id of: "+st1.getId());
		System.out.println("Name of Student: "+st1.getName());
		System.out.println("Name of College is: "+st1.getCollege());
	}
}
