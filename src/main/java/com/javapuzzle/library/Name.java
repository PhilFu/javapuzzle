package com.javapuzzle.library;

import java.util.HashSet;
import java.util.Set;

/**
 * Whenever you overwrite equals, you should overwrite hashCode. Or this class
 * will inherit hashCode from Object. Object's hashCode method will return
 * different code to different object.
 * 
 * @author DeBen
 *
 */
public class Name {

	private final String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Name))
			return false;
		Name n = (Name) object;
		return n.first.equals(first) && n.last.equals(last);
	}

	public static void main(String[] args) {
		Set<Name> set = new HashSet<Name>();
		set.add(new Name("Mickey", "Mouse"));
		System.out.println(set.contains(new Name("Mickey", "Mouse")));
	}

}
