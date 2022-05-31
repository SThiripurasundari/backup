package com.samples.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueuePush {
	Queue<Integer> q1;
	Queue<Integer> q2;

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("Pop using queue:" + stack.pop());

		System.out.println("Pop using queue:" + stack.pop());

		StackUsingQueuePush stackQ1 = new StackUsingQueuePush();
		stackQ1.push(1);
		stackQ1.push(2);
		stackQ1.push(3);
		stackQ1.push(4);

		System.out.println("Pop using queue:" + stackQ1.pop());

		System.out.println("Pop using queue:" + stackQ1.pop());

	}

	void push(int data) {

		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();

		q2.add(data);

		while (!q1.isEmpty()) {
			q2.add(q1.peek());

		}

		q1 = q2;
		q2 = new LinkedList<Integer>();

	}

	int pop() {

		return q1.poll();
	}

}
