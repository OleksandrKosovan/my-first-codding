package logos_matrix;

public class MatrixHelper {

	public static Matrix add(Matrix a, Matrix b) {
		Matrix m = new Matrix(a.matrix.length);
		int n = a.matrix.length;
		if (a.matrix.length != b.matrix.length) {
			System.out.println("Розміри матриць мають бути однаковими");
			return m;
		} else {

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					m.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];

				}
		}
		return m;

	}

	public static Matrix substract(Matrix a, Matrix b) {
		Matrix m = new Matrix(b.matrix.length);
		if (a.matrix.length != b.matrix.length) {
			System.out.println("Розміри матриць мають бути однаковими");
			return m;
		} else {

			for (int i = 0; i < a.matrix.length; i++)
				for (int j = 0; j < a.matrix.length; j++) {
					m.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];

				}
		}
		return m;

	}

	public static Matrix multiply(Matrix a, Matrix b) {
		Matrix m = new Matrix(b.matrix.length);
		int n = a.matrix.length;
		if (a.matrix.length != b.matrix.length) {
			System.out.println("Розміри матриць мають бути однаковими");
			return m;
		} else {

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {

						m.matrix[i][j] += a.matrix[i][k] + b.matrix[k][j];

					}

				}
			}

		}
		return m;

	}
}
