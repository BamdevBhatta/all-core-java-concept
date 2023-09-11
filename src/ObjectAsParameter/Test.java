
package ObjectAsParameter;

public class Test {
	public static void main(String[] args) {
		//Student s = new Student();
//		s.setId(405);
//		s.setAge(25);
//		s.setFname("Bobby");
//		s.setLname("Bhatta");
//		s.setCollege("FWU");
		Test t = new Test();
		Student s = t.getData();
         t.print(s);	
	}
	 // 1 object as parameter
	 void print(Student student) {
		System.out.println("Id : "+student.getId());
		System.out.println("First Name: "+student.getFname());
		System.out.println("Last name: "+student.getLname());
		System.out.println("College : "+student.getCollege());
		System.out.println("Age: "+student.getAge());
	}
	 // 2 object as a return type
	 Student getData() {
		 Student s = new Student();
		    s.setId(405);
			s.setAge(25);
			s.setFname("Bobby");
			s.setLname("Bhatta");
			s.setCollege("Fwu");
			return s;
		 
	 }
}
