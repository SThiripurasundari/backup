package chapter8;

import java.util.Arrays;

public class QuickSorter {

	public static void main(String[] args) {
		Integer[] data = { 25, 5, 7, 12, 2, 8 };
		new QuickSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}

	public void sort(Integer[] data) {
		System.out.println("Sort() is called ");
		quicksort(data, 0, data.length - 1);
		System.out.println("Sort() is exit ");
	}

	public void quicksort(Integer[] data, int start, int end) {
		System.out.println("quicksort() is called " + start  + ";   " +end );
		if (start < end) {
			int pivotIndex = partition(data, start, end);
			quicksort(data, start, pivotIndex - 1);
			quicksort(data, pivotIndex + 1, end);
		}
	}

	private int partition(Integer[] data, int start, int end) {
		System.out.println("partition() is called " + start  + ":   " +end );
		int pivot = data[end];//18
		int i = start;//25
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) { //3<18
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		System.out.println("result in partition:"+Arrays.toString(data));
		return i;
	}

}
