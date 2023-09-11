package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// <class> => generic class
		list.add("Hari");
		list.add("Ram");
		list.add("Krishna");
//		list.add(99);
//		list.add('@');
//		list.add(7.4);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		list.remove(1);
		System.out.println(list.contains("Hari"));
		for(String s:list) {
			System.out.println(s);
		}
	}
}
