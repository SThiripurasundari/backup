package com.pract.sample;

import java.util.Map;
import java.util.HashMap;

public class RNA {

	private static final Map<Character, Character> map;
	static {
		map = new HashMap<>();
		map.put('C', 'G');
		map.put('G', 'C');
		map.put('T', 'A');
		map.put('A', 'U');
	}

	String  getRNAcomplement(String dna) {
		String rna = "";
		char[] nucleotides = dna.toCharArray();
		for (char nucleotide : nucleotides) {
			rna += map.get(nucleotide);
		}
		
		
		
		return rna;
	}

	public static void main(String[] args) {
		RNA rna = new RNA();
		assert  rna.getRNAcomplement("") == "";

		String inputDNA = "TA";
		
		

		System.out.println(rna.getRNAcomplement(inputDNA));
		
		
	}
	

	

}
