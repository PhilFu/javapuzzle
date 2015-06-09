package com.javapuzzle.character;

import java.util.Random;

public class Rhymes {

	private static Random rnd = new Random();

	public static void main(String[] args) {
		StringBuffer word = null;
		
		switch (rnd.nextInt(2)) {	// this random number will be 0 or 1, and never be 2 
		case 1:
			word = new StringBuffer('P');
			break;
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('M');
		}

		// StringBuffer has 3 constructors, no args, String args, init capacity args
		word.append('a');
		word.append('i');
		word.append('n');
		System.err.println(word);
		
		System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
		
		String[] a = {"Main", "Pain", "Gain"};
		System.out.println(randomElement(a));
	}
	
	private static String randomElement(String[] a) {
		return a[rnd.nextInt(a.length)];
	}

}
