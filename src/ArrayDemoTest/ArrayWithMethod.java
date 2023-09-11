package ArrayDemoTest;

public class ArrayWithMethod {
/*
 * =========1) Array as Argument     ========
 * 
 * =========2) Array as return type  ========
 * 
 */
	 static void findSmallestValue(int data[]) {
		 int sv = data[0];
		 for(int x:data) {
			 if(sv>x) {
				 sv=x; 
			 } 
		 }
		 System.out.println("Smallest value is: "+sv);
		
	}
	public static void main(String[] args) {
		  int arr[]= {23,100,2,455,677};
		  findSmallestValue(arr);
	}	
}
