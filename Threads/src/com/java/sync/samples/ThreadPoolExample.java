package com.java.sync.samples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processer implements Runnable {
	private int id = 0;

	Processer(int id) {
		this.id = id;

	}

	@Override
	public void run() {

		System.out.println("Starting..." + id);

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed..." + id);

	}

}

public class ThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService serive = Executors.newFixedThreadPool(1);
		long start = System.currentTimeMillis();
		for (int u = 0; u < 50; u++) {
			serive.submit(new Processer(u));

		}
		// wait for all the thread to complete what they are working on and then
		// shutdown, something similar to join
		serive.shutdown();

		try {
			serive.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken = " + (end - start));
	}

}
