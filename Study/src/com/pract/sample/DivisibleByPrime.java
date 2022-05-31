package com.pract.sample;

public class DivisibleByPrime {

	public static void main(String[] args) {

		/*
		 * he question was to find a number that is divisible by only Prime numbers. If
		 * yes then return true or else false. ex- 15: it can be divided by 3, and 3 is
		 * a prime number, then return true. 17: it is a prime itself then returns true.
		 * 18: it can be divided by 6, which is not a prime number, return false.
		 */

		int input = 18;
		boolean ans = isDivisible(input);

		System.out.println("ans " + ans);

	}

	private static boolean isDivisible(int input) {

		boolean isDivi = false;
		for (int t = 2; t < input; t++) {

			System.err.println("--"+ t +"  isPrime(t) " +isPrime(t) );
			
			if (isPrime(t) && input % t == 0) {
				System.out.println("IS Prime " + t);

				isDivi = true;
			} 
		}
		return isDivi;

	}

	private static boolean isPrime(int x) {
		boolean isPrime = true;
		for (int t = 2; t < x; t++) {
			if (x % t == 0) {
				System.out.println("Not prime -->" + x + "divided by " + t);
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

}
