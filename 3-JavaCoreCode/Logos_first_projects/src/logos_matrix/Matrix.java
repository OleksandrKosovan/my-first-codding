package logos_matrix;

import java.util.Random;

public class Matrix {

	int[][] matrix;
	private int n;

	public Matrix(int[][] matrix, int n) {
		super();
		this.n = n;
		matrix = new int[n][n];
	}

	public Matrix(int length) {

	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				s.concat(matrix[i][j] + " ");
				System.out.print(matrix[i][j] + " ");
			}
			s.concat("/n");
			System.out.println();
		}
		return s;
	}

	public int[][] fillmatrix() {

		int n = (int) matrix.length;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				matrix[i][j] = r.nextInt(100);
			}
		}
		return matrix;

	}

}
