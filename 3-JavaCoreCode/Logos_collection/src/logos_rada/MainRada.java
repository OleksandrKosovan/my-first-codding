package logos_rada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainRada {

	private static MainRada m;
	private static ArrayList<Fraction> list = new ArrayList();

	private MainRada() {

	}

	static public MainRada createMainRada() {

		if (m == null) {
			m = new MainRada();
			list.add(new Fraction("Freedom"));
			list.add(new Fraction("Independence"));
			list.add(new Fraction("Regions"));
		}

		return m;
	}

	public void addFraction() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of fraction: ");
		String N = sc.nextLine();
		list.add(new Fraction(N));
		for (Fraction f : list) {
			System.out.println(f);
		}
	}

	public void removeFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of fraction: ");
		String n = sc.nextLine();
		Iterator<Fraction> iter = list.iterator();
		while (iter.hasNext()) {
			Fraction f = iter.next();
			if (f.getName().equalsIgnoreCase(n)) {
				iter.remove();
			}

		}
		for (Fraction f : list) {
			System.out.println(f);
		}
	}

	public void showFractions() {
		for (Fraction o : list) {
			System.out.println(o);
		}

	}

	public void cleanFraction() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.cleanFraction();
			}
		}
	}

	public void addDeputate() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.addDeptate();
			}
		}
	}

	public void removeDeputate() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.removeDeputate();
			}
		}
	}

	public void showBribeTakers() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.showBriberTaker();
			}
		}
	}

	public void showMaxBriber() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.showMaxBriberTaker();
			}
		}
	}

	public void showFraction() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (Fraction o : list) {
			if (o.getName().equalsIgnoreCase(s)) {
				o.showFraction();
			}
		}
	}
}
