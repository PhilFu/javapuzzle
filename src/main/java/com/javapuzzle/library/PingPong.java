package com.javapuzzle.library;

/**
 * Before a static synchronized method run, it will get a lock called monitor
 * lock that related to its' class. In this example, main method will get
 * PingPong's monitor lock, so the second thread could not run until that lock
 * was released. It means that when the main method print "Ping", it will
 * release monitor lock, then the second thread could get the lock, an pong()
 * method will be called, then it will print "Pong".
 * 
 * The same thread could repeat to get the same lock
 * 
 * @author DeBen
 *
 */
public class PingPong {

	public static synchronized void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				pong();
			}
		};

		thread.start();
		System.out.println("Ping");
	}

	static synchronized void pong() {
		System.out.println("Pong");
	}
}
