package ArrayDemoTest;

import java.util.Scanner;

public class DemoTestSecond {
public static void main(String[] args) {
	int age[] = new int [5];
	System.out.println("Enter age of Student:");
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<age.length;i++) {
		age[i]=sc.nextInt();
	}
	for(int x:age) {
		System.out.println("Age of student is:"+x);
	}
}
}
