package com.javapuzzle.expression;

public class LongDivision {

	public static void main(String[] args) {
		// java don't know the exact type of these number, so it use int as
		// default, so this number has overflow
		// default, and multiple them
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		System.out.println(MICROS_PER_DAY);
		System.out.println(MILLIS_PER_DAY);

		// add L, java will use long to multiple these number
		final long MICROS_PER_DAY_1 = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY_1 = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY_1 / MILLIS_PER_DAY_1);
	}

}
