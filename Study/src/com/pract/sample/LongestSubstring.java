package com.pract.sample;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = { "abc", "ab", "abcd" };
		LongestSubstring string = new LongestSubstring();
		String result =string.getString(test);
		System.out.println("result :"+result);

	}

	public String getString(String[] args) {
		String result = "";

		String firdtSt = args[0];
		for (int t = 0; t <=firdtSt.length(); t++) {
			for (int y = t + 1; y <= firdtSt.length(); y++) {

				String stem = firdtSt.substring(t, y);
				System.out.println("Stem ----" + stem);

				int k = 1;
				for (k = 1; k < args.length; k++) {
					if (!args[k].contains(stem)) {
						System.err.println("yes   " + stem + "  :  " + args[k]);
						break;
					}

				}

				if (k == args.length && (result.length() < stem.length())) {
					System.out.println("inside the final "+result);
					System.out.println("inside the final "+stem);
					result = stem;
				}

			}

		}

		return result;
	}

}
