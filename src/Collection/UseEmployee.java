package Collection;

import java.util.*;

public class UseEmployee {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setId(0121);
	e.setName("Bobby Bhatta");
	e.setPost("Manager");
	e.setSalary(200000.0);
	List<Employee> e1  = new ArrayList<>();
	e1.add(e);
	for(Employee x :e1) {
		System.out.println(x);
	}
}
}
