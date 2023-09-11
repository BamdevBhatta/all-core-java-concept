package ClassObjectConcept;

import java.util.Scanner;

public class Cricle {
/*
 * Write an object oriented program to create an entity class called circle,
     with an integer data member radius. Provide following methods in your 
     class
 setRadius( ), which should accept an integer as argument and should
        initialize radius with it.
 calculateArea( ), which should calculate and display area of the circle.
 calculateCircumference( ), which should calculate and display
        circumference of the circle.
Now design a driver class called UseCircle, which should accept radius
     from user, create and initialize Circle object and should display its area and
     circumference.

 */
     int setRadius() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the radious of Circle");
    	 int r = sc.nextInt();
    	 return r; 
     }
	double  calculateArea(){
		 double r = setRadius();
		 double  a = Math.PI* Math.pow(r , 2);
		System.out.println("Area of circle is: "+a);
		return r;
	}
	 void calculateCircumference( ) {
		double x = calculateArea();
		 double b = 2*(Math.PI)*x;
		 System.out.println("Circumference of circle is:"+b);
		 
	 }
}
