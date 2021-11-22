package Sortierverfahren;

public class Sorting {

	public static void main(String[] args) {
		int[] array = {5, 2, -3, 99, 34, 55, 117, 89, 11, 25};
		BubbleSort.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		int[] array2 = {5, 2, -3, 99, 34, 55, 117, 89, 11, 25};
		SelectionSort.sort(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
	}

}
