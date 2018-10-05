package packageForList;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	// link:=>https://docs.oracle.com/javase/7/docs/api/java/util/List.html

	/**
	 * java.util
	 * 
	 * Interface List<E>
	 * 
	 * public interface List<E> extends Collection<E>
	 * 
	 * This interface is a member of the Java Collections Framework.
	 * 
	 * An ordered collection
	 * 
	 * lists typically allow duplicate elements
	 * 
	 */

	public void firstMethod() {
		List<Pet> pets = new ArrayList<>();

		pets.add(new Pet("cat", "jon"));

		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(45);
		l.add(-2);
		l.add(67);
		// Appends the specified element to the end of this list

		l.add(2, 46);
		// Inserts the specified element at the specified position in this list

		System.out.println(l.contains(-2));
		// Returns true if this list contains the specified element.

		System.out.println(l.equals(pets));
		// Compares the specified object with this list for equality.

		System.out.println(l.get(4));

		System.out.println(l.hashCode());

		System.out.println(l.indexOf(2));
		// Returns the index of the first occurrence of the specified
		// element in this list, or -1 if this list does not contain the
		// element.

		System.err.println(l.isEmpty());
		// Returns true if this list contains no elements.

		System.out.println(l.lastIndexOf(62));
		// Returns the index of the last occurrence of the specified element
		// in this list, or -1 if this list does not contain the element.

		l.set(2, 56);
		// Replaces the element at the specified position in this list with
		// the specified element (optional operation).

		l.size();
		// Returns the number of elements in this list.

		System.out.println(l.subList(3, 5));
		// Returns a view of the portion of this list between the
		// specified fromIndex, inclusive, and toIndex, exclusive.

		l.toArray();
		// Returns an array containing all of the elements in this list in
		// proper sequence

	}

}
