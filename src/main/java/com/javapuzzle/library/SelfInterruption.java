package com.javapuzzle.library;

public class SelfInterruption {

	public static void main(String[] args) {
		// call Thread.interrupted() will always clear the interrupt status in
		// current thread
		// Thread.currentThread().interrupt();
		//
		// if (Thread.interrupted()) {
		// System.out.println("Interrupted: " + Thread.interrupted());
		// } else {
		// System.out.println("Not interrupted: " + Thread.interrupted());
		// }

		Thread.currentThread().interrupt();
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("Interrupted: "
					+ Thread.currentThread().isInterrupted());
		} else {
			System.out.println("Not interrupted: "
					+ Thread.currentThread().isInterrupted());
		}
	}

}
