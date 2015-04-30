package com.javapuzzle.expression;

public class MultiCast {

	// the binary type of -1 is 11111111111111111111111111111110,
	// byte has 8 bits, so when changed to byte, the number is
	// 11111110,
	// but char has 16 bits, byte has sign, so when extended to char, the number is
	// 1111111111111110
	// int has 32 bits, and char has no sign so when extended back to int, the number is
	// 00000000000000000000000011111110, that is 65535
	// remember one: if the number has sign, use sign to extend, if it is char, use no-sign extension
	public static void main(String[] args) {
		System.out.println((int) (char) (byte) -1);
	}

}
