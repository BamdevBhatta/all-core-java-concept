package ControlStatement.Selection;

import java.util.Scanner;

public class AssignmentTest {
/*
WAP to calculate total salary for given post:
	 		post		Basic Salary 		Bonus	Total Salary(?)
	 		----		------------		-----	--------------
	 		MD			400000				18%		
	 		CEO 		300000				27.90%
	 		MANAGER		200000     			13.76%
	 		PROGRAMMER	500000				25%
 */
	
	public static void main(String[] args) {
		char post;
		 char opr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Post");
		post=(char)sc.nextInt();
		switch(post) {
		case 1:
			float total;
			total=(400000*18)/100;
			System.out.println("");
		}
		
		
		
		
		
		
	}
}
