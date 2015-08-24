package com.javapuzzle.senior;

import java.awt.List;
import java.util.Arrays;

public class Pair<T> {

	private final T first;
	private final T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T first() {
		return first;
	}

	public T second() {
		return second;
	}

	public List<String> stringList() {
		return Arrays.asList(String.valueOf(first), String.valueOf(second));
	}

	public static void main(String[] args) {
		Pair pair = new Pair<Object>(23, "skidoo");
		System.out.println(pair.first() + " " + pair.second());
		for (String string : pair.stringList()) {
			System.out.print(string + " ");
		}
	}

}
