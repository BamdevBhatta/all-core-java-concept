package Collection;

import java.util.*;

public class MapSet {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		//Map<String, Integer> hmap = new TreeMap<>();
		//Map<String, Integer> hmap = new HashMap<>();
		//Map
		hmap.put("Hari", 59);
		hmap.put("Krishna", 39);
		hmap.put("Ram", 19);
		hmap.put("Bikash", 39);
		hmap.put("Prakash", 50);
		hmap.put("Bibek", 9);
		for (String key : hmap.keySet()) {
			System.out.println(key + " = " + hmap.get(key));
		}
	}
}
