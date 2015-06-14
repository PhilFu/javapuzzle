package com.javapuzzle.loop;

public class InTheLoop {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;

	public static void main(String[] arg) {
		// All integer will be small or equals to Integer.MAX_VALUE
		// when i changed to Integer.MAX_VALUE, its' next value is
		// Integer.MIN_VALUE
		int count = 0;
		for (int i = START; i <= END; i++) {
			count++;
		}
		System.out.println(count);

		// use long could avoid the overflow of integer
		for (long i = START; i <= END; i++) {
			count++;
		}
		System.out.println(count);
	}
}
