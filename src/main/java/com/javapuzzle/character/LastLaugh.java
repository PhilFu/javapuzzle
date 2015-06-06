package com.javapuzzle.character;

public class LastLaugh {

	public static void main(String[] args) {
		// At least one operator is String, + will concat the String,
		// otherwise, this is a add opeartion
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
		System.out.println("" + 'H' + 'a');
		System.out.printf("%c%c", 'H', 'a');
	}

}
