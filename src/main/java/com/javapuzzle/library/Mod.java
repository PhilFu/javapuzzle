package com.javapuzzle.library;

/**
 * 补码具有不对称性， Integer.MIN_VALUE and Long.MIN_VALUE have no abs in Math.abs.
 * Math.abs will return it's original value in this case.
 * 
 * @author DeBen
 *
 */
public class Mod {

	public static void main(String[] args) {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		int i = Integer.MIN_VALUE;
		do {
			histogram[Math.abs(i) % MODULUS]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++) {
			System.out.println(histogram[j] + "");
		}
	}

}
