package Inheritance;

import javax.print.attribute.standard.Sides;

public class Car extends Vechile {
	private int cc;
	private int gears;

	public void attributesCar() {

		System.out.println("Speed of car: " + super.speed);
		System.out.println("Size of car: "+size);
		System.out.println("CC of car: "+cc);
		System.out.println("No of gears of car : "+gears);
		super.attributes();

	}
	public static void main(String[] args) {
		Car c1 = new Car();
		//c1.color = "Blue";
		c1.speed = 200;
		c1.size = 22;
		c1.cc = 1000;
		c1.gears = 5;
		c1.attributes();
		System.out.println();
		//super.attribures(); // Error cannot user super in a static context
		c1.attributesCar();
	}

}
