package Aggergation;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCc(1600);
		c.setColor("Black");
		c.setCompany("Tesla");
		c.setPrice(100000000);
		Employee emp = new Employee();
		emp.setId(800);
		emp.setName("Bobby bhatta");
		emp.setCity("Pokhara");
		emp.setSalary(1000000);
		emp.setCar(c);
		Test t = new Test();
		t.printData(emp);
	}

	void printData(Employee emp) {
		System.out.println("Id  of employee: " + emp.getId());
		System.out.println("Name of employee : " + emp.getName());
		System.out.println("Address of employee: " + emp.getCity());
		System.out.println("Salary  of employee: " + emp.getSalary());
		System.out.println("Color of car:  " + emp.getCar().getColor());
		System.out.println("CC of car:  " + emp.getCar().getCc());
		System.out.println("Name of car:  " + emp.getCar().getCompany());
		System.out.println("Price of car:  " + emp.getCar().getPrice());

	}
}
