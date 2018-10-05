package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FinishMethods {

	private String nameFileForReader = "small.in";
	private String nameFailRorResult = "fail.txt";
	private List<Integer> listCombinations = new ArrayList<>();
	private Map<Integer, List<String>> map = new HashMap<>();
	private Pizza pizza;
	private int r, c, l, h;
	private int combinations;

	// for main methods
	private int a2, b2, n, m, a1, b1;

	public void readerFile() throws IOException {

		System.out.println("reader file");

		FileReader fileReader = new FileReader(nameFileForReader);
		BufferedReader reader = new BufferedReader(fileReader);

		String[] arrayNumber = null;
		String line = reader.readLine();
		arrayNumber = line.split(" ");

		pizza = new Pizza(arrayNumber[0], arrayNumber[1], arrayNumber[2], arrayNumber[3]);
		r = pizza.getRowsNumber();
		c = pizza.getColumnsNumber();
		l = pizza.getNumber_L();
		h = pizza.getNumber_H();

		System.out.println(pizza);
		reader.close();
	}

	public void combinations() {
		for (int i = 1; i < h + 1; i++) {
			for (int n = 2 * l; n <= h; n++) {
				if (n % i == 0) {
					int res = n / i;
					listCombinations.add(i);
					listCombinations.add(res);
				}
			}
		}

		System.out.println("combination for pizza: " + listCombinations);

		int listLenght = listCombinations.toArray().length;
		combinations = listLenght / 2;
	}

	public void readMatrix() throws IOException {
		String[] arrayMatrix = null;
		FileReader fileReader = new FileReader(nameFileForReader);
		BufferedReader reader = new BufferedReader(fileReader);

		String line = reader.readLine();
		line = reader.readLine();

		// create key for map
		for (int i = 0; i < r; i++) {
			map.put(i, new ArrayList<>());
		}

		// add value to key
		Set<Entry<Integer, List<String>>> set = map.entrySet();
		Iterator<Entry<Integer, List<String>>> iterator = set.iterator();

		int k = 0;
		while (iterator.hasNext() && line != null) {
			arrayMatrix = line.split("");

			Entry<Integer, List<String>> entry = iterator.next();
			if (entry.getKey() == k) {
				for (int i = 0; i < arrayMatrix.length; i++) {
					entry.getValue().add(arrayMatrix[i]);
				}
			}
			line = reader.readLine();
			k++;
		}
		reader.close();

		Set<Entry<Integer, List<String>>> set2 = map.entrySet();
		Iterator<Entry<Integer, List<String>>> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Entry<Integer, List<String>> entry2 = iterator2.next();
			System.out.println(entry2);
		}
	}

	public void methodOne() throws IOException {
		File file = new File(nameFailRorResult);
		file.createNewFile();
		FileOutputStream fileOutputStream = new FileOutputStream(nameFailRorResult);

		// для перевірки чи змінились координати, якщо не змінились,
		// значить немає комбінації яка б підійшла, вихід з програми

		int testRow = 0, testColumn = 0;
		m = -1;
		a1 = 0;
		b1 = 0;

		// iterance coordinates
		for (int q = 0; q < 2; q++) {
			if (a1 != 0 && b1 != 0) {
				a1 = testRow;
				b1 = testColumn;
				System.err.println(a1 + " " + b1);
				if (b1 == c) {
					a1 = a1 + 1;
					b1 = 0;
				}
			} else {
				// exit cycle
				// System.exit(0);
			}

			// iterance combinators
			for (int j = 0; j < combinations; j++) {
				n = n + 1; // number
				m = n + 1; // combinators

				a2 = a1 + listCombinations.get(n); // rows
				b2 = b1 + listCombinations.get(m); // columns

				fileOutputStream.write(Integer.toString(a1).getBytes());
				fileOutputStream.write(Integer.toString(b1).getBytes());
				System.out.println(a1 + " " + b1);

				if (a2 <= r && b2 <= c) {
					int mushroom = 0, tomato = 0;

					// iterance rows
					for (int i = a1; i < a2; i++) {
						Set<Entry<Integer, List<String>>> set = map.entrySet();
						Iterator<Entry<Integer, List<String>>> iterator = set.iterator();
						while (iterator.hasNext()) {
							Entry<Integer, List<String>> entry = iterator.next();
							if (entry.getKey() == i) {

								// Iterator columns
								for (int k = b1; k < b2; k++) {
									if (entry.getValue().get(k).equalsIgnoreCase("T")) {
										tomato += -1;
									}
									if (entry.getValue().get(k).equalsIgnoreCase("M")) {
										mushroom += 1;
									}
								}
							}

						}

					}
					if (tomato >= -l && mushroom >= l) {
						j += combinations;
						fileOutputStream.write(Integer.toString(a2).getBytes());
						fileOutputStream.write(Integer.toString(b2).getBytes());
						fileOutputStream.write("\n".getBytes());

						testRow = a2;
						testColumn = b2;

						System.out.println(a2 + " " + b2);
					}
				}
			}

		}
		fileOutputStream.close();
	}

}
