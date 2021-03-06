package com.samples.practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueuePopPeek {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		/*
		 * System.out.println("Pop using stack:"+ stack.pop());
		 * System.out.println("Pop using stack:"+ stack.peek());
		 * System.out.println("Pop using stack:"+ stack.pop());
		 */

		StackUsingQueuePopPeek stackQ1 = new StackUsingQueuePopPeek();
		stackQ1.push2(1);
		stackQ1.push2(2);
		stackQ1.push2(3);
		stackQ1.push2(4);

		/*
		 * System.out.println("Pop using queue:"+ stackQ1.pop());
		 * System.out.println("Pop using queue:"+ stackQ1.peek());
		 * System.out.println("Pop using queue:"+ stackQ1.pop());
		 */

	}

	void push(int data) {

		q1.add(data);
	}

	void push2(int data) {

		q2.add(data);
		for (int t = 0; t < q1.size(); t++)
			q2.add(q1.poll());

		q1 = q2;
		q2 = new LinkedList<Integer>();

	}

	// return the first element
	int pop() {

		int size = q1.size();
		for (int t = 0; t < size - 1; t++) {
			q2.add(q1.poll());
		}

		int inttemp = q1.poll();

		q1 = q2;
		q2 = new LinkedList<Integer>();

		return inttemp;

	}

	int peek() {
		int size = q1.size();
		for (int t = 0; t < size - 1; t++) {
			q2.add(q1.poll());
		}

		int inttemp = q1.poll();
		q2.add(inttemp);

		q1 = q2;
		q2 = new LinkedList<Integer>();

		return inttemp;

	}

}
