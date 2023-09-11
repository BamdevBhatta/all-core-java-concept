package Collection;

import java.util.*;

public class UseCollege {
	public static void main(String[] args) {
		College c = new College();
		c.setFaculty("BSC CSIT");
		c.setId(0212);
		c.setName("FARWESTERN");
		c.setYear(2074);
		List<College> list = new ArrayList<>();
		list.add(c);
		UseCollege cl = new UseCollege();
		cl.print(c);

	}

	void print(College c1) {
		System.out.println("Name of college : " + c1.getName());
		System.out.println("Faculty: " + c1.getFaculty());
		System.out.println("College Id: " + c1.getId());
		System.out.println("Joining Your is: " + c1.getYear());
	}
}
