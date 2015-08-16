package com.javapuzzle.library;

import java.util.Timer;
import java.util.TimerTask;

public class Worker extends Thread {

	private volatile boolean quittingTime = false;

	@Override
	public void run() {
		while (!quittingTime)
			pretendToWork();
		System.out.println("Beer is good");
	}

	private void pretendToWork() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {

		}
	}

	synchronized void quit() throws InterruptedException {
		quittingTime = true;
		join();
	}

	synchronized void keepWorking() {
		quittingTime = false;
	}

	public static void main(String[] args) throws InterruptedException {
		final Worker worker = new Worker();
		worker.start();

		Timer timer = new Timer(true);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				worker.keepWorking();
			}
		}, 500);

		Thread.sleep(400);
		worker.quit();
	}

}
