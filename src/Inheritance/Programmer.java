package Inheritance;

public class Programmer extends Employee {
 String prolang;
 String proname;
 int bonus;
 public static void main(String[] args) {
	Programmer p = new Programmer();
	p.company = "Microsoft";
	p.name = "Bobby";
	p.bonus = 40000;
	p.prolang = "Java";
	p.id = 100;
	p.proname = "E-commerce";
	p.salary = 500000;
	System.out.println("Company: "+p.company);
	System.out.println("Name: "+p.name);
	System.out.println("Bonus: "+p.bonus);
	System.out.println("Programming Language: "+p.prolang);
	System.out.println("Project Name: "+p.proname);
	System.out.println("Id: "+p.id);
	System.out.println("Salary: "+p.salary);
}
 
}
