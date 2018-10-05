package ua.com.kosovan.assertcode;

/**
 * 
 * @author Kosovan Olexandr
 *
 */
public class Methods {

	/*
	 * check the input arguments at the beginning of the function
	 */
	public static int factorial(int n) {
		assert (n >= 0);

		assert (n <= 10);
		if (n < 2) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	/*
	 * test data within a code
	 */
	public static int factorial_two(int n) {
		int result = 1;
		int INT_MAX = 2147483647;
		while (n > 1) {
			assert (result <= INT_MAX / n);

			result *= n;
			--n;
		}
		return result;
	}

	
	
}
