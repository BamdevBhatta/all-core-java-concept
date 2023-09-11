package Inheritance;

public class Vechile {
	private String color;
	public int speed;
	protected int size;

	protected void attributes() {
		System.out.println("color: " + color);
		System.out.println("Speed :" + speed);
		System.out.println("Size: " + size);
	}
}
