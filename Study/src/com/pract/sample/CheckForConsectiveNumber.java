package com.pract.sample;

public class CheckForConsectiveNumber {

	public static void main(String[] args) {

		String arg2 = "90,97,92";
		calculate(arg2);

		String arg = "769";

	}

	private static void calculate(String args) {

		String[] strArray = args.split(",");
		int first = Integer.parseInt(strArray[0]);
		int next = 0;
		boolean test = false;
		for (int t = 1; t < strArray.length; t++) {
			next = Integer.parseInt(strArray[t]);
			if (first == next - 1) {
				System.out.println("Yes conit");
				first = next;
				test = true;

			} else {
				System.out.println("Not conit");
				test = false;
				break;
			}

		}

		if (test) {
			System.out.println("Yes conit");
		} else {
			System.out.println("No conit");

		}

	}
	
	
	

}
