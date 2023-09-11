package Methods;

import java.util.Scanner;

public class MethodTest {
private static int sum;
public static void main(String[] args) {
	//sum();
//	printTable(98);
//	getSumOf1to100();
//	System.out.println("Sum is"+getSumOf1to100());
	 int x = finalSmallest(3, 4);
	 System.out.println("Samllest value"+x);
}
// 1. no return type with no argument.
		static void sum() {
			int a = 500;
			int b = 800;
			//Scanner sc = new Scanner(System.in);
			 int sum = a+b;
			 System.out.println("Sum is: "+sum);
			
		}
 // 2.no return type with arguments
		static void  printTable(int n) {
				for(int i=1;i<=10;i++) {
					System.out.println(n+"*"+i+"="+(n*i));
				}
			}
// 3.return type with no arguments.
			 static int  getSumOf1to100() {
				for(int i=1;i<=100;i++) {
					int sum = 0;
					sum = sum + i;
				}
			
				return sum;
			}
//   4. return type with arguments.
			static int finalSmallest(int x, int y) {
				 if(x<y)
					 return x;
				 else
					 return y;
			 }
			//return(x<y ?x :y)
			/*
			 * String  op ="+";
			 * return(op.equals("+"))?(x+y) : (x-y);
			 */
		
}

