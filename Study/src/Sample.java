import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int n = a.length;
		int pos = 3;
		int b[] = new int[pos];
		int c[] = new int[n - pos];
		// initializing array B
		for (int i = 0; i < pos; i++) {
			b[i] = a[i];
		}

		// initializing array C
		for (int i = 0; i < n - pos; i++) {
			c[i] = a[i + pos];
		}

		System.out.println("" + Arrays.toString(b));
		System.out.println("" + Arrays.toString(c));
	}

}
