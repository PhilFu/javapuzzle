package com.javapuzzle.exception;

import com.javapuzzle.exception.Arcane.Type3;

public class Arcane3 implements Type3 {

	public void f() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		Type3 t3 = new Arcane3();
		t3.f();
	}

}
