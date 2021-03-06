package com.samples.practise;

import java.util.Arrays;
import java.util.Stack;

public class StackImpl {

	int top = -1;
	int[] dataArray = new int[3];

	public StackImpl() {
		super();

	}

	public void push(int data) {

		if (dataArray.length - 1 == top) {
			System.out.println("Stack Full - data " + data + "not uploaded in tsack ");
			return;
		}

		dataArray[++top] = data;
		System.err.println("Arrays " + Arrays.toString(dataArray));

	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		} else
			return false;

	}

	public int peek() {

		if (isEmpty()) {

			throw new RuntimeException("Stack is empty");

		} else

			System.out.println("top :" + top);
		return dataArray[top];

	}

	public int pop() {

		if (isEmpty()) {

			throw new RuntimeException("Stack is empty");

		} else {

			System.out.println("top in pop:" + top);
			int data = dataArray[top--];

			return data;

		}

	}

	public static void main(String[] args) {
		Stack<Integer> original = new Stack();
		StackImpl duplicate = new StackImpl();

		original.push(1);
		original.push(2);
		original.push(3);

		System.out.println("pop :" + original.pop());
		System.out.println("pop :" + original.pop());
		System.out.println("peek " + original.peek());
		System.out.println("peek  :" + original.peek());
		System.out.println("pop :" + original.pop());

		duplicate.push(1);
		duplicate.push(2);
		duplicate.push(3);
		duplicate.push(4);

		// System.out.println("duplicate :" + duplicate.pop());
		// System.out.println("duplicate :" + duplicate.pop());
		System.out.println("duplicate :" + duplicate.peek());
		System.out.println("duplicate :" + duplicate.peek());
		System.out.println("duplicate :" + duplicate.peek());
		System.out.println("duplicate :" + duplicate.pop());
		System.out.println("duplicate :" + duplicate.pop());
		System.out.println("Orig :" + original.toString());

	}

}
