package logos_rada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	private String name;
	Fraction(String s) {
		this.name = s;
	}
	private List<Deputate> list = new LinkedList();
	public void addDeptate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight: ");
		double w = sc.nextDouble();
		System.out.println("Enter height: ");
		double h = sc.nextDouble();
		System.out.println("Enter First Name: ");
		String fN = sc.next();
		System.out.println("Enter Last Name: ");
		String lN = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Is he BribeTaker (true/false): ");
		boolean bT = sc.nextBoolean();
		Deputate d = new Deputate(w, h, fN, lN, age, bT, age);
		d.takeBriber();
		list.add(d);
	}
	public void removeDeputate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fN = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lN = sc.nextLine();
		Iterator<Deputate> iter = list.iterator();
		while (iter.hasNext()) {
			Deputate d = iter.next();
			if (d.getFirstName().equalsIgnoreCase(fN)
					&& d.getLastName().equalsIgnoreCase(lN)) {
				iter.remove();
			}
		}

	}
	public void showBriberTaker() {
		ArrayList list2 = new ArrayList();
		for (Deputate o : list) {
			if (o.isBribeTaker()) {
				list2.add(o);
			}

		}
		if (!list2.isEmpty()) {
			for (Object o : list2) {
				System.out.println(o);
			}

		}  
		else {
			System.out.println("there are no briber takers in fraction");
		}

	}
	public void showMaxBriberTaker() {
		Deputate d = list.get(0); 
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getBriber() < list.get(j).getBriber()) {
					d = list.get(j);
				}

			}
		}
		if (d.getBriber() != 0) {
			System.out.println(d);
		}

	}
	public void showFraction() {
		if (!list.isEmpty()) {
			for (Object o : list) {
				System.out.println(o);
			}
		} 
		else {
			System.out.println("No deputates in fraction");
		}
	}
	public void cleanFraction() {
		list.clear();
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Fraction [name = " + name + "]";
	}

}
