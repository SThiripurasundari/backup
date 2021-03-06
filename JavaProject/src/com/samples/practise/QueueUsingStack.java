package com.samples.practise;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stc1 = new Stack();
	Stack<Integer> stc2 = new Stack();

	private void enqeue(int data) {

		while (!stc1.isEmpty()) {

			stc2.add(stc1.pop());

		}

		stc1.add(data);

		while (!stc2.isEmpty()) {

			stc1.add(stc2.pop());

		}

	}

	private int deque() {

		return stc1.pop();

	}

	public static void main(String[] args) {

		QueueUsingStack stck = new QueueUsingStack();
		stck.enqeue(1);
		stck.enqeue(2);
		stck.enqeue(3);
		stck.enqeue(4);

		System.out.println(stck.deque());
		System.out.println(stck.deque());

		System.out.println(stck.deque());
		System.out.println(stck.deque());

	}

}
