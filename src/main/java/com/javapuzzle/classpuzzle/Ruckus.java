package com.javapuzzle.classpuzzle;

class Counter {
	// static field will be shared with its child
	private static int count;

	public static void increment() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}

class Dog extends Counter {
	public Dog() {

	}

	public void wolf() {
		increment();
	}
}

class Cat extends Counter {
	public Cat() {

	}

	public void meow() {
		increment();
	}
}

public class Ruckus {

	public static void main(String[] args) {
		Dog[] dogs = { new Dog(), new Dog() };
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].wolf();
		}

		Cat[] cats = { new Cat(), new Cat(), new Cat() };
		for (int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}

		System.out.print(Dog.getCount() + " woofs and ");
		System.out.println(Cat.getCount() + " meows");
	}

}
