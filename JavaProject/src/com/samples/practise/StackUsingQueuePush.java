package com.samples.practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueuePush {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	private void push(int data) {
		q1.add(data);

	}
	

	private int pop() {
		int size = q1.size();
		for (int t = 0; t < size - 1; t++) {
			q2.add(q1.poll());
		}

		int inttemp = q1.poll();

		q1 = q2;
		q2 = new LinkedList<Integer>();

		return inttemp;


	}

	
	private int peek() {
		int i = 0;
		for (i = 0; i <= q1.size() - 1; i++) {
			System.out.println("Q1  size " + q1.size());
			int data = q1.poll();
			System.out.println("data  -" +data);
			System.out.println("Q1" +q1.toString());
			q2.add(data);
			System.out.println("Q2" +q2.toString());
			System.out.println("Q1  size " + q1.size());
		}

		int data = q1.poll();
		q2.add(data);
		q1 = q2;
		q2 = new LinkedList<Integer>();

		return data;

	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("Pop using stack:" + stack.pop());
		System.out.println("Pop using stack:" + stack.peek());
		System.out.println("Pop using stack:" + stack.pop());

		StackUsingQueuePush stackQ1 = new StackUsingQueuePush();
		stackQ1.push(1);
		stackQ1.push(2);
		stackQ1.push(3);
		stackQ1.push(4);

		System.out.println("Pop using queue:" + stackQ1.pop());
		System.out.println("Pop using queue:" + stackQ1.peek());
		System.out.println("Pop using queue:" + stackQ1.pop());

	}

}
