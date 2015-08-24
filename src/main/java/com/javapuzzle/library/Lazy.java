package com.javapuzzle.library;

/**
 * Make it simple to initialize class
 * 
 * @author DeBen
 *
 */
public class Lazy {

	private static boolean initialized = false;

	static {
		Thread thread = new Thread(new Runnable() {

			public void run() {
				initialized = true;
			}
		});
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			throw new AssertionError(e);
		}
	}

	public static void main(String[] args) {
		System.out.println(initialized);
	}

}
