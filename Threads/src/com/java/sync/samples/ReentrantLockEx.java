package com.java.sync.samples;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {

	int count = 0;
	private ReentrantLock entrantLock = new ReentrantLock();
	private Condition cond = entrantLock.newCondition();

	public void increment() {
		for (int t = 0; t < 10000; t++) {
			count++;
		}

	}

	public void incrementOne() throws InterruptedException {
		entrantLock.lock();
		System.out.println("waiting..");
		cond.await();
		System.out.println("woken up ");

		try {
			increment();

		} finally {
			entrantLock.unlock();
		}

	}

	public void incrementTwo() throws InterruptedException {

		Thread.sleep(1000);
		entrantLock.lock();

		System.out.println("presss the return key to continue ");
		new Scanner(System.in).nextLine();
		System.out.println("return key pressed ");

		cond.signal();
		try {
			increment();
		} finally {
			entrantLock.unlock();
		}

	}

	public void finalcall() {

		System.out.println("The final count :" + count);

	}

	public static void main(String[] args) throws InterruptedException {

		ReentrantLockEx sampleLockClass = new ReentrantLockEx();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					sampleLockClass.incrementOne();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		Thread.sleep(100);
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					sampleLockClass.incrementTwo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t2.start();

		t1.join();
		t2.join();

		sampleLockClass.finalcall();

	}

}
