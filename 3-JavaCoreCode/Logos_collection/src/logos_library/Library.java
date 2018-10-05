package logos_library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Library {

	private HashMap<Author, ArrayList<Book>> library;
	public static Scanner s = new Scanner(System.in);

	public Library() {
		library = new HashMap<>();
	}

	public void addAuthor() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();
		System.out.println("Enter height");
		double height = s.nextDouble();
		System.out.println("Enter weight");
		double weight = s.nextDouble();
		System.out.println("Anter age");
		int age = s.nextInt();

		library.put(new Author(height, weight, age, name, lastname), new ArrayList());

	}

	public void addBook() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		for (Map.Entry<Author, ArrayList<Book>> ent : library.entrySet()) {
			if (ent.getKey().getName().equals(name) && ent.getKey().getLastname().equals(lastname)) {
				System.out.println(" Book's title");
				String title = s.next();
				System.out.println("book's year of printing");
				int year = s.nextInt();
				System.out.println("Count of pages");
				int pg = s.nextInt();
				ent.getValue().add(new Book(title, year, pg));

			}
		}

	}

	public void removeBook() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		Iterator it = library.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Author, ArrayList> entry = (Entry<Author, ArrayList>) it.next();
			if (entry.getKey().getName().equals(name) && entry.getKey().getName().equals(lastname)) {
				System.out.println(" Book's title");
				String title = s.next();
				Iterator iter = entry.getValue().iterator();
				while (iter.hasNext()) {
					Book b = (Book) iter.next();
					if (b.getBooksName().equals(title))
						iter.remove();

				}
			}

		}
	}

	public void removeAuthor() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		Iterator it = library.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Author, ArrayList> lb = (Entry<Author, ArrayList>) it.next();
			if (lb.getKey().getName().equals(name) && lb.getKey().getLastname().equals(lastname))

				it.remove();
		}

	}

	public void deleteAllBooks() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		for (Map.Entry<Author, ArrayList<Book>> ent : library.entrySet()) {
			if (ent.getKey().getName().equals(name) && ent.getKey().getLastname().equals(lastname)) {
				ent.getValue().clear();
			}
		}
	}

	public void sortByDate() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		Iterator it = library.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Author, ArrayList> lb = (Entry<Author, ArrayList>) it.next();
			if (lb.getKey().getName().equals(name) && lb.getKey().getLastname().equals(lastname)) {
				Collections.sort(lb.getValue(), new SortByDate());
				System.out.println(lb.getValue());
			}
		}

	}

	public void sortByPages() {
		System.out.println("Enter author's name");
		String name = s.next();
		System.out.println("Enter lastname");
		String lastname = s.next();

		Iterator it = library.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Author, ArrayList> lb = (Entry<Author, ArrayList>) it.next();
			if (lb.getKey().getName().equals(name) && lb.getKey().getLastname().equals(lastname)) {

				Collections.sort(lb.getValue(), new SortByPages());
				System.out.println(lb.getValue());
			}
		}

	}

	public void printLibrary() {

		Iterator it = library.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Author, ArrayList> lb = (Entry<Author, ArrayList>) it.next();
			System.out.println(lb.getKey());
			System.out.println(lb.getValue());

		}
	}
}
