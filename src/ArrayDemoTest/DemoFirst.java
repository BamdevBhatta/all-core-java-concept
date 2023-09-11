package ArrayDemoTest;

import java.util.Scanner;

public class DemoFirst {
/*
 * ==========Features============
 * 
 * collection of homogeneous data.
 * collection if multiple values if same data.
 * array has fixed size.
 * array contains duplicate data.
 * data stored on the basic of indices.(index start from 0).
 * random access.
 * contiguous memory allocation.
 * ==========Creating Array===========
 * 			syntax:
 * 			data_type array_name[] = new data_type[size];
 * (array is called in-built object)
 *     
 */
	public static void main(String[] args) {
		
		int age [] = {2,36,45,12};
		//
		System.out.println("Printing the value of array storing in indices:");
		System.out.println("First Element is: "+age[0]);
		System.out.println("Second Element is: "+age[1]);
		System.out.println("Third Element is: "+age[2]);
		System.out.println("Fourth Element is: "+age[3]);
	}
}
