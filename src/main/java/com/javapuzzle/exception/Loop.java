package com.javapuzzle.exception;

public class Loop {

	// Don't use exception to break out loop, it will be very slow
	// use exception just in the time you need to handle exception.
	public static void main(String[] args) {
		int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 }, { 1, 2, 3 },
				{ 1, 2, 3, 4 }, { 1 } };
		int successCount = 0;
		try {
			int i = 0;
			while (true) {
				if (thirdElementIsThree(tests[i++])) {
					successCount++;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(successCount);
	}

	private static boolean thirdElementIsThree(int[] a) {
		return a.length >= 3 && a[2] == 3;
	}

}
