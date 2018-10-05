package packegeForCollection;

import java.util.ArrayList;
import java.util.Collection;

public class AboutCollection {

	// link:=>
	// http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
	/**
	 * java.util Interface Collection<E>
	 * 
	 * public interface Collection<E> extends Iterable<E>
	 * 
	 * This interface is a member of the Java Collections Framework.
	 * 
	 * 
	 */

	public void method() {
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("name"); // add object
		collection.addAll(collection); //Adds all of the elements 
									//in the specified collection to this collection
		collection.clear(); //Removes all of the elements from this collection
		
		collection.add("google");
		System.out.println(collection.contains("google"));
		//Returns true if this collection contains the specified element.
		
		System.out.println(collection.containsAll(collection));
		//Returns true if this collection contains all of the elements 
													//in the specified collection.
		
		System.out.println(collection.equals("jdbs"));
		//Compares the specified object with this collection for equality.
		
		System.out.println(collection.hashCode());
		//Returns the hash code value for this collection.
		
		System.out.println(collection.isEmpty());
		//Returns true if this collection contains no elements.
		
		System.out.println(collection.iterator());
		//Returns an iterator over the elements in this collection.
		
		System.out.println(collection.parallelStream());
		//Returns a possibly parallel Stream with this collection as its source.
		
		collection.add("jdbs");
		collection.remove("google");
		collection.remove("e");
		//Removes a single instance of the specified element 
									//from this collection, if it is present
		
		collection.retainAll(collection);
		//Retains only the elements in this collection that are contained in the specified collection 
		
		System.out.println(collection.size());
		//Returns the number of elements in this collection.
		
		collection.spliterator();
		//Creates a Spliterator over the elements in this collection.
		
		System.out.println(collection.stream());
		//Returns a sequential Stream with this collection as its source.
		
		collection.toArray();
		//Returns an array containing all of the elements in this collection.
		
		
			
		
	}

}
