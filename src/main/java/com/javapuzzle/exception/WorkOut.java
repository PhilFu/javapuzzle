package com.javapuzzle.exception;

public class WorkOut {

	public static void main(String[] args) {
		workHard();
		System.out.println("It's nap time.");
	}

	private static void workHard() {
		try {
			workHard();
		} catch (Exception e) {
			workHard();
		}
	}
}
