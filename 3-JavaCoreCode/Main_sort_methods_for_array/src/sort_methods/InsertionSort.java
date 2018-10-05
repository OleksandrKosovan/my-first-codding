package sort_methods;

public class InsertionSort {

	public void in(int sort[]) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < sort.length; j++) { // Start with 1 (not 0)
			key = sort[j];
			for (i = j - 1; (i >= 0) && (sort[i] < key); i--) { // Smaller
																// values
																// are moving up
				sort[i + 1] = sort[i];
			}
			sort[i + 1] = key; // Put the key in its proper location
		}
		for (int k = 0; k < sort.length; k++) {
			System.out.println(sort[k]);
		}
	}
}
