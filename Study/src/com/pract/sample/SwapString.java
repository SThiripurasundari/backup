package com.pract.sample;

public class SwapString {

	public static void main(String[] args) {

		String test1 = "ABC";
		String test2 = "XYZ1";

		test1 = test1 + test2; // ABCXYZ1

		test2 = test1.substring(0, (test1.length() - test2.length()));
		System.out.println("test2 :" + test2);

		test1 = test1.substring(test2.length(), test1.length());
		System.out.println("test1 :" + test1);

	}

}
