package Collection;

import java.util.*;

public class UseBook {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("Jeams Ghosling");
		b.setName("Java Master");
		b.setPrice(3453.66);
		List<Book> list = new LinkedList<>();
		list.add(b);
				for(Book x: list) {
			System.out.println(x);
		}
	}
	
}
