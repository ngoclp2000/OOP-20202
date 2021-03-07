
public class AddMatrices {
	public static void main(String[] args) {
		int[][] matrix1 = { {3,4,5,6},
							{2,3,4,5},
							{5,6,7,8}};
		
		int[][] matrix2 = { {5,2,-1,6},
							{2,3,0,5},
							{5,1,7,5}};
		System.out.println("Sum of two matrices: ");
		for(int i = 0 ; i < matrix1.length ; i++) {
			for(int j = 0 ; j < matrix1[0].length ; j++) {
				System.out.print(matrix1[i][j]+matrix2[i][j] +" ");
			}
			System.out.println("");
		}
	}
}
