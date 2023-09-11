package ArrayDemoTest;

public class ArrayTest {
	String subjects[] = new String[5];
	int marks[] = new int[5];
	int j =0;

	static void   printMarksheet( String subjects[], int marks[]) {
		for( String x:subjects ) {	
			System.out.print(x+"    ");
		}
		System.out.println();
		for(int y:marks) {
			System.out.print(y+"         ");
		}
	}
public static void main(String[] args) {
int m[] = {23,45,67,67,55};
String sub[] = {"English","math","computer","Social","English"};
printMarksheet(sub,m);
	
}
}
