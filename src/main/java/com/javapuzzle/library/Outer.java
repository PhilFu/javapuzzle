package com.javapuzzle.library;

import java.lang.reflect.Constructor;

/**
 * For a non-static inner class, compiler will add a hidden argument to its
 * constructor this argument is its immediately enclosing instance. But when
 * used in reflect, you must manually pass the argument, Class.newInstance()
 * could not implement this, only java.lang.reflect.Constructor could.
 * 
 * Try to avoid of using reflect to create an inner class instance
 * 
 * @author DeBen
 *
 */
public class Outer {

	// Unless you need an immediately enclosing instance, or you should use
	// static inner class first.
	public class Inner {
		@Override
		public String toString() {
			return "Hello World";
		}
	}

	private void greetWorld() throws InstantiationException,
			IllegalAccessException {
		System.out.println(Inner.class.newInstance());
	}

	private void greetWorld2() throws Exception {
		Constructor constructor = Inner.class.getConstructor(Outer.class);
		System.out.println(constructor.newInstance(Outer.this));
	}

	public static void main(String[] args) throws Exception {
		new Outer().greetWorld2();
		new Outer().greetWorld();
	}
}
