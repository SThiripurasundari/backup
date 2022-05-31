package com.samples.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	private  List<Integer> list1 = new ArrayList<Integer>();
	private   List<Integer> list2 = new ArrayList<Integer>();

	public void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random ran = new Random();
		list1.add(ran.nextInt(100));

	}

	public void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random ran = new Random();
		list2.add(ran.nextInt(100));

	}

	public void process() {
		for (int t = 0; t < 1000; t++) {
			stageOne();
			stageTwo();
		}

	}

	public  void main() {
		System.out.println("Starting");
		long start = System.currentTimeMillis();
		process();
		long stop = System.currentTimeMillis();
		System.out.println("Time taken :" + (stop - start));
		System.out.println("List1 size :" + list1.size());
		System.out.println("List1 size :" + list2.size());
	}

}
