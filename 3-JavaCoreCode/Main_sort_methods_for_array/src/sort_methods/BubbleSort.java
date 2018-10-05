package sort_methods;

public class BubbleSort {

	public void bubble(int[] sort) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < sort.length - 1; j++) {
				if (sort[j] < sort[j + 1]) // change to > for ascending sort
				{
					temp = sort[j]; // swap elements
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}

		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}

}
