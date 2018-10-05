package logos_rada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MainRada mr = MainRada.createMainRada();

		while (true) {
			Menu();
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			switch (number) {

			case 1: {
				mr.addFraction();
				break;
			}
			case 2: {
				mr.removeFraction();
				break;
			}
			case 3: {
				mr.cleanFraction();
				break;
			}
			case 4: {
				mr.showFractions();
				break;
			}
			case 5: {
				mr.showFraction();
				break;
			}
			case 6: {
				mr.addDeputate();
				break;
			}
			case 7: {
				mr.removeDeputate();
				break;
			}
			case 8: {
				mr.showBribeTakers();
				break;
			}
			case 9: {
				mr.showMaxBriber();
				break;
			}
			default: {
				System.out.println("No such Number!");
			}
				return;
			}

		}
	}

	static void Menu() {
		System.out.println(
				"\n--------------------\n" + "������ 1 ��� ������ �������" + "\n������ 2 ��� �������� �������"
						+ "\n������ 3 ��� �������� �������" + "\n������ 4 ��� ������� �������"
						+ "\n������ 5 ��� ������� �������" + "\n������ 6 ��� ������ �������� � �������"
						+ "\n������ 7 ��� �������� �������� � ������� " + "\n������ 8 ��� ������� ������ ��������� "
						+ "\n������ 9 ��� ������� ���������� ��������� " + "\n--------------------\n");
	}
}
