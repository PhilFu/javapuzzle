package com.javapuzzle.classpuzzle;

/**
 * Sub-class method's modifier should not be narrower than base class
 * so getClassName() can't be private or protected, or there will be a compiler error.
 * But Sub-class field's modifier could be narrower than base's, so in Derived class,
 * className is private. This will hidden the base class's field. If you want to access it,
 * you must change Derived's instance to Base, and then access className.
 * 
 * But you should avoid of doing this, because it run afoul of Liskov Substitution Principle.
 * It means that whatever you do with base class, it should be also do with sub-class.
 * 
 * @author DeBen
 *
 */

class Base {
	public String className = "Base";

	public String getClassName() {
		return "Base";
	}
}

class Derived extends Base {
	private String className = "Derived";

	@Override
	public String getClassName() {
		return "Derived";
	}
}

public class PrivateMatter {

	public static void main(String[] args) {
		System.out.println(new Derived().className);
		System.out.println(((Base) new Derived()).className);
		System.out.println(new Derived().getClassName());
	}

}
