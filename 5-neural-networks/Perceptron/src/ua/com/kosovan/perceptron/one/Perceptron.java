package ua.com.kosovan.perceptron.one;

import java.util.Arrays;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0 neural network with one neuron (parceptron)
 *
 */
public class Perceptron {

	/**
	 * @enters incoming data
	 * @outer output data
	 * @weights balance in neural network
	 * @patterns data for study
	 */
	double[] enters;
	double outer;
	double[] weights;
	double[][] patterns = { { 0, 0, 0 }, { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

	/**
	 * class constructor
	 */
	public Perceptron() {
		enters = new double[2];
		weights = new double[enters.length];
		for (int i = 0; i < enters.length; i++) {
			weights[i] = Math.random() * 0.2 + 0.1;
		}
	}

	/**
	 * method for count outer, 1 or 0
	 */
	public void countOuter() {
		outer = 0;
		for (int i = 0; i < enters.length; i++) {
			outer += enters[i] * weights[i];
		}
		if (outer > 0.5)
			outer = 1;
		else
			outer = 0;
	}

	/**
	 * 
	 * @return numbers iteration need for study this method is main for neural
	 *         network, provides the desired value weights
	 */
	public int study() {
		int iter_number = 0;
		double gError = 0;
		do {
			iter_number++;
			gError = 0;
			for (int j = 0; j < patterns.length; j++) {
				enters = Arrays.copyOf(patterns[j], patterns[j].length - 1);
				countOuter();
				double error = patterns[j][2] - outer;
				gError += Math.abs(error);
				for (int i = 0; i < enters.length; i++) {
					weights[i] += 0.1 * error * enters[i];
				}
			}

		} while (gError != 0);
		return iter_number;
	}

	/**
	 * method test for neuron
	 */
	public void test() {
		int k = study();
		System.out.println(k);
		for (int j = 0; j < patterns.length; j++) {
			enters = Arrays.copyOf(patterns[j], patterns[j].length - 1);
			countOuter();
			System.out.println(outer);
		}

	}

}
