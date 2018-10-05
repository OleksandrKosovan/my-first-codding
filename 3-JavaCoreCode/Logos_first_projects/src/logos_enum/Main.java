package logos_enum;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("Enter 1 month to check existing of the month");
		System.out.println("Enter 2 for print all month with the same season");
		System.out.println("Enter 3 for print all month witch have the same days");
		System.out.println("Enter 4 for print all month with less day");
		System.out.println("Enter 5 for print all month with large day");
		System.out.println("Enter 6 for print next season");
		System.out.println("Enter 7 for print previous season");
		System.out.println("Enter 8 for print all month witch have pair number of day");
		System.out.println("Enter 9 for print all month witch don't have pair number of day");
	}

	public static void main(String[] args) {

		Month monthArray[] = Month.values();
		Seasons seasonArray[] = Seasons.values();

		while (true) {
			Scanner sc = new Scanner(System.in);
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month: ");
				Scanner sc2 = new Scanner(System.in);
				String s = sc2.next();
				boolean b = false;
				for (Month mo : Month.values()) {
					if (mo.name().equalsIgnoreCase(s)) {
						System.out.println(mo.getSeason());
						System.out.println(mo.getDays());
						System.out.println("yes it exist");
						b = true;
					}
				}
				if (b == false) {
					System.out.println("There are no such a month");
				}
				break;
			}
			case "2": {
				System.out.println("Write a month:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (Month mo : monthArray) {

					if (mo.name().equalsIgnoreCase(s)) {
						for (Month month : monthArray) {
							if (month.getSeason().equals(mo.getSeason())) {
								System.out.println(month);
							}
						}
					}

				}
				break;
			}
			case "3": {
				System.out.println("Write a month:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (Month mo : monthArray) {
					if (mo.name().equalsIgnoreCase(s)) {
						for (int i = 0; i < monthArray.length; i++) {
							int a = monthArray[i].getDays();
							if (a == mo.getDays()) {
								System.out.println(monthArray[i]);
							}
						}
					}

				}
				break;
			}
			case "4": {
				System.out.println("Write a month:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (Month mo : monthArray) {
					if (mo.name().equalsIgnoreCase(s)) {
						System.out.println(mo.getDays());
						for (int i = 0; i < monthArray.length; i++) {
							int a = monthArray[i].getDays();
							if (a <= mo.getDays()) {
								System.out.println(monthArray[i]);
							}
						}
					}

				}
				break;

			}
			case "5": {
				System.out.println("Write a month:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (Month mo : monthArray) {
					if (mo.name().equalsIgnoreCase(s)) {
						System.out.println(mo.getDays());
						for (int i = 0; i < monthArray.length; i++) {
							int a = monthArray[i].getDays();
							if (a >= mo.getDays()) {
								System.out.println(monthArray[i]);
							}
						}
					}

				}
				break;
			}
			case "6": {
				System.out.println("Write a season:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (Seasons seasons : seasonArray) {
					if (seasons.name().equalsIgnoreCase(s)) {
						for (int i = 0; i < seasonArray.length; i++) {
							if (seasonArray[i].name().equals(seasons.name())) {

								if (seasonArray[i].equals(Seasons.AUTUMN)) {
									System.out.println(Seasons.WINTER);
								} else {
									System.out.println(seasonArray[i + 1]);
								}
							}
						}
					}
				}
				break;
			}
			case "7": {
				System.out.println("Write a season:");
				Scanner scan = new Scanner(System.in);
				String s = scan.next();
				for (int i = 0; i < seasonArray.length; i++) {
					if (s.equalsIgnoreCase("WINTER")) {
						System.out.println(seasonArray[i].AUTUMN);
					} else if (s.equalsIgnoreCase(seasonArray[i].name())) {
						System.out.println(seasonArray[i - 1]);
					}

				}
				break;

			}
			case "8": {
				for (Month m : monthArray) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}
			case "9": {
				for (Month m : monthArray) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m);
					}
				}
				break;
			}
			case "0": {
				System.out.println("Uuups.Error.Please check what did write!");
				System.exit(0);
			}
			}
		}
	}
}
