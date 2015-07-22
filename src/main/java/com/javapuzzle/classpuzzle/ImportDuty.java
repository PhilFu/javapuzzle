package com.javapuzzle.classpuzzle;

import static java.util.Arrays.toString;

/**
 * Object have a method toString(), it has high priority than static import
 * 
 * @author DeBen
 *
 */
public class ImportDuty {

	public static void main(String[] args) {
		printArgs(1, 2, 3, 4, 5);
	}

	static void printArgs(Object... args) {
		System.out.println(toString(args));
	}
}
