package com.javapuzzle.classpuzzle;

/**
 * run this class, there will be an error, could not find main method.
 * It means that main() could only receive an array of String.
 * And this String should be java.lang.String, but here we have our String
 * In main() method, String[] is our's String, so JVM could not find main.
 * 
 * We should avoid of use same name in different package. java.sql.Date and java.util.Date
 * is a bad example.
 * 
 * @author DeBen
 *
 */
public class StrungOut {

	public static void main(String[] args) {
		MyString s = new MyString("Hello World");
		System.out.println(s);
	}

}

class MyString {
	private final java.lang.String s;

	public MyString(java.lang.String s) {
		this.s = s;
	}

	@Override
	public java.lang.String toString() {
		return s;
	}
}