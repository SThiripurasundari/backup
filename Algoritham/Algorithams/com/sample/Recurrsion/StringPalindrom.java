package com.sample.Recurrsion;

public class StringPalindrom {

	public static void main(String[] args) {

		String test = "ABDA";
		System.out.println("Result -" + checkPalid(test, 0, test.length() - 1));
	}

	public static boolean checkPalid(String str, int start, int end) {
		System.out.println(" Check Palid " + str + " : " + start + " : " + end);

		if (start >= end) {
			return true;
		}

		if (str.charAt(start) != str.charAt(end)) {
			return false;
		} else
			return checkPalid(str, start + 1, end - 1);

	}

}
