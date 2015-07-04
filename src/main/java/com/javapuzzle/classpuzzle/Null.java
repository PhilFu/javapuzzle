package com.javapuzzle.classpuzzle;

/**
 * static method should be called by class name, such as Null.greet()
 * If you use an instance to call, it would be ok, but the instance will be omitted
 * 
 * @author DeBen
 *
 */
public class Null {

	public static void greet() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		((Null) null).greet();
	}

}
