package com.javapuzzle.exception;

import java.io.IOException;

public class Arcane {

	public static void main(String[] args) {
		try {
			System.out.println("Hello World");
		} catch (IOException e) {
			System.out.println("I've never seen println fail!");
		}

		try {

		} catch (Exception e) {
			System.out.println("This can't happen!");
		}
	}

	interface Type1 {
		void f() throws CloneNotSupportedException;
	}

	interface Type2 {
		void f() throws InterruptedException;
	}

	interface Type3 extends Type1, Type2 {

	}
}
