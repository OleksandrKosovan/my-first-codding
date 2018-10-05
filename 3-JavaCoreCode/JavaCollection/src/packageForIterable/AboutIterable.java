package packageForIterable;

import java.util.Iterator;

public class AboutIterable {

	// link=> http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
	/**
	 * java.lang Interface Iterable<T> 
	 * Type Parameters: 
	 * T - the type of elements returned by the iterator
	 * 
	 */

	public static void method(){
		Iterable<Integer> iterable = new Iterable<Integer>() {
			@Override
			public Iterator<Integer> iterator() {
				return null;
			}
		};
		iterable.iterator();
		//Returns an iterator over elements of type T.
	}
	
	
}
