package com.javapuzzle.library;

import java.util.HashSet;
import java.util.Set;

/**
 * The last number 012 is a octal number, it is equals to 10 in decimal. Don't
 * add 0 before a number
 * 
 * @author DeBen
 *
 */
public class Differences {

	public static void main(String[] args) {
		int[] vals = { 789, 678, 567, 456, 345, 234, 123, 012 };
		Set<Integer> diffs = new HashSet<Integer>();

		for (int i = 0; i < vals.length; i++) {
			for (int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}

		System.out.println(diffs.size());
		System.out.println(diffs);

		for (int i = 0; i < vals.length; i++) {
			System.out.print(vals[i] + " ");
		}
	}

}
