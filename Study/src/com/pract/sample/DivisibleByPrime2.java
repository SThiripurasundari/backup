package com.pract.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DivisibleByPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * he question was to find a number that is divisible by only Prime numbers. If
		 * yes then return true or else false. ex- 15: it can be divided by 3, and 3 is
		 * a prime number, then return true. 17: it is a prime itself then returns true.
		 * 18: it can be divided by 6, which is not a prime number, return false.
		 */

		int input = 17;
		System.out.println("Prime number factors " + isDivByPrime(input));
		;

	}

	public static boolean isDivByPrime(int input) {

		List list = getFactors(input);

		System.out.println("Factors :" + list.toString());

		for (Iterator<?> iterator = list.iterator(); iterator.hasNext();) {
			Integer fac = (Integer) iterator.next();

			if (!isPrime(fac)) {
				return false;
			}
		}

		return true;

	}

	public static ArrayList<Integer> getFactors(int input) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x = 2; x <= input; x++) {
			if (input % x == 0) {
				list.add(input / x);
			}
		}
		return list;

	}

	public static boolean isPrime(int n) {
		
		boolean flag = true;
		
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(n + " is prime number");
			}
		} // end of else
		return flag;
	}

}
