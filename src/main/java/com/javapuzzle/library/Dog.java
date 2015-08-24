package com.javapuzzle.library;

public class Dog extends Exception {
	public static final Dog INSTANCE = new Dog();

	private Dog() {

	}

	@Override
	public String toString() {
		return "Woof";
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
}
