package com.javapuzzle.expression;

import java.math.BigDecimal;

public class Change {

	public static void main(String[] args) {
		// not all decimal could be expressed with float
		System.out.println((2.00 - 1.10) + " dollors");

		// use int or long to instead
		System.out.println((200 - 110) + " cents");

		// use BigDecimal to instead, must use BigDecimal(String) constructor
		BigDecimal operator1 = new BigDecimal("2.00");
		BigDecimal operator2 = new BigDecimal("1.10");
		System.out.println(operator1.subtract(operator2) + " dollors");
	}

}
