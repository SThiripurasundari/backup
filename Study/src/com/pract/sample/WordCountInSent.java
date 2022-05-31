package com.pract.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCountInSent {

	public static void main(String[] args) {
		sentence();
		words();

	}

	private static void words() {
		String word = "TESTTTE";
		HashMap<Character, Integer> baseMap = new HashMap();

		for (int t = 0; t < word.length(); t++) {
			char c = word.charAt(t);
			if (baseMap.containsKey(c)) {
				int test = baseMap.get(c);
				baseMap.put(c, test + 1);

			} else {
				baseMap.put(c, 1);
			}

		}
		
		Iterator it = baseMap.keySet().iterator();
		
		while(it.hasNext())
		{
			char c = (char) it.next();
			System.out.print("key "+c);
			System.out.println("value "+baseMap.get(c));
		}
		

	}

	private static void sentence() {

		String str = "This is is done by Saket Saket ";

		String[] strArray = str.split(" ");

		System.out.println("strArray -->" + Arrays.toString(strArray));
		HashMap<String, Integer> baseMap = new HashMap();

		for (int t = 0; t < strArray.length; t++) {
			if (baseMap.containsKey(strArray[t])) {
				int test = baseMap.get(strArray[t]);
				baseMap.put(strArray[t], test + 1);

			} else {
				baseMap.put(strArray[t], 1);
			}

		}

		System.out.println("Size :" + baseMap.size());

		Set<String> entry = baseMap.keySet();
		Iterator<String> it = entry.iterator();

		while (it.hasNext()) {
			String c = it.next();
			System.out.println("--input-" + c);
			System.out.println("--output-" + baseMap.get(c));

		}
		for (String c : entry) {
			System.out.print(c + ": ");
			System.out.println(baseMap.get(c));

		}

	}

}
