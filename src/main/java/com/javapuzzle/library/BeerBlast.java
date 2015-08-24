package com.javapuzzle.library;

public class BeerBlast {

	static final String COMMAND = "java BeerBlast slave";

	public static void main(String[] args) throws Exception {
		if (args.length == 1 && args[0].equals("salve")) {
			for (int i = 99; i > 0; i--) {
				System.out.println(i + "bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take on down, pass it around,");
				System.out.println((i - 1) + "bottles of beer on the wall");
				System.out.println();
			}
		} else {
			Process process = Runtime.getRuntime().exec(COMMAND);
			int extiValue = process.waitFor();
			System.out.println("exit value = " + extiValue);
		}
	}

}
