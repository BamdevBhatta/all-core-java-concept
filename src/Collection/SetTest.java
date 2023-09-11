package Collection;

import java.util.*;

public class SetTest {
public static void main(String[] args) {
	//Set<String> hset = new HashSet<>();
	//it gives unique value only. here 'java' and 'java' are two times. it gives output only one.
	
	Set<String> hset = new LinkedHashSet<>();
	hset.add("Java");
	hset.add("php");
	hset.add("android");
	hset.add("pthon");
	hset.add("java");
	hset.add("html");
	for(String s:hset) {
		System.out.println(s);
	}
	
}
}
