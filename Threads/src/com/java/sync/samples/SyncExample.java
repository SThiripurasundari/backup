package com.java.sync.samples;

public class SyncExample {

	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		SyncExample ex = new SyncExample();
		ex.doWork();
	}

	public synchronized void doIncrement() {
		count++;

	}

	public void doWork() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int t = 0; t < 10000; t++) {

					// moving this part of code to new method and making it as synchronised
					// count++;
					doIncrement();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int t = 0; t < 10000; t++) {
					//
					// count++;

					doIncrement();
				}

			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Count is :" + count);
	}

}
