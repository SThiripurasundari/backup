package com.pract.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {

		int[] intA = { 1, 4, 45, 6, 10, 8 };
		int req = 7;
		int diff = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int t = 0; t < intA.length; t++) {
			{
				diff = req - intA[t];
				if (map.containsKey(diff)) {
					System.out.println("at index " + map.get(diff) + " t  :" + t);
				}

				map.put(intA[t], t);

			}

			/*
			 * Set<Integer> set = new HashSet<Integer>(); for (int c = 0; c < intA.length;
			 * c++) { diff = req - intA[c]; if (set.contains(intA[c])) {
			 * System.out.println("Differnece :" + diff + "   data " + intA[c]); }
			 * set.add(diff);
			 * 
			 * }
			 */

		}
	}

}
