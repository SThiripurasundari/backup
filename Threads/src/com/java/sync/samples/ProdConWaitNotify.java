package com.java.sync.samples;

import java.util.Scanner;

public class ProdConWaitNotify {

	
	//private Object lock1 = new Object();

	public void producer() throws InterruptedException {
		//synchronized (lock1)
		synchronized (this){
			System.out.println("Started'''");
			// can only be used in syn code block
			//lock1.wait();
			wait();
			System.out.println("Resumed'''");

		}

	}

	public void consumer() throws InterruptedException {
		System.out.println("Inside consumer and waiting ");
		Thread.sleep(2000);
		//synchronized (lock1) {
		synchronized (this){
			System.out.println("Waiting for key to press.. ");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			System.out.println("Return key pressed.. ");
			// if below notify not there then the control will not go back to producer at
			// all
			//lock1.notify();
			notify();
			// Also the sleep will run then only con trol will go back to wait()method
			Thread.sleep(5000);
			System.out.println("Done with control method.. ");
		}

	}

	public static void main(String[] args) throws InterruptedException {

		final ProdConWaitNotify notify = new ProdConWaitNotify();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					notify.producer();
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
					notify.consumer();
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
