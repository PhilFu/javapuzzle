package com.javapuzzle.expression;

public class JoyOfHex {

	// left operator is long type, right operator is int type, so it will be
	// expanded to long type. Most importantly, only decimal could use +/- to
	// indicate a positive number, hex and oct are non-sign, if the highest
	// position is not 0, then this hex/oct is positive number. So, the
	// long type of the second operator is 0xffffffffcafebabeL, and the long
	// type of first operator is 0x0000000100000000.
	// Try to avoid of mixin type calculation
	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}

}
