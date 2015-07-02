package com.javapuzzle.classpuzzle;

import java.util.Calendar;

/**
 * The initialization of Elvis is start by main method. And First, static fields
 * INSTANCE/CURRENT_YEAR will be set default value. second, static fields will
 * be initialization by there's order, so INSTANCE will be initialized, and will
 * call constructor Elvis(), in this method, it used CURRENT_YEAR, need to
 * initialize it, this is a loop, because we are initializing CURRENT_YEAR
 * before, JVM will discard the loop, and wouldn't initialize CURRENT_YEAR in
 * Elvis() method. so CURRENT_YEAR still is 0, beltSize is -1930. After INSTANCE
 * was initialized, CURRENT_YEAR will be initialized as order, but it's too
 * late.
 * 
 * To solve this problem, we need to re-order INSTANCE/CURRENT_YEAR. move
 * CURRENT_YEAR before INSTANCE, then CURRENT_YEAR will be initialized before
 * INSTANCE.
 * 
 * @author DeBen
 *
 */
public class Elvis {

	public static final Elvis INSTANCE = new Elvis();
	private final int beltSize;
	private static final int CURRENT_YEAR = Calendar.getInstance().get(
			Calendar.YEAR);

	private Elvis() {
		beltSize = CURRENT_YEAR - 1930;
		System.out.println(CURRENT_YEAR);
	}

	public int beltSize() {
		return beltSize;
	}

	public static void main(String[] args) {
		System.out
				.println("Elvis wears a size " + INSTANCE.beltSize + " belt.");
		System.out.println(CURRENT_YEAR);
	}

}
