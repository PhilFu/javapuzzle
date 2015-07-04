package com.javapuzzle.classpuzzle;

import java.util.concurrent.atomic.AtomicLong;

public class Creator {

	public static void main(String[] args) {
		// if we delete the {}, there will be a compile error
		// because this is a "local variable declaration statement"
		// it was not allowed to exists in for/which/do loop, it must
		// be within a block that contains {}.
		for (int i = 0; i < 100; i++) {
			new Creature();
		}
		System.out.println(Creature.numCreated());
	}

}

class Creature {
	private static long numCreated = 0;

	public Creature() {
		numCreated++;
	}

	public static long numCreated() {
		return numCreated;
	}
}

// Creature is not thread safe, in jdk 5, we can use AtomicLong
class CreatureThreadSafe {
	private static AtomicLong numCreated = new AtomicLong();

	public CreatureThreadSafe() {
		numCreated.incrementAndGet();
	}

	public static long numCreated() {
		return numCreated.get();
	}
}