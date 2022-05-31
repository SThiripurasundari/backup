package delete;

import java.util.Arrays;

public class Fib {

	public static void main(String[] args) {

		int one = 0;
		int two = 1;

		System.out.println(one);
		System.out.println(two);
		int sum = 0;

		for (int t = 2; t < 10; t++) {

			sum = one + two;
			System.out.println(sum);
			one = two;
			two = sum;

		}

		long[] fib = new long[10];
		fib[0] = 0;
		fib[1] = 1;

		for (int t = 2; t < 10; t++) {
			
			fib[t] = fib[t-1] + fib[t-2];

		}
		System.out.println(" Answer :"+ Arrays.toString(fib));

	}

}
