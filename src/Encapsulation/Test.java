package Encapsulation;

public class Test {
	public static void main(String[] args) {
  Product p = new Product();
 // p.setId(502);
  p.setCompany("Dell");
  p.setName("Computer");
  p.setPrice(150000);
  System.out.println(p);
 //or  System.out.println(p.toString());
  
  
  
//  System.out.println("ID = "+p.getId());
//  System.out.println("Company = "+p.getCompany());
//  System.out.println("Name = "+p.getName());
//  System.out.println("Price = "+p.getPrice());
	}
}
