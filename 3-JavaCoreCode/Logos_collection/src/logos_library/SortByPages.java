package logos_library;

import java.util.Comparator;

public class SortByPages implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getCountrOfPages() - o2.getCountrOfPages();
	}
}
