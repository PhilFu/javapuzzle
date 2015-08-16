package com.javapuzzle.classpuzzle;

/**
 * For final method, you could not override it. For final field, it could not be
 * initialized more than once, but you could override it..
 * 
 * @author DeBen
 *
 */
class Jeopardy {
	public static final String PRIZE = "$64,000";
}

public class DoubleJeopardy extends Jeopardy {
	public static final String PRIZE = "2 cents";

	public static void main(String[] args) {
		System.out.println(DoubleJeopardy.PRIZE);
	}
}
