package com.javapuzzle.loop;

public class BigDelight {

	public static void main(String[] args) {
		// Byte.MIN_VALUE is -128, Byte.MAX_VALUE is 127
		// and 0x90 is a hex number, equals to 144
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if (b == 0x90) {
				System.out.println("Joy");
			}
		}
	}

}
