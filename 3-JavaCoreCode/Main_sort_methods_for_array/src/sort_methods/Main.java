package sort_methods;

public class Main {

	public static void main(String[] args) {

		int[] arrayForSort = { 12, 454, 655, 76, 32, 5, 3, -1, 43, 0, 45, -343, 3546, 54, 234, 656, 23, 6575, 34 };

		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();

			System.out.println("bubble sort");
		bubbleSort.bubble(arrayForSort);
			System.out.println("insertion sort");
		insertionSort.in(arrayForSort);
			System.out.println("selection sort");
		selectionSort.selection(arrayForSort);
			System.out.println();
		
		
		
		
	}
}
