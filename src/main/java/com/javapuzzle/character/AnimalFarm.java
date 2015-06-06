package com.javapuzzle.character;

public class AnimalFarm {

	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();

		// + has the higher operate level than ==
		System.out.println("Animals are equal: " + pig == dog);

		// use () when you not sure
		System.out.println("Animals are equal: " + (pig == dog));

		// use equals method but not == to compare string
		System.out.println("Animals are equal: " + pig.equals(dog));
	}

}
