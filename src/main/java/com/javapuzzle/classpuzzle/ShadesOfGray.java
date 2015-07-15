package com.javapuzzle.classpuzzle;

/**
 * When a field has the same name as class, and they were called,
 * Field has higher priority than class, likely, they have higher priority than package
 * 
 * Class name should be start with upper case, field name should start with lower case
 * Constant should use ALL_CAPS, package should use lower case
 * 
 * To avoid of conflict between constant and class name, class name should use MixedCase style,
 * just like Uuid. Unfortunately, java use UUID...
 * 
 * @author DeBen
 *
 */
public class ShadesOfGray {

	static class Xy extends X.Y{}
	
//	public static void main(String[] args) {
//		System.out.println(X.Y.Z);
//		System.out.println(((X.Y)null).Z);
//		System.out.println(Xy.Z);
//	}

	public static <T extends X.Y> void main(String[] arg) {
		System.out.println(T.Z);
	}
}

class X {
	static class Y {
		static String Z = "Black";
	}

	static C Y = new C();
}

class C {
	String Z = "White";
}
