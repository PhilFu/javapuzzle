package com.javapuzzle.loop;

public class Loop {

	public static void main(String[] args) {
		// double i = 1.0e40;
		// while (i == i + 1) {
		// System.out.println("here");
		// }
		//
		// double j = 1.0 / 0.0;
		// while (j == j + 1) {
		// System.out.println("here");
		// }

		// ulp: unit in the last place
		// i == i + 1
		// if ulp is larger than 1, this expression is true
		double d = 1.0 / 0.0;
		System.out.println(Math.ulp(d));
		System.out.println(d + 1.0);
		System.out.println("d is equals to d + 1000: " + (d == d + 1000));

		// i != i
		// if i is NaN, this expression is true
		// only float and double has NaN
		double e = 0.0 / 0.0; // equals to double e = Double.NaN
		System.out.println(e);
		System.out.println(e + 10000);
		System.out.println("e is equals to e: " + (e == e));

		// i != i + 0
		// if i is a String, this expression is true
		String s = "abcdefg";
		System.out.println(s != s + 0);

	}

}
