package MultiDimensionalArray;

public class Second {
public static void main(String[] args) {
	//storing static value
	int mat1[][] = {{2,3},{4,6}};
	int mat2[][] = {{6,7},{8,9}};
	
	int mat3[][] = new int[2][2];
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			mat3[i][j] = mat1[i][j] + mat2[i][j];
			System.out.print(" " +mat3[i][j]+" ");
		}
		System.out.println();
	}
}
}
