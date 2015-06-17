package com.javapuzzle.exception;

public class Reluctant {

	// this variable was initialized before constructor,
	// then the constructor will initialize its variable too..
	private Reluctant internalInstanceReluctant = new Reluctant();

	public Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}

	public static void main(String[] args) {
		try {
			Reluctant b = new Reluctant();
			System.out.println("Surprise!");
		} catch (Exception e) {
			System.out.println("I told you so");
		}
	}

}
