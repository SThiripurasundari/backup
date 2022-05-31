package com.java.sync.samples;

import java.util.LinkedList;

public class LowLevelProdConsumer {

	private static LinkedList<Integer> list = new LinkedList<Integer>();
	private static Object lock = new Object();

	private static void producer() throws InterruptedException {
		int count = 0;

		while (true) {
			synchronized (lock) {

				while (list.size() == 10) {
					// dont add in the list
					lock.wait();
				}
				list.add(count++);
				lock.notify();
			}
		}
	}

	private static void consumer() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				while (list.isEmpty()) {
					lock.wait();
				}
				System.out.print("list size is  " + list.size());
				int t = list.removeFirst();

				System.out.println("  vaue of t :" + t);
				lock.notify();
			}
			Thread.sleep(200);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
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
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
