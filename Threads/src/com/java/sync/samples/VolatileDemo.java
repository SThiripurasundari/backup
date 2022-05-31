package com.java.sync.samples;

import java.util.Scanner;

class Processor extends Thread {

	// sometimes the value this variable to cached and never be checked again thread
	// as it assumes that method run is not changing the value and it is just
	// reading it so sometimes it will cache the data to true;to avoid tat use volatile key work 
	//with this voliate keyword its guratnee to work in all machine all java 
	private volatile boolean isRunning = true;

	public void run() {
		while (isRunning) {
			for (int t = 0; t < 10; t++)
				System.out.println("Hello " + t);

		}

	}

	public void shutdown() {
		isRunning = false;
		System.out.println("stopped");
	}

}

public class VolatileDemo {

	public static void main(String[] args) {
		Processor proc = new Processor();
		proc.start();

		Scanner scan = new Scanner(System.in);
		scan.nextLine();

		proc.shutdown();
	}

}
