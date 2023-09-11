package Collection;

import java.util.Arrays;
import java.util.*;

public class CollectionSort {
public static void main(String[] args) {
	List<Integer> list =  Arrays.asList(56,45,34,3,23,65,34);
//	Collections.sort(list);
//	System.out.println(list);
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
}
}
