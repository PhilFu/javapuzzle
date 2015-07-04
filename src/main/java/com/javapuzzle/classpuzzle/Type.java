package com.javapuzzle.classpuzzle;

public class Type {
	public static void main(String[] args) {
		String string = null;
		System.out.println(string instanceof String);

		System.out.println(new Type() instanceof String);

		Type type = (Type) new Object();
	}
}
