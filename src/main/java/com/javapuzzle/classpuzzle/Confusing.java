package com.javapuzzle.classpuzzle;

/**
 * Avoid using of overwrite, use different name for different method. But
 * constructor must have the same name, in this case, we could set constructor
 * to private, and offer some public static factory. 
 * If constructor have many parameters, use "Builder" pattern. 
 * If some API force you choose from different overwrited method,
 * change you real parameters to the type of Formal parameter
 * 
 * @author DeBen
 *
 */
public class Confusing {

	private Confusing(Object o) {
		System.out.println("Object");
	}

	// array is also a reference
	private Confusing(double[] dArray) {
		System.out.println("Double array");
	}

	public static void main(String[] args) {
		// There are two steps that overwrite need do:
		// 1. fetch all method or constructor that could be used.
		// 2. choose the most exact one
		// And at the 2nd step, the real param "null" was not used, Java just
		// use formal param Object/Array
		new Confusing(null);
		new Confusing((Object) null);
	}

}
