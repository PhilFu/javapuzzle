package com.javapuzzle.classpuzzle;

/**
 * class initialization: first is static field, and these field will be
 * initialized as their's order, so the static block will be run,
 * initializeIfNecessary() will be called, as flag 'initialized' is still not
 * initialized, so it's default value is false, then sum will be calculated, and
 * result is 4950. When Cache.getSum() was called, the sum was calculated again,
 * and result is 9900
 * 
 * @author DeBen
 *
 */
class Cache {
	static {
		initializeIfNecessary();
	}

	private static int sum;

	public static int getSum() {
		initializeIfNecessary();
		return sum;
	}

	private static boolean initialized = false;

	private static synchronized void initializeIfNecessary() {
		if (!initialized) {
			for (int i = 0; i < 100; i++) {
				sum += i;
			}
			initialized = true;
		}
	}
}

public class Client {
	public static void main(String[] args) {
		System.out.println(Cache.getSum());
	}
}
