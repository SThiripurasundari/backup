package com.samples.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadPoolsExample implements Runnable {

	private int id;

	public ThreadPoolsExample(int id) {
		this.id = id;
	}
	
	public class MainApp {

		public static void main(String[] args) {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			for(int y=0;y<5;y++) {
			executor.submit(new ThreadPoolsExample(y));
			}
			
			executor.shutdown();
			System.out.println("All task completed ...");
			
			try {
				executor.awaitTermination(1, TimeUnit.HOURS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void run() {
		System.out.println("Starting " + id);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("completed " + id);
	}

	
}
