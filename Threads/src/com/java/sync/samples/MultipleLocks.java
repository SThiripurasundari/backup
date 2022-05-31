package com.java.sync.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class MultipleLocks {

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	// public synchronized void methodOne() throws InterruptedException {

	public void methodOne() throws InterruptedException {

		synchronized (lock1) {
			Thread.sleep(1);
			list1.add(random.nextInt(100));
		}

	}

	// public synchronized void methodTwo() throws InterruptedException {
	public void methodTwo() throws InterruptedException {
		synchronized (lock2) {
			Thread.sleep(1);
			list2.add(random.nextInt(100));
		}
	}

	public void process() throws InterruptedException {
		System.out.println("calling process");
		for (int t = 0; t < 10000; t++) {
			methodOne();
			methodTwo();
		}

	}

	public void main() throws InterruptedException {

		System.out.println("Starting...");
		long start = System.currentTimeMillis();

		Thread T1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread T2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		T1.start();
		T2.start();

		T1.join();
		T2.join();

		long end = System.currentTimeMillis();
		System.out.println("Time taken = " + (end - start));
		System.out.println("List 1 size = " + list1.size());
		System.out.println("List 2 size = " + list2.size());

	}

}
