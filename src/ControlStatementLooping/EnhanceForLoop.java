package ControlStatementLooping;

public class EnhanceForLoop {
/*
 * for(data-type var : collection){
 *     //statement
 *     
 *     }(to read the data from collection)
 */
	public static void main(String[] args) {
		int data[] = {490,37,23,78,89,12,16,20,34,56 };
		int sum=0;
		for(int x:data) {
			System.out.println(x);
			sum=sum+x;
			
		}
		System.out.println("sum :"+sum);
	}
}
