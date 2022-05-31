package com.java.semaphore.samples;

import java.util.concurrent.Semaphore;

public class Connections {

	private Connections() {
	}

	private static Connections instance = new Connections();
	private Semaphore semaphore = new Semaphore(10);

	public static Connections getInstance() {

		return instance;
	}

	private int connections = 0;

	public void connect() throws InterruptedException {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			doConnect();
		} finally {

			semaphore.release();
		}
	}

	public void doConnect() throws InterruptedException {

		semaphore.acquire();

		synchronized (this) {
			connections++;
			System.out.println("Current Connections :" + connections);

		}

		Thread.sleep(2000);

		synchronized (this) {
			connections--;
			System.out.println("Current Connections :" + connections);

		}

		semaphore.release();
	}
}
