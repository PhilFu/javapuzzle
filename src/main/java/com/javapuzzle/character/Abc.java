package com.javapuzzle.character;

public class Abc {

	public static void main(String[] args) {
		// Object.toString(): return a characters,
		// contains: the class type of the object, @, hashcode of the object
		String letter = "ABC";
		char[] numbers = { '1', '2', '3' };
		System.out.println(letter + " easy as " + numbers);

		System.out.println(letter + " easy as " + String.valueOf(numbers));

		System.out.println(letter + " easy as ");
		System.out.println(numbers);
	}

}
