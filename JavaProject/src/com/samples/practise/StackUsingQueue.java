package com.samples.practise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {

	Queue<Integer> q1;
	Queue<Integer> q2;

	public StackUsingQueue() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}

	public void push(int data) {
		q2.add(data);
		while (!q1.isEmpty()) {
			q2.add(q1.poll());

		}
		q1 = q2;
		q2 = new LinkedList<Integer>();

	}

	public int pop() {

		return q1.poll();
	}
	
	public int peek()
	{
		return q1.peek();
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.err.println(" " + stack.pop());
		System.err.println(" " + stack.pop());
		System.err.println(" " + stack.pop());
		System.err.println(" " + stack.pop());
		

		StackUsingQueue sq = new StackUsingQueue();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.push(4);

		System.err.println(sq.pop());
		System.err.println(sq.pop());
		System.err.println(sq.peek());
		System.err.println(sq.pop());

	}

}
