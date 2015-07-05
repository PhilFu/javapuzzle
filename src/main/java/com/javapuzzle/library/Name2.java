package com.javapuzzle.library;

import java.util.HashSet;
import java.util.Set;

/**
 * We want to overwrite equals, but we overload it. Because equals receive an
 * Object parameter, ours equals' parameter is Name2, Set will call default
 * equals method to check if they are equal.
 * 
 * Object's equals method will compare the reference, and so they are not same.
 * use annotation @Override to ensure that you override a method, if not, there
 * will be a compile error
 * 
 * @author DeBen
 *
 */
public class Name2 {

	private final String first, last;

	public Name2(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Name2 name2) {
		return name2.first.equals(first) && name2.last.equals(last);
	}

	@Override
	public int hashCode() {
		return 31 * first.hashCode() + last.hashCode();
	}

	public static void main(String[] args) {
		Set<Name2> set = new HashSet<Name2>();
		set.add(new Name2("Donald", "Duck"));
		System.out.println(set.contains(new Name2("Donald", "Duck")));
	}

}
