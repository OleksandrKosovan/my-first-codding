package logos_matrix;

public class Main {

	public static void main(String[] args) {
		Matrix m = new Matrix(5);
		Matrix n = new Matrix(5);

		m.fillmatrix();
		n.fillmatrix();

		System.out.println(m);
		System.out.println(n);

		System.out.println(MatrixHelper.add(m, n));
		System.out.println(MatrixHelper.substract(m, n));
		System.out.println(MatrixHelper.multiply(m, n));
	}
}
