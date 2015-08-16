package com.javapuzzle.library;

import java.util.Timer;
import java.util.TimerTask;

public class AnotherWorker implements Runnable {

	private volatile boolean quittingTime = false;

	public void run() {
		while (quittingTime) {
			pretendToWork();
		}
		System.out.println("Beer is good.");
	}

	private void pretendToWork() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void quit() {
		quittingTime = true;
	}

	synchronized void keepWorking() {
		quittingTime = false;
	}

	public static void main(String[] args) throws InterruptedException {
		final AnotherWorker worker = new AnotherWorker();
		Thread thread = new Thread(worker);
		thread.start();

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
