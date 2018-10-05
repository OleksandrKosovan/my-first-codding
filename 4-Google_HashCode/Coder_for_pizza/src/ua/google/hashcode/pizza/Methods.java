package ua.google.hashcode.pizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import main.Pizza;

/**
 * Class for dividing a pizza into pieces
 * 
 * @author Kosovan Olexandr
 * @version 2.1
 */

public class Methods {

	private Pizza pizza;
	private String nameFileForResult = "result.txt";
	private String nameFileForReader = "small.in";;

	/**
	 * method for reading data pizza
	 */
	public void readFile() throws IOException {
		FileReader fileReader = new FileReader(nameFileForReader);
		BufferedReader reader = new BufferedReader(fileReader);

		String[] arrayNumber = null;
		String line = reader.readLine();
		arrayNumber = line.split(" ");

		pizza = new Pizza(arrayNumber[0], arrayNumber[1], arrayNumber[2], arrayNumber[3]);

		reader.close();
		System.out.println("Fix 2");
	}

	/**
	 * @return list of possible combinations of sizes of pieces of pizza
	 */
	public List<Integer> combinations() {
		List<Integer> listCombinations = new ArrayList<>();
		for (int i = 1; i < pizza.getNumber_H() + 1; i++) {
			for (int n = 2 * pizza.getNumber_L(); n <= pizza.getNumber_H(); n++) {
				if (n % i == 0) {
					int res = n / i;
					listCombinations.add(i);
					listCombinations.add(res);
				}
			}
		}
		System.out.println("Fix 3");
		return listCombinations;
	}

	/**
	 * @return number combinations of sizes of pieces of pizza
	 */
	public int numberCombinations() {
		System.out.println("Fix 4");
		return (combinations().size() / 2);
	}

	/**
	 * @create file for write result
	 * @throws IOException
	 */
	public void createFileForResult() throws IOException {
		File file = new File(nameFileForResult);
		file.createNewFile();
		System.out.println("Fix 6");
	}

	/**
	 * @return map containing matrix - pizza [M, T]
	 * @throws IOException
	 */
	public Map<Integer, List<String>> mapMatrixWriteFromFile() throws IOException {
		String[] arrayMatrix = null;
		FileReader fileReader = new FileReader(nameFileForReader);
		BufferedReader reader = new BufferedReader(fileReader);

		String line = reader.readLine();
		line = reader.readLine();

		Map<Integer, List<String>> mapMatrix = new HashMap<>();
		for (int i = 0; i < pizza.getRowsNumber(); i++) {
			mapMatrix.put(i, new ArrayList<>());
		}

		Set<Entry<Integer, List<String>>> set = mapMatrixWriteFromFile().entrySet();
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
		System.out.println("Fix 7");
		return mapMatrix;
	}

	/**
	 * @show map (matrix-pizza)
	 * @throws IOException
	 */
	public void showMapMatrix() throws IOException {
		Set<Entry<Integer, List<String>>> set2 = mapMatrixWriteFromFile().entrySet();
		Iterator<Entry<Integer, List<String>>> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Entry<Integer, List<String>> entry2 = iterator2.next();
			System.out.println(entry2);
		}
		System.out.println("Fix 8");
	}

}
