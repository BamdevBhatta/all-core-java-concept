package ArrayDemoTest;

import java.util.Scanner;

public class ArrayTest3 {
//wap to input the price of 10 books from user dispaly the price of book and findout the average
	//price of book.
	public static void main(String[] args) {
		double avg = 0;
		double total=0;
		double price [] =new double[10];
		System.out.println("Enter price of book");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<price.length;i++) {
			price[i] = sc.nextDouble();
			 total =total+price[i];
			avg=total/price.length;
		
		}
		for(double x:price) {
			System.out.println("Price of book is:"+x);
			
		}
		System.out.println("Total price of book is: "+total);
		System.out.println("Average price of Book is"+avg);
		 
	}
		
		
			
	}

