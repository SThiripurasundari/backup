package com.samples.DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class FirstUniqueInString {

	public static void main(String[] args) {

		System.out.println(firstUniqChar("HELLO"));
	}

	public int firstUniqChar3(String s) {

		// woking code
		for (char c : s.toCharArray()) {
			int index = s.indexOf(c);
			int lastIndex = s.lastIndexOf(c);
			if (index == lastIndex)
				return index;
		}
		return -1;

	}

	public int firstUniqChar2(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.get(c) == 1)
				return i;
		}
		return -1;

	}

	public static int firstUniqChar(String s) {

		if (s == null || s.length() == 0) {
			return -1;
		}
		char[] chars = s.toCharArray();
		
		Map<Character, Integer> charsPositions = new HashMap<>();
		List<Integer> uniqsPositions = new ArrayList<>();
		
		
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];

			if (charsPositions.containsKey(c)) {
				Integer charFirstPosition = charsPositions.get(c);
				uniqsPositions.remove(charFirstPosition);
			} else {
				charsPositions.put(c, i);
				uniqsPositions.add(i);
			}
		}
		return uniqsPositions.isEmpty() ? -1 : uniqsPositions.get(0);
	}

}
