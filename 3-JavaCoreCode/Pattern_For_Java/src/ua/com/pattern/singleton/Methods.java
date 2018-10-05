package ua.com.pattern.singleton;
/**
 * @author Kosovan Olexandr
 * @version 1.0
 * @pattern singleton intended for global access
 *
 */
public class Methods {

	private static Methods instance;

	public static Methods getInstance() {
		if (instance == null) {
			instance = new Methods();
		}
		return instance;
	}

	private Methods() {
	}

	public void print() {
		System.out.println("hello world");
	}

	public void namePattern() {
		System.out.println("singeleton");
	}
}
