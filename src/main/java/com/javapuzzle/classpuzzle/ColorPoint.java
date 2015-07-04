package com.javapuzzle.classpuzzle;

/**
 * In constructor, do not call method that may be overwrited in subclass
 * pseudoconstructor(readObject,clone) also should not
 * 
 * @author DeBen
 *
 */
class Point {
	private final int x, y;
	private final String name;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		name = makeName(); // 3. invoke subclass method
	}

	protected String makeName() {
		return "[" + x + "," + y + "]";
	}

	@Override
	public final String toString() {
		return name;
	}
}

public class ColorPoint extends Point {
	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y); // 2. Chain to Point constructor
		this.color = color; // 5. initialize blank final --too late
	}

	@Override
	protected String makeName() { // 4. executes before subclass constructor
									// body!
		return super.makeName() + ":" + color;
	}

	public static void main(String[] args) {
		// 1. Invoke subclass constructor
		System.out.println(new ColorPoint(4, 2, "purple"));
	}
}
