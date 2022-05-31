package com.samples.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// new Worker3().main();

		final Producer producer = new Producer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("Inside runmehod ");
					producer.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		/*
		 * //public static void main(String[] args) { ExecutorService executor =
		 * Executors.newFixedThreadPool(2); for(int y=0;y<5;y++) { executor.submit(new
		 * ThreadPoolsExample(y)); }
		 * 
		 * executor.shutdown(); System.out.println("All task completed ...");
		 * 
		 * try { executor.awaitTermination(1, TimeUnit.HOURS); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } //}
		 */

	}

}
