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
		// if ulp is larger than 1, this expression will be true.
		double d = 1.0 / 0.0;
		System.out.println(Math.ulp(d));
		System.out.println(d + 1.0);
		System.out.println("d is equals to d + 1000: " + (d == d + 1000));

		// i != i
		// if i is NaN, this expression will be true.
		// only float and double has NaN
		double e = 0.0 / 0.0; // equals to double e = Double.NaN
		System.out.println(e);
		System.out.println(e + 10000);
		System.out.println("e is equals to e: " + (e == e));

		// i != i + 0
		// if i is a String, this expression will be true.
		String s = "abcdefg";
		System.out.println(s != s + 0);

		// while (i != 0) {
		// i >>>= 1;
		// }
		// if short/byte i = -1, this expression will be true.
		// first i != 0, it will enter the loop, second, i will be
		// expanded to int 0xffffffff, then shift right to 0x7fffffff
		// finally, i will be cut to short/byte again, still is ffff.

		// i <= j && j <= i && i != j
		// if i,j is Integer/Long and so on, the expression will be true.
		System.out.println(new Integer(0) == new Integer(0));
		System.out.println(new Integer(0) == 0);

		// i != 0 && i == -i
		// if i is Integer.MIN_VALUE or Long.MIN_VALUE, the expression will be
		// true
		System.out.println((Integer.MIN_VALUE) == (-Integer.MIN_VALUE));
		System.out.println((Long.MIN_VALUE) == (-Long.MIN_VALUE));
		System.out.println((Short.MIN_VALUE) == (-Short.MIN_VALUE));
		System.out.println((Byte.MIN_VALUE) == (-Byte.MIN_VALUE));

		System.out.println((float) 2000000000 == 2000000050);
	}

}
