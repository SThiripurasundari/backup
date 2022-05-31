package com.pract.sample;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		System.out.println(new FirstNonRepeatingChar().firstUniqChar3(s));
		System.out.println(s.charAt(new FirstNonRepeatingChar().firstUniqChar3(s)));

	}
	
	
	
	public int firstUniqChar3(String s) {

		// woking code
		char[] chars = s.toCharArray();
		for (int t =0 ;t<chars.length;t++) {
			char c = chars[t];
			int lastIndex = s.lastIndexOf(c);
			if (t == lastIndex)
				return t;
		}
		return -1;

	}

}
