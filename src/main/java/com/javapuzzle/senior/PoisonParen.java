package com.javapuzzle.senior;

public class PoisonParen {

	public static void main(String[] args) {
		int i = -2147483648; // int i = -(2147483648);
		long j = -9223372036854775808L; // long j = -(9223372036854775808L);

		System.out.println(i);
		System.out.println(j);

		// int/long --> float, long --> double
		// these three type of type change is imprecise.
		long x = Long.MAX_VALUE;
		double y = Long.MAX_VALUE;
		long z = Long.MAX_VALUE - 1;

		System.out.println(x == y);
		System.out.println(y == z);
		System.out.println(x == z);
	}

}
