package ControlStatement.Selection;

public class IfElseTest {
/*
 if(condition){
 		
 		//statement
 		...
 		...
 		}else(){
 		//statement
 		....
 		...
 		}
 */
	public static void main(String[] args) {
		int n=40;
		if(n%2==0) {
			
			//System.out.println(n+ " is Even "+ "number");
		}else {
			//System.out.println(n+" is Odd number");
		}
		System.out.println((Integer.parseInt(args[0])%2==0?"even":"odd"));
	}
}
