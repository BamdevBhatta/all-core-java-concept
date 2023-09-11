package ArraySortTest;

import java.util.Arrays;

public class FirstTest {
public static void main(String[] args) {
	int data[] = {34,56,34,23,23,54,7,1,0,7,6};
	Arrays.sort(data);
	System.out.println(Arrays.toString(data));
	System.out.println("=======Reversr order=======");
	for(int i=data.length-1;i>=0;i--) {
		System.out.print(data[i]+",");
	}
	
}
}
