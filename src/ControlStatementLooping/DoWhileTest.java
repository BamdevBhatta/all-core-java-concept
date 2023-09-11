package ControlStatementLooping;

public class DoWhileTest {
/*
 * do{
 *     //statement
 *     //inc/decr
 *     
 * }while(condition)
 *      //wap to calculate the table of 8
 */
	public static void main(String[] args) {
	 int sum=0;
	 int n=8;
	  int i=1;
	 do {
		 System.out.println(n+" * "+i+" = "+(n*i));
		 i++;
	 }while(i<=10);
	}
}
