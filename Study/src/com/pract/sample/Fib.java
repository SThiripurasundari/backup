package com.pract.sample;

public class Fib {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13,21

		int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 26 };

		int sum = 0;
		int first = 0; //
		int next = 1;

		System.out.println(first);
		System.out.println(next);
		for (int t = 1; t < 10; t++) {
			sum = first + next;
			System.out.println(sum);
			first = next;
			next = sum;

		}

		// in case we need to not use recurrsion then count =10; if(count>0){

		int[] fib = new int[10];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < 10; ++i) {
			fib[i] = fib[i - 2] + fib[i - 1];
		}
		System.out.println("fib" + fib);

	}

}
