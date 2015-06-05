package com.javapuzzle.expression;

public class DosEquis {

	public static void main(String[] args) {
		// ensure the second and third operator are in the same type
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);

		// += will change the result type to the left operator type,
		// don't use byte/short/char with +=,-=,and so on
		short y = 0;
		int z = 123456;
		y += z;
		System.out.println(y);
		
		Object m = "buy";
		String n = "Efficient Java";
		m = m + n;
		System.out.println(m);

		System.out.println("2 + 2 = " + 2 + 2);
	}

}
