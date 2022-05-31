package com.samples.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker2 {

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	public void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random ran = new Random();
		list1.add(ran.nextInt(100));

	}

	public synchronized void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random ran = new Random();
		list2.add(ran.nextInt(100));

	}

	public synchronized void process() {
		for (int t = 0; t < 1000; t++) {
			stageOne();
			stageTwo();
		}

	}

	public void main() {
		System.out.println("Starting");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();

			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		long stop = System.currentTimeMillis();
		System.out.println("Time taken :" + (stop - start));
		System.out.println("List1 size :" + list1.size());
		System.out.println("List1 size :" + list2.size());
	}

}
