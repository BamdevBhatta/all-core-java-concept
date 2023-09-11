package ControlStatement.Selection;

public class NestedIfTest {
/*
 if(condition1){
 if(condition2){
 if(condition3){
 
     statement
      
      }else{
      
      statement
      
      }else{
      
      statement
      
      }else{
      
      statement
      
      }
      
 */
	public static void main(String[] args) {
		String citizenship="indian";
		int age=40;
		String voterId="yes";
		if(citizenship.equals("nepali")) {
			if(age>=18) {
				if(voterId=="yes") {
					System.out.println("you can vote");
				}else {
					System.out.println("you don't have voter id");
				}
			}
			else {
				System.out.println("you are under age");
			}
			
		}else {
			System.out.println("you are not nepali");
		}
		
	}
}
