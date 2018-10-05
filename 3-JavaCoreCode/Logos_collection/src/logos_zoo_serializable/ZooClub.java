package logos_zoo_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	Map<Person, List<Pet>> map;

	ZooClub() {

		map = new HashMap<>();

	}

	public static void showMenu() {
		System.out.println("\n1) додати учасника в клуб" + "\n2) додати тваринку до учасника клубу."
				+ "\n3) видалити тваринку з власника." + "\n4) видалити учасника клубу."
				+ "\n5) видалити конкретну тваринку з усіх власників." + "\n6) вивести на екран зооклуб."
				+ "\n7) серіалізувати Мапу в файл" + "\n8) десеріалізувати Мапу з файлу" + "\n9) вийти з програми");
	}

	public void addPerson() {// dodatu vlasnuka

		System.out.println("Введіть імя учасника клубу: ");
		Scanner scaddPerson = new Scanner(System.in);
		String name = scaddPerson.nextLine();

		System.out.println("Введіть вік учасника клубу: ");
		Scanner scaddPerson1 = new Scanner(System.in);
		int age = scaddPerson1.nextInt();

		map.put(new Person(name, age), new ArrayList<Pet>());

		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter = setMap.iterator();
		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp = iter.next();
			System.out.println(temp);
		}
	}

	// метод додавання тваринки до персони
	public void addPet() {

		System.out.println("Введіть імя власника");
		Scanner scAddPet = new Scanner(System.in);
		String nameown = scAddPet.nextLine();

		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter = setMap.iterator();

		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp = iter.next();
			if (temp.getKey().getName().equalsIgnoreCase(nameown)) {

				System.out.println("Введіть яку тваринку ви додаєте: ");
				Scanner sctype = new Scanner(System.in);
				String type = sctype.nextLine();

				System.out.println("Введіть імя тваринки: ");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.nextLine();

				temp.getValue().add(new Pet(type, name));
			}

		}
		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp1 = iter.next();
			System.out.println(temp1);
		}

	}

	public void removePet() {// vudalutu
								// tvarunky Map<Person, List<Pet>> map
		System.out.println("Введіть імя власника");
		Scanner scRemovePet = new Scanner(System.in);
		String nameown = scRemovePet.nextLine();

		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter = setMap.iterator();

		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp = iter.next();
			if (temp.getKey().getName().equals(nameown)) {

				System.out.println("Введіть яку тваринку ви видаляєте: ");
				Scanner scRemovePet1 = new Scanner(System.in);
				String type = scRemovePet1.nextLine();

				System.out.println("Введіть імя тваринки: ");
				Scanner scRemovePet2 = new Scanner(System.in);
				String name = scRemovePet2.nextLine();

				temp.getValue().remove(new Pet(type, name));

			}

		}
	}

	public void menu() throws IOException, ClassNotFoundException {
		while (true) {
			ZooClub.showMenu();
			Scanner scMenu = new Scanner(System.in);
			int k = scMenu.nextInt();

			switch (k) {
			case (1): {
				addPerson();
				break;
			}
			case (2): {
				addPet();
				break;
			}
			case (3): {
				removePet();
				break;
			}
			case (4): {
				removePerson();
				break;
			}
			case (5): {
				removeAllPet();
				break;
			}
			case (6): {
				allClub();
				break;
			}
			case (7): {
				serializable();
				break;
			}
			case (8): {
				decerializable();
				break;
			}
			case (9): {
				exit();
				break;
			}
			default:
				System.out.println("Немає такого пункту ");
				return;
			}

		}
	}

	public void removePerson() {

		System.out.println("Введіть імя учасника");
		Scanner scRemovePerson = new Scanner(System.in);
		String nameown = scRemovePerson.nextLine();

		System.out.println("Введіть вік учасника:");
		Scanner scRemovePerson1 = new Scanner(System.in);
		int age = scRemovePerson1.nextInt();

		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter2 = setMap.iterator();

		while (iter2.hasNext()) {
			Entry<Person, List<Pet>> temp = iter2.next();

			if (temp.getKey().getName().equalsIgnoreCase(nameown) && temp.getKey().getAge() == age) {
				map.remove(temp.getKey());

			}

		}
	}

	public void removeAllPet() {

		System.out.println("Введіть тип тваринки");
		Scanner scRemoveAllPet = new Scanner(System.in);
		String nametype = scRemoveAllPet.nextLine();

		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter = setMap.iterator();

		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp = iter.next();

			Iterator<Pet> iterPet = temp.getValue().iterator();

			while (iterPet.hasNext()) {
				Pet petdel = iterPet.next();

				if (petdel.getAnimal().equals(nametype)) {
					iterPet.remove();

				}
			}
		}
	}

	public void allClub() {
		Set<Entry<Person, List<Pet>>> setMap = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iter = setMap.iterator();
		while (iter.hasNext()) {
			Entry<Person, List<Pet>> temp = iter.next();
			System.out.println(temp);
		}
		if (map.isEmpty()) {
			System.out.println("\tСорі але немає учасників клубу");
		}
	}

	public void exit() {
		System.exit(0);

	}

	public void serializable() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("map.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(map);
		objectOutputStream.flush();
		objectOutputStream.close();
	}

	public void decerializable() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("map.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Map<Person, List<Pet>> map = (Map<Person, List<Pet>>) objectInputStream.readObject();

		System.out.println(map);

	}
}
