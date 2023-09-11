package ControlStatement.Selection;

public class IfTest {
public static void main(String[] args) {
	/*
	 * 
	 * if(condition)
	 * {
	 *    //statement
	 *    ......
	 *    ....
	 * }
	 */
	int salary=20000;
	if(salary<=25000) {
		salary=salary+5000;
	}
	System.out.println("Total salary:"+salary);
}
}
