package logos_myexception;

public class Methods {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Methods [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Methods other = (Methods) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public Methods(int a, int b) throws MyException, IllegalAccessException, ArithmeticException {
		super();
		this.a = a;
		this.b = b;

		if (a < 0 && b < 0)
			throw new IllegalArgumentException();
		else if (a == 0 && b != 0)
			throw new ArithmeticException();
		else if (a != 0 && b == 0)
			throw new ArithmeticException();
		else if (a == 0 && b == 0)
			throw new IllegalAccessException();
		else
			throw new MyException("This is my exception");

	}

	public int augment() {
		return a + b;
	}

	public Methods() {
		super();
	}

	public int substraction() {
		return a - b;
	}

	public int multiplay() {
		return a * b;

	}

	public double division() {
		return a / b;
	}
}
