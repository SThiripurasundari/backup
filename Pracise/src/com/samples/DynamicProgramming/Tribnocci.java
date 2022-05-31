package com.samples.DynamicProgramming;

public class Tribnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tribonacci(4);

	}

	public static int tribonacci(int n) {

		int a = 0;
		int b = 0;
		int c = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if (n == 0 || n == 1)
			return 0;
		if (n == 2 || n == 3)
			return 1;
		for (int t = 3; t < n; t++) {
			sum = a + b + c;
			System.out.println(sum);
			a = b;
			b = c;
			c = sum;

		}

		return sum;

	}

}
