package ArrayDemoTest;

import java.util.Arrays;

public class ArrayASReturnType {
	static int[] getOddNoFrom1To100() {
		int j = 0;
		int oddNos[] = new int[15];
		for (int i = 1; i <= 30; i++) {
			if (i % 2 != 0) {
				oddNos[j] = i;
				j++;
			}
		}
		return oddNos;
	}

	public static void main(String[] args) {
		int[] abc = getOddNoFrom1To100();
		System.out.println("List of odd number is: " + Arrays.toString(abc));
	}

}
