package sort_methods;

public class SelectionSort {

	public void selection(int sort[]) {

		for (int i = 0; i < sort.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < sort.length; j++)
				if (sort[j] < sort[index])
					index = j;

			int smallerNumber = sort[index];
			sort[index] = sort[i];
			sort[i] = smallerNumber;
		}
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
}
