package Visualizer;

public class Algorithms {
	
	public static void BubbleSort(int[] array, Visualizer v) {
		boolean swapped = true;
		int j = 0;
		int temp;

		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length - j; ++i) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
				
				v.CurrentIndex = i + 1;
				v.Refresh();
			}
		}
	}
	
	public static void SelectionSort(int[] array, Visualizer v) {
		
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min])
				{
					min = j;
				}
			
			// Swap
			int k = array[min];
			array[min] = array[i];
			array[i] = k;
			
			v.CurrentIndex = i + 1;
			v.Refresh();
		}
	}
	
	public static void InsertionSort(int[] array, Visualizer v) {
		
		int key, j;
		for (int i = 1; i < array.length; i++)
		{
			key = array[i];
			j = i - 1;

			while (j >= 0 && array[j] > key)
			{
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
			
			v.CurrentIndex = i;
			v.Refresh();
		}
	}
}
