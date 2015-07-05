package com.javapuzzle.library;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Puzzle60 {

	public static <E> List<E> withoutDUplicates(List<E> original) {
		return new ArrayList<E>(new LinkedHashSet<E>(original));
	}

	static String[] parase(String string) {
		return string.split(",\\S*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
