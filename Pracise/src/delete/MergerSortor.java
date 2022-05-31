package delete;

public class MergerSortor {

	public static void main(String[] args) {
		Integer[] data = { 25, 5, 7, 12, 2, 8 };

		new MergerSortor().mergeSoter(data, 0, data.length - 1);

	}

	private void mergeSoter(Integer[] data, int start, int end) {

		if (start < end) {

			int mid = start + ((end - start) / 2);
			mergeSoter(data, start, mid);
			mergeSoter(data, mid + 1, end);
			sort(data, start, mid, end);

		}

	}

	private void sort(Integer[] data, int start, int mid, int end) {

		int leftSize = mid - start + 1;
		int rightSize = end - mid;

		int left[] = new int[leftSize];
		int right[] = new int[rightSize];
		
		
		for(int i=0;i<leftSize;i++)
		{
			left[i] = data[start+i];
		}
		for(int i=0;i<rightSize;i++)
		{
			right[i] = data[mid+1+i];
		}
		
		
		int x=0 ; int y =0;
		int k =start;
		

	}

}
