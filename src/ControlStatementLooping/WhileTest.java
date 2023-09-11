package ControlStatementLooping;

public class WhileTest {
/*
 * while(condition){
 *  //statement
 *  //increment/decrement
 */
	public static void main(String[] args) {
		int n=1;
		int fact =1;
		while(n<=6) {
			fact = fact*n;
			n++;
		}
		System.out.println("Fact :"+fact);
	}
}
