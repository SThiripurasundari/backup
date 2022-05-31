package com.samples.Additional;

public class Permutation {
	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of string
			char ch = str.charAt(i);
			System.out.println("ch :  " + ch);

			// Rest of the string after excluding
			// the ith character

			System.out.println("str.substring(0, i)  :" + str.substring(0, i));
			System.out.println("str.substring(i, 1)  :" + str.substring(i + 1));
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args) {
		String s = "abb";
		printPermutn(s, "");
	}

}
