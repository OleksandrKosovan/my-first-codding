package logos_myexception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a and b");

			Methods m = new Methods(s.nextInt(), s.nextInt());
			System.out.println(m.division());

		} catch (ArithmeticException e) {
			System.out.println("a=0 and b!=0 or a!=0 b=0");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println(" a=0 and b=0 ");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("a<0 and b<0");
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println("All good");
			e.printStackTrace();

		}
	}
}
