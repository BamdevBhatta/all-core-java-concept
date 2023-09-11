package MultiDimensionalArray;
import java.util.Scanner;
public class MdArrayFirst {
/*
 * syntax:
 * 			data_type array_name[][] = new data_type[row][col];
 */
	/*
	 * =====for Stroing Static data=====
	 * int mat1[][] = {{12,23},{23,56}}
	 */
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		/* 	C0   C1
		 *R0 [] []
		 * R1[] []
		 */
		//writer value in multiDarray
//		mat[0][0] = 23;
//		mat[0][1] = 12;
//		mat[1][0] = 45;
//		mat [1][1] = 60;
		int[] arr2 = new int[3];
		int[] arr3 = {};
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("Enter value:");
				mat[i][j]=sc.nextInt();
			}
		}
		for(int row =0;row<2;row++) {
			for(int col=0;col<2;col++ ) {
				//mat[row][col]=60;
				System.out.print(mat[row][col]+" ");
			}
			System.out.println();
		}
	}
}
