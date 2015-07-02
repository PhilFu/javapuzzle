package com.javapuzzle.classpuzzle;

class SpecialDog {
	public static void bark() {
		System.out.print("woof ");
	}
}

// Basenji is a breed of dog that can't bark
class Basenji extends SpecialDog {
	public static void bark() {

	};
}

/**
 * bark() is a static method, and there is no dynamic assign for static method,
 * which means in the compile phase, the program has decided which method will
 * be called. as woofer and nipper are both SpecialDog, so in the compile step,
 * SpecialDog.bark() has been chosen as woofer and nipper's bark() method
 * 
 * Use class name to call static method, like SpecialDog.bark().
 * Do not use instance to call static method, like nipper.bark().
 * 
 * @author DeBen
 *
 */

public class Bark {
	public static void main(String[] arg) {
		SpecialDog woofer = new SpecialDog();
		SpecialDog nipper = new Basenji();

		woofer.bark();
		nipper.bark();
	}

}
