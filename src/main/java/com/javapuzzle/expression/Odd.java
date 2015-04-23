package com.javapuzzle.expression;

/**
 * % operation: (a/b)*b + (a%b) == a but in java, % will cut the tail of the
 * number, so if % return a non-zero result, the result will have +/- as well as
 * left operator
 * 
 * @author DeBen
 *
 */
public class Odd {

	public static void main(String[] args) {
		int i = -5;
		System.out.println(i % 2);

		System.out.println(isOdd(i));
		System.out.println(isReallyOdd(i));
		System.out.println(isOddMoreEfficient(i));
	}

	/**
	 * if i is negative number, this method will return false result.
	 * 
	 * @param i
	 * @return
	 */
	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	/**
	 * this will be correct
	 * 
	 * @param i
	 * @return
	 */
	public static boolean isReallyOdd(int i) {
		return i % 2 != 0;
	}

	/**
	 * this is much more efficient than before
	 * 
	 * @param i
	 * @return
	 */
	public static boolean isOddMoreEfficient(int i) {
		return (i & 1) != 0;
	}
}
