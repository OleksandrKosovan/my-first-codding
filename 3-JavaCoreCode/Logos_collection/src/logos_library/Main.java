package logos_library;

public class Main {

	public static void main(String[] args) {

		Library lib = new Library();
		while (true) {
			System.out.println("1-add author");
			System.out.println("2-add book");
			System.out.println("3-delete book");
			System.out.println("4-delete author");
			System.out.println("5-delete author's books");
			System.out.println("6-sort books by date");
			System.out.println("7-sort books by count of pages");
			System.out.println("8-print library");
			System.out.println("9-exit");

			int n = lib.s.nextInt();

			switch (n) {
			case 1:
				lib.addAuthor();
				break;
			case 2:
				lib.addBook();
				break;
			case 3:
				lib.removeBook();
				break;
			case 4:
				lib.removeAuthor();
				break;
			case 5:
				lib.deleteAllBooks();
				break;
			case 6:
				lib.sortByDate();
				break;
			case 7:
				lib.sortByPages();
				break;
			case 8:
				lib.printLibrary();
				break;
			case 9: {
				lib.s.close();
				System.exit(0);
			}

			}

		}
	}
}
