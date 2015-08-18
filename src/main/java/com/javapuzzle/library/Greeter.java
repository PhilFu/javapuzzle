package com.javapuzzle.library;

/**
 * System.out and System.err are both PrintStream. and write(int) is the only
 * method that would not flush PrintStream when auto flush was open.
 * 
 * @author DeBen
 *
 */
public class Greeter {

	public static void main(String[] args) {
		String greeting = "Hello World";
		for (int i = 0; i < greeting.length(); i++) {
			System.out.write(greeting.charAt(i));
			System.out.flush();
		}
	}

}
